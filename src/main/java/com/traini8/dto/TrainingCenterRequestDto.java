public record TrainingCenterRequestDto(
    @NotBlank @Size(max = 40) String centerName,
    @NotBlank @Size(min = 12, max = 12) @Pattern(regexp = "^[a-zA-Z0-9]+$") String centerCode,
    @Valid Address address,
    Integer studentCapacity,
    List<String> coursesOffered,
    @Email String contactEmail,
    @Pattern(regexp = "^[0-9]{10}$") String contactPhone
) {}
