package lk.zerocode.tuition_api.controller.dto.admin_related;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CreateEducationPackageRequest {

    private String adminId;
    private String packageName;
    private Double packageValue;
    private Double admissionValue;
    private Double rentalValue;
    private Float instituteAdmissionPercentage;
    private List<Object> correspondingAdditionalInfo;

}
