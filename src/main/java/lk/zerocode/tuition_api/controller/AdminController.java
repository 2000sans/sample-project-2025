package lk.zerocode.tuition_api.controller;

import lk.zerocode.tuition_api.controller.dto.admin_related.AdminLoginRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {

    @PostMapping("/admins/admin-sign-in")
    void adminSignIn(@RequestBody AdminLoginRequest rq){
        System.out.println("`/admins/admin-sign-in POST` got triggered");
    }

    @GetMapping("/admins/view-admin-profile")
    void viewAdminProfile(){
        System.out.println("`/admins/view-admin-profile GET` got triggered");
    }

    // new comment added

}
