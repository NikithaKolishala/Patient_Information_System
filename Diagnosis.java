package nikitha.com;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import java.util.Date;

@Entity
public class Diagnosis {
	
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @ManyToOne
	    @JoinColumn(name = "patient_id")
	    private Patient patientId;

	    @ManyToOne
	    @JoinColumn(name = "doctor_id")
	    private Doctor doctorId;

	    private Date diagnosisDate;
	    private String medicalCondition;
	    private String notes;

	    // Constructors
	    public Diagnosis() {
	    }

	    // Getters and Setters
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public Patient getPatient() {
	        return patientId;
	    }

	    public void setPatient(Patient patientId) {
	        this.patientId = patientId;
	    }

	    public Doctor getDoctor() {
	        return doctorId;
	    }

	    public void setDoctor(Doctor doctorId) {
	        this.doctorId = doctorId;
	    }

	    public Date getDiagnosisDate() {
	        return diagnosisDate;
	    }

	    public void setDiagnosisDate(Date diagnosisDate) {
	        this.diagnosisDate = diagnosisDate;
	    }

	    public String getMedicalCondition() {
	        return medicalCondition;
	    }

	    public void setMedicalCondition(String medicalCondition) {
	        this.medicalCondition = medicalCondition;
	    }

	    public String getNotes() {
	        return notes;
	    }

	    public void setNotes(String notes) {
	        this.notes = notes;
	    }
	}



