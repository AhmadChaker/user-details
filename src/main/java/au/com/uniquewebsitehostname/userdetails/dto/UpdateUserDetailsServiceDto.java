package au.com.uniquewebsitehostname.userdetails.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UpdateUserDetailsServiceDto {
    private String title;
    private String firstName;
    private String lastName;
    private String gender;
    private String oldEmployeeId;
    private String employeeId;
    private AddressDetailsDto address;
}
