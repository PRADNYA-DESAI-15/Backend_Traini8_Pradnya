
@Entity
@Table(name = "training_centers")
public class TrainingCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 40)
    private String centerName;

    @NotBlank
    @Size(min = 12, max = 12)
    @Pattern(regexp = "^[a-zA-Z0-9]+$")
    private String centerCode;

    @Embedded
    @Valid
    private Address address;

    private Integer studentCapacity;

    @ElementCollection
    private List<String> coursesOffered;

    @Column(nullable = false, updatable = false)
    private Long createdOn;

    @Email
    private String contactEmail;

    @Pattern(regexp = "^[0-9]{10}$")
    private String contactPhone;

    @PrePersist
    public void prePersist() {
        this.createdOn = System.currentTimeMillis();
    }
}
