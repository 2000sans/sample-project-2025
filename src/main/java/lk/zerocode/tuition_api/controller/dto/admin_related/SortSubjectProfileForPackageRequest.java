package lk.zerocode.tuition_api.controller.dto.admin_related;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class SortSubjectProfileForPackageRequest {

    String tutorName;
    String subjectName;
    String subjectType;
    String subjectMedium;
    String subjectStream;
    String subjectExamType;
    String subjectExamYear;

}
