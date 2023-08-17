class PhysicalAssetClassProperty {
    private String name;

    private PhysicalAssetClassProperty(String name) {
        this.name = name;
    }
    public static PhysicalAssetClassProperty createClassProperty(String name) {
        return new PhysicalAssetClassProperty(name);
    }
    public String getName() {
        return name;
    }
}