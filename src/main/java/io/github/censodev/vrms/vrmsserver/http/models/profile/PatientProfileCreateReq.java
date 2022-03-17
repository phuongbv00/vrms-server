package io.github.censodev.vrms.vrmsserver.http.models.profile;

import io.github.censodev.vrms.vrmsserver.utils.enums.GenderEnum;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PatientProfileCreateReq {
    private String idCard;
    private String fullName;
    private LocalDate birthday;
    private GenderEnum gender;
    private Integer countryId;
    private Integer nationId;
    private Integer provinceId;
    private Integer districtId;
    private Integer wardId;
    private String address;
}
