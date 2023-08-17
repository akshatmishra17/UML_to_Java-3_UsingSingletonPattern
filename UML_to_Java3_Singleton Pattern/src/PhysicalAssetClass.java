import java.util.ArrayList;
import java.util.List;

class PhysicalAssetClass extends PhysicalAsset {
    private static PhysicalAssetClass classInstance;
    private List<PhysicalAssetClassProperty> classProperties;

    private PhysicalAssetClass() {
        super();
        this.classProperties = new ArrayList<>();
    }
    public static PhysicalAssetClass getInstance() {
        if (classInstance == null) {
            classInstance = new PhysicalAssetClass();}
        return classInstance;}

    public void addClassProperty(PhysicalAssetClassProperty classProperty) {
        classProperties.add(classProperty);
    }
    public List<PhysicalAssetClassProperty> getClassProperties() {
        return classProperties;
    }
}