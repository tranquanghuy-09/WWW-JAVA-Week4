package vn.edu.iuh.fit.models;

import org.springframework.data.annotation.Id;

public class Candidate {

    @Id
    private long idCandidate;
    private String fullName;
    private String email;
    private String soDienThoai;
    private String diaChi;

    public Candidate() {
    }

    public Candidate(long idCandidate, String fullName, String email, String soDienThoai, String diaChi) {
        this.idCandidate = idCandidate;
        this.fullName = fullName;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
    }

    public long getIdCandidate() {
        return idCandidate;
    }

    public void setIdCandidate(long idCandidate) {
        this.idCandidate = idCandidate;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "idCandidate=" + idCandidate +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
