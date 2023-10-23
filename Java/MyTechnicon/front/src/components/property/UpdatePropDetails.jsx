import axios from "axios";
import React, { useEffect, useState } from "react";
import { Modal, Form, Button, Row } from 'react-bootstrap';

export default function UpdateCustDetails({ showModal, toggleModal, propertyId }) {

  const [property, setProperty] = useState({
    id: "",
    pin: "",
    address: "",
    constructionYear: "",
    propertyType: "",
    propertyPictureUrl: "",
    propertyLongitude: "",
    propertyLatitude: "",
    active: "",
    user: {
      id: "",
      tin: "",
      name: "",
      surname: "",
      address: "",
      phone: "",
      username: "",
      email: "",
      password: "",
      roles: []
    },
  });


  const { 
    pin, 
    address, 
    constructionYear, 
    propertyType, 
    propertyPictureUrl, 
    propertyLongitude, 
    propertyLatitude, 
    active, 
    user} = property;

    const onInputChange = (e) => {
        const { name, value } = e.target;
        setProperty((prevState) => ({
          ...prevState,
          [name]: value,
        }));
      };

  
  useEffect(() => {
    if (propertyId) {
        loadProperty();
    }
  }, [propertyId]);

  const onClick = async (e) => {
    e.preventDefault();
    console.log("Submitting form...");
    try {
      await axios.put(`http://localhost:8080/properties`, property);
      toggleModal();
      window.location.reload();
      console.log("Property successfully updated!");
    } catch (error) {
      if (error.response.status === 500) {
        alert("An error occurred. Please try again.");
      } else {
        alert("An error occurred. Please try again.");
      }
    }
  };
  

  const loadProperty = async () => {
    try {
      const result = await axios.get(`http://localhost:8080/properties/${propertyId}`);
      setProperty(result.data);
    } catch (error) {
      console.error("Error fetching user data:", error);
    }
  };
  return (
    <>
      <Modal className='modal' show={showModal} onHide={toggleModal}>
      <Modal.Header closeButton>
      <Modal.Title>Property Details</Modal.Title>
      </Modal.Header>
      <Modal.Body>
      <Form className='modal-form'>

              <Row>
                  <Form.Group controlId="pinNumber">
                    <Form.Label>Property Identification Number</Form.Label>
                    <Form.Control
                      type="number"
                      placeholder="PIN: e.g. 19991109"
                      value={pin}
                      name="pin"
                      onChange={(e) => onInputChange(e)}
                    />
                  </Form.Group>
              </Row>
              <Row>
                <Form.Group controlId="address">
                  <Form.Label>Address</Form.Label>
                  <Form.Control
                    type="text"
                    placeholder="e.g. Example street 123, Athens, Greece"
                    value={address}
                    name="address"
                    onChange={(e) => onInputChange(e)}
                  />
                </Form.Group>
            </Row>
            <Row>
                <Form.Group controlId="yearOfConstruction">
                  <Form.Label>Year of construction</Form.Label>
                  <Form.Control
                    type="number"
                    placeholder="e.g. Year 1999"
                    value={constructionYear}
                    name="constructionYear"
                    onChange={(e) => onInputChange(e)}
                  />
                </Form.Group>
            </Row>
            <Row>
                <Form.Group controlId="propertyType">
                    <Form.Label>Type of property</Form.Label>
                    <select
                    className="form-control"
                    id="propertyType"
                    name="propertyType"
                    value={propertyType}
                    onChange={(e) => onInputChange(e)}
                    >
                    <option value="">Select type of property</option>
                    <option value="DETACHED_HOUSE">Detached House</option>
                    <option value="MAISONETTE">Maisonette</option>
                    <option value="APARTMENT_BUILDING">Apartment Building</option>
                    </select>
                </Form.Group>
            </Row>

                <Row>
                <Form.Group controlId="propertyPictureUrl">
                  <Form.Label>Picture Url</Form.Label>
                  <Form.Control
                    type={"text"}
                    placeholder="e.g. https://cat-picture.com"
                    value={propertyPictureUrl}
                    name="propertyPictureUrl"
                    onChange={(e) => onInputChange(e)}
                  />
                </Form.Group>
              </Row>
              <Row>
                <Form.Group controlId="propertyCoordinatesLong">
                  <Form.Label>Map Location Long</Form.Label>
                  <Form.Control
                    type="text"
                    placeholder="e.g. Long: 999"
                    value={propertyLongitude}
                    name="propertyLongitude"
                    onChange={(e) => onInputChange(e)}
                  />
                </Form.Group>
              </Row>
              <Row>
                <Form.Group controlId="propertyCoordinatesLat">
                  <Form.Label>Map Location Lat</Form.Label>
                  <Form.Control
                    type="text"
                    placeholder="e.g. Lat: 999"
                    value={propertyLatitude}
                    name="propertyLatitude"
                    onChange={(e) => onInputChange(e)}
                  />
                </Form.Group>
              </Row>
              <Row>
                <Form.Group controlId="activeState">
                  <Form.Label>Active State</Form.Label>
                  <select
                    className="form-control"
                    type="text"
                    placeholder="e.g. active state= true or false"
                    value={active}
                    name="active"
                    onChange={(e) => onInputChange(e)}
                  >
                <option value=''>Choose availability</option>
                <option value='true'>Available</option>
                <option value='false'>Unavailable</option>
                </select>
                </Form.Group>
              </Row>
              <Row>
                <Form.Group controlId="user">
                  <Form.Label>Property Owner</Form.Label>
                  <Form.Control
                    type="text"
                    placeholder="e.g. tin number: 00000"
                    value={user.tin}
                    name="user"
                    onChange={(e) => onInputChange(e)}
                  />
                </Form.Group>
              </Row>
        </Form>
    </Modal.Body>
    <Modal.Footer>
          <div className='button-container' type='submit'>
            <Button className='btn btn-primary' onClick={(e) => onClick(e)}>Update account</Button>
            <Button className='btn btn-secondary' onClick={toggleModal}>Cancel</Button>
          </div>
        </Modal.Footer>
  </Modal>
  </>
  );
}