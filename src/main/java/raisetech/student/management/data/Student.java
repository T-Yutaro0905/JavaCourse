package raisetech.student.management.data;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Schema(description = "受講生")
@Getter
@Setter
public class Student {

  private String id;

  @NotBlank
  private String name;

  @NotBlank

  private String kanaName;

  private String nickname;

  @NotBlank
  private String mailAddress;

  private String address;

  private int age;

  private String gender;

  private String remark;

  private boolean isDeleted;
}
