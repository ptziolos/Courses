package com.scytalys.mytechnikon.controller;

import com.scytalys.mytechnikon.domain.Report;
import com.scytalys.mytechnikon.domain.ReportType;
import com.scytalys.mytechnikon.domain.Role;
import com.scytalys.mytechnikon.domain.User;
import com.scytalys.mytechnikon.mapper.UserMapper;
import com.scytalys.mytechnikon.resource.ApiResponse;
import com.scytalys.mytechnikon.resource.LoginResource;
import com.scytalys.mytechnikon.resource.UserResource;
import com.scytalys.mytechnikon.service.ReportService;
import com.scytalys.mytechnikon.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.Date;
import java.util.List;

import static com.scytalys.mytechnikon.encryption.Encryption.getHashCode;
@CrossOrigin("*")
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
//public class UserController extends BaseController<User, UserResource> {
public class UserController {
    private final UserService userService;
    private final UserMapper userMapper;
    private final ReportService reportService;

    private void createUserEmbeddedReport(UserResource userResource, ReportType reportType, String description){
        Report report = new Report();
        report.setReportDate(Date.from(Instant.now()));
        report.setReportType(reportType);
        report.setReportDescription(description);
        report.setUser(userMapper.toDomain(userResource));
        reportService.create(report);
    }

    @PostMapping
    public ResponseEntity<ApiResponse<UserResource>> createUser(@RequestBody UserResource userResource) {
        userResource.setRole(Role.CUSTOMER);
        userResource.setPassword(getHashCode(userResource.getPassword()));
        ResponseEntity<ApiResponse<UserResource>> responseEntity =
                new ResponseEntity<>(ApiResponse.<UserResource>builder().data(userMapper.toResource(
                userService.create(userMapper.toDomain(userResource)))).build(), HttpStatus.CREATED);
        User user = userService.findByEmail(userResource.getEmail());
        String description = "ID: " + user.getId();
        createUserEmbeddedReport(userMapper.toResource(user), ReportType.USER_REGISTRATION, description);
        return responseEntity;
    }

    @PostMapping("/login")
    public ResponseEntity<UserResource> logInUser(@RequestBody LoginResource loginResource) {
        User user = userService.findByUsernameOrEmail(loginResource.getUsername(), loginResource.getEmail());
        String password = getHashCode(loginResource.getPassword());

        if (user != null && password.equals(user.getPassword())) {
            String description = "ID: " + user.getId();
            createUserEmbeddedReport(userMapper.toResource(user), ReportType.USER_LOGIN, description);
            return new ResponseEntity<>(userMapper.toResource(user), HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateUser(@RequestBody UserResource userResource) {
        userService.update(userMapper.toDomain(userResource));
        String description = "ID: " + userMapper.toDomain(userResource).getId();
        createUserEmbeddedReport(userResource, ReportType.USER_UPDATE, description);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable("id") final Long id) {
        UserResource userResource = userMapper.toResource(userService.get(id));
        String description = "ID: " + userMapper.toDomain(userResource).getId();
        createUserEmbeddedReport(userResource, ReportType.USER_DELETION, description);
        userService.deleteById(id);
    }

    @GetMapping
    public ResponseEntity<List<UserResource>> findUsers() {
        return ResponseEntity.ok(userMapper.toResourceList(userService.findAll()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResource> findUserById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(userMapper.toResource(userService.get(id)));
    }

    @GetMapping(params = {"tin"})
    public ResponseEntity<UserResource> findUserByTin(@RequestParam("tin") Long tin) {
        return ResponseEntity.ok(userMapper.toResource(userService.findByTin(tin)));
    }

    @GetMapping(params = {"email"})
    public ResponseEntity<UserResource> findUserByEmail(@RequestParam("email") String email) {
        return ResponseEntity.ok(userMapper.toResource(userService.findByEmail(email)));
    }


}
