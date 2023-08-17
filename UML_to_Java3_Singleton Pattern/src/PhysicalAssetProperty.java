class PhysicalAssetProperty {
    private String name;

    private PhysicalAssetProperty(String name) {
        this.name = name;
    }
    public static PhysicalAssetProperty createProperty(String name) {
        return new PhysicalAssetProperty(name);
    }
    public String getName() {
        return name;
    }
}