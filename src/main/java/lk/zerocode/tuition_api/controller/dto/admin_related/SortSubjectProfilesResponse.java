package lk.zerocode.tuition_api.controller.dto.admin_related;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class SortSubjectProfilesResponse {
    private String subjectProfileId;


    public String getSubjectProfileId() {
        return subjectProfileId;
    }

    public void setSubjectProfileId(String subjectProfileId) {
        this.subjectProfileId = subjectProfileId;
    }
}
