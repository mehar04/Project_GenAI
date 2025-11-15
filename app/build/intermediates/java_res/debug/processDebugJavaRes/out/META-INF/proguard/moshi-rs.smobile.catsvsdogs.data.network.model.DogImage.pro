-keepnames class rs.smobile.catsvsdogs.data.network.model.DogImage
-if class rs.smobile.catsvsdogs.data.network.model.DogImage
-keep class rs.smobile.catsvsdogs.data.network.model.DogImageJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
