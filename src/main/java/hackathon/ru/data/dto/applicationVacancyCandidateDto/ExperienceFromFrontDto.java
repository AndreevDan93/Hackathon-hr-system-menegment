package hackathon.ru.data.dto.applicationVacancyCandidateDto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExperienceFromFrontDto {
    @NotBlank(message = "company name should not be Empty")
    private String companyName;

    @NotBlank(message = "position name should not be Empty")
    private String positionName;

    @NotNull(message = "Start Date should not be Empty")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-mm-dd")
    private Date startDate;

    @NotNull(message = "End Date should not be Empty")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-mm-dd")
    private Date endDate;

    @NotBlank(message = "description should not be Empty")
    private String description;
}
