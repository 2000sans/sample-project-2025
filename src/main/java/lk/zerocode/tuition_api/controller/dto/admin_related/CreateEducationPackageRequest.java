package lk.zerocode.tuition_api.controller.dto.admin_related;

import java.util.List;

public class CreateEducationPackageRequest {

    private String adminId;
    private String packageName;
    private Double packageValue;
    private Double admissionValue;
    private Double rentalValue;
    private Float instituteAdmissionPercentage;
    private List<Object> correspondingAdditionalInfo;

}
