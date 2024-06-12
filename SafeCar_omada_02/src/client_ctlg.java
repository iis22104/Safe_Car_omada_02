
import java.util.ArrayList;
import java.util.List;

public class client_ctlg {
    private ArrayList<client> clients;

    public client_ctlg() {
        this.clients = new ArrayList<>();
    }
    
    public client getclientById(String id) {
        for (client client : clients) {
            if (client.getLicence().equals(id)) {
                return client;
            }
        }
        return null;
    }
  

    public void removeClient(String licence) {
        clients.removeIf(client -> client.getLicence().equals(licence));
    }

    public ArrayList<client> getClients() {
        return clients;
    }
    
    public boolean addClient(client client) {
        for (client c : clients) {
            if (c.getLicence().equals(client.getLicence())) {
                System.out.println("Υπάρχει ήδη πελάτης με αυτόν τον αριθμό ταυτότητας: " + client.getLicence());
                return false;
            }
        }
        clients.add(client);
        return true;
    }
    }