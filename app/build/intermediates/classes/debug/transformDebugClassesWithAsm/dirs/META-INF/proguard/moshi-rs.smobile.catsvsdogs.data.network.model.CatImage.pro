-keepnames class rs.smobile.catsvsdogs.data.network.model.CatImage
-if class rs.smobile.catsvsdogs.data.network.model.CatImage
-keep class rs.smobile.catsvsdogs.data.network.model.CatImageJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
