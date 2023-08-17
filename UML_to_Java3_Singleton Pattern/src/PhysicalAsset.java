import java.util.ArrayList;
import java.util.List;

class PhysicalAsset {
    private static PhysicalAsset instance;
    private List<PhysicalAssetProperty> properties;

    PhysicalAsset() {
        this.properties = new ArrayList<>();
    }
    public static PhysicalAsset getInstance() {
        if (instance == null) {
            instance = new PhysicalAsset();}
        return instance;}

    public void addProperty(PhysicalAssetProperty property) {
        properties.add(property);
    }
    public List<PhysicalAssetProperty> getProperties() {
        return properties;
    }
}