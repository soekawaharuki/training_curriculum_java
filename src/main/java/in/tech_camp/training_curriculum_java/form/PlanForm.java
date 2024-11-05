package in.tech_camp.training_curriculum_java.form;

import java.time.LocalDate;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class PlanForm {
  @NotBlank(message = "Email can't be blank")
  private String plan;

  @NotNull(message = "Date can't be blank")
  private LocalDate date;
}

