package in.tech_camp.training_curriculum_java.entity;

import java.time.LocalDate;

import lombok.Data;

@Data
public class PlanEntity {
  private Long id;
  private String plan;
  private LocalDate date;
}
