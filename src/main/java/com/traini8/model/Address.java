@Embeddable
public class Address {
    @NotBlank
    private String detailedAddress;

    @NotBlank
    private String city;

    @NotBlank
    private String state;

    @NotBlank
    @Pattern(regexp = "^[0-9]{6}$")
    private String pincode;
}
