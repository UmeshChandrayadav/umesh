package services;
import entities.Admin;
import java.util.ArrayList;
import java.util.List;
public class AdminService {
    private List<Admin> admins = new ArrayList<>();
    public void addAdmin(Admin admin) {
        admins.add(admin);
    }
    public List<Admin> getAdmins() {
        return admins;
    }
}
