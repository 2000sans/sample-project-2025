package lk.zerocode.tuition_api.controller;

import lk.zerocode.tuition_api.controller.dto.admin_related.AdminLoginRequest;
import lk.zerocode.tuition_api.controller.dto.admin_related.CreateEducationPackageRequest;
import lk.zerocode.tuition_api.controller.dto.admin_related.CreateTutorRequest;
import lk.zerocode.tuition_api.controller.dto.admin_related.SortEducationPackagesRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {

    @PostMapping("/admins/admin-sign-in")
    void adminSignIn(@RequestBody AdminLoginRequest rq){
        System.out.println();
        System.out.println("`/admins/admin-sign-in POST` got triggered");
    }

    @GetMapping("/admins/{admin-id}/view-admin-profile")
    void viewAdminProfile(@PathVariable("admin-id") String adminId){
        System.out.println();
        System.out.println("`admins/{admin-id}/view-admin-profile GET` got triggered");
        System.out.println("Admin Id : " + adminId);
    }

    @PostMapping("/admins/{admin-id}/tutors")
    void createTutor(@PathVariable("admin-id") String adminId, @RequestBody CreateTutorRequest rq){
        System.out.println();
        System.out.println("`/admins/{admin-id}/tutors POST` got triggered");
        System.out.println("Admin Id : " + adminId);
    }

    @PostMapping("/admins/{admin-id}/tutors/{tutor-id}/add-subject-profiles")
    void createSubjectProfile(@PathVariable("admin-id") String adminId, @PathVariable("tutor-id") String tutorId, @RequestBody CreateEducationPackageRequest rq){
        System.out.println();
        System.out.println("`/admins/{admin-id}/tutors/{tutor-id}/add-subject-profiles POST` got triggered");
        System.out.println("Admin Id : " + adminId);
        System.out.println("Tutor Id : " + tutorId);

    }

    @PostMapping("/admins/{admin-id}/education-packages")
    void createEducationPackage(@PathVariable("admin-id") String adminId, @RequestBody CreateEducationPackageRequest rq){
        System.out.println();
        System.out.println("`/admins/{admin-id}/education-packages POST` got triggered");
        System.out.println("Admin Id : " + adminId);
    }

    @PostMapping("/admins/{admin-id}/education-packages/filter-packages/")
    void filterEducationPackages(@PathVariable("admin-id") String adminId, @RequestBody SortEducationPackagesRequest rq) {
        System.out.println();
        System.out.println("`/admins/{admin-id}/education-packages/filter-packages/ POST` got triggered");
        System.out.println("Admin Id : " + adminId);
    }



}
