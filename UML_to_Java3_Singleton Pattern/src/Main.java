import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhysicalAsset physicalAsset = PhysicalAsset.getInstance();
        PhysicalAssetClass physicalAssetClass = PhysicalAssetClass.getInstance();

        PhysicalAssetProperty assetProperty1 = PhysicalAssetProperty.createProperty("Physical Asset Property 1");
        PhysicalAssetProperty assetProperty2 = PhysicalAssetProperty.createProperty("Physical Asset Property 2");
        PhysicalAssetProperty assetProperty3 = PhysicalAssetProperty.createProperty("Physical Asset Property 3");
        PhysicalAssetProperty assetProperty4 = PhysicalAssetProperty.createProperty("Physical Asset Property 4");

        PhysicalAssetClassProperty classProperty1 = PhysicalAssetClassProperty.createClassProperty("Physical Asset Class Property 1");
        PhysicalAssetClassProperty classProperty2 = PhysicalAssetClassProperty.createClassProperty("Physical Asset Class Property 2");
        PhysicalAssetClassProperty classProperty3 = PhysicalAssetClassProperty.createClassProperty("Physical Asset Class Property 3");
        PhysicalAssetClassProperty classProperty4 = PhysicalAssetClassProperty.createClassProperty("Physical Asset Class Property 4");

        physicalAsset.addProperty(assetProperty1);
        physicalAsset.addProperty(assetProperty2);
        physicalAsset.addProperty(assetProperty3);
        physicalAsset.addProperty(assetProperty4);

        physicalAssetClass.addProperty(assetProperty1);
        physicalAssetClass.addProperty(assetProperty2);
        physicalAssetClass.addProperty(assetProperty3);
        physicalAssetClass.addProperty(assetProperty4);

        physicalAssetClass.addClassProperty(classProperty1);
        physicalAssetClass.addClassProperty(classProperty2);
        physicalAssetClass.addClassProperty(classProperty3);
        physicalAssetClass.addClassProperty(classProperty4);

        System.out.println("Physical Asset Properties:");
        List<PhysicalAssetProperty> assetProperties = physicalAsset.getProperties();
        for (int i = 0; i < assetProperties.size(); i++) {
            PhysicalAssetProperty property = assetProperties.get(i);
            System.out.println(property.getName());
        }
        System.out.println();
        System.out.println("Physical Asset Class Properties:");
        List<PhysicalAssetProperty> classProperties = physicalAssetClass.getProperties();
        for (int i = 0; i < classProperties.size(); i++) {
            PhysicalAssetProperty property = classProperties.get(i);
            System.out.println(property.getName());
        }
        System.out.println();
        System.out.println("Physical Asset Class Class Properties:");
        List<PhysicalAssetClassProperty> classClassProperties = physicalAssetClass.getClassProperties();
        for (int i = 0; i < classClassProperties.size(); i++) {
            PhysicalAssetClassProperty property = classClassProperties.get(i);
            System.out.println(property.getName());
        }
    }
}
