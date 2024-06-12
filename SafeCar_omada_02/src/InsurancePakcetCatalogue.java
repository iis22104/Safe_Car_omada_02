import java.util.ArrayList;
import java.util.List;
public class InsurancePakcetCatalogue {
    private List<insPackets> packets;

    public InsurancePakcetCatalogue() {
        this.packets = new ArrayList<>();
    }

    public void addInsurancePacket(insPackets packet) {
        packets.add(packet);
    }

    
    public ArrayList<insPackets> getAllInsurancePackets() {
        return new ArrayList<>(packets);
    }
}