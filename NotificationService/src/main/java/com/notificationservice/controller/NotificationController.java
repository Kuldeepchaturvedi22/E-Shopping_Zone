    package com.notificationservice.controller;


    import com.notificationservice.dto.NotificationDetails;
    import com.notificationservice.service.NotificationServiceImpl;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.RequestBody;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/notification")
    public class NotificationController {

        @Autowired
        private NotificationServiceImpl notificationService;

        @PostMapping("/sendMail")
        public ResponseEntity<?> sendMail(@RequestBody NotificationDetails details){
            System.out.println(details);
            return notificationService.sendMail(details);
        }
        @PostMapping("/register")
        public ResponseEntity<?> registerUser(@RequestBody String email){
            notificationService.registerUser(email);
            return  ResponseEntity.ok("User registered sucessfully and email sent");


        }
    }
