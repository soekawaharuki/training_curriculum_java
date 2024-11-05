package in.tech_camp.training_curriculum_java.repository;

import java.time.LocalDate;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import in.tech_camp.training_curriculum_java.entity.PlanEntity;

@Mapper
public interface PlanRepository {
    @Select("SELECT * FROM plans WHERE date BETWEEN #{startDate} AND #{endDate}")
    List<PlanEntity> findByDateBetween(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);

   @Insert("insert into plans (plan, date) values (#{plan}, #{date})")
   @Options(useGeneratedKeys = true, keyProperty = "id")
   void insert(PlanEntity planEntity);
}
