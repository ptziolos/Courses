package com.robotframework.java.keywords;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.robotframework.javalib.library.AnnotationLibrary;
import org.robotframework.remoteserver.RemoteServer;

import java.util.ArrayList;
import java.util.List;

public class KeywordRemoteLibrary extends AnnotationLibrary {

    private static final Logger logger = LoggerFactory.getLogger(KeywordRemoteLibrary.class);
    static List<String> includePatterns = new ArrayList<String>() {{
        add("com/robotframework/java/keywords/*.class");
    }};

    public KeywordRemoteLibrary() {
        super(includePatterns);
    }

    public static void main(String[] args) {
        logger.info("Remote Server Started");
        RemoteServer server = new RemoteServer("127.0.0.1", 8270);
        server.putLibrary("/RPC2", new KeywordRemoteLibrary());
        try {
            server.start();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}