package femr.data.models;

import femr.common.models.IPatientEncounterTreatmentField;
import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient_encounter_treatment_fields")
public class PatientEncounterTreatmentField implements IPatientEncounterTreatmentField {
    @Id
    @Column(name = "id", unique = true, nullable = false)
    private int id;
    @Column(name = "user_id", nullable = false)
    private int userId;
    @Column(name = "patient_encounter_id", nullable = false)
    private int patientEncounterId;
    @Column(name = "treatment_field_id", nullable = false)
    private int treatmentFieldId;
    @Column(name = "treatment_field_value", nullable = false)
    private String treatmentFieldValue;
    @Column(name = "date_taken", nullable = false)
    private DateTime dateTaken;

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPatientEncounterId() {
        return patientEncounterId;
    }

    public void setPatientEncounterId(int patientEncounterId) {
        this.patientEncounterId = patientEncounterId;
    }

    public int getTreatmentFieldId() {
        return treatmentFieldId;
    }

    public void setTreatmentFieldId(int treatmentFieldId) {
        this.treatmentFieldId = treatmentFieldId;
    }

    public String getTreatmentFieldValue() {
        return treatmentFieldValue;
    }

    public void setTreatmentFieldValue(String treatmentFieldValue) {
        this.treatmentFieldValue = treatmentFieldValue;
    }

    public DateTime getDateTaken() {
        return dateTaken;
    }

    public void setDateTaken(DateTime dateTaken) {
        this.dateTaken = dateTaken;
    }
}
