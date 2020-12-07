/*
 * Kadaster - Publiekrechtelijke beperkingen
 * De definitie van de Publiekrechtelijke beperkingen endpoints en components. 
 *
 * The version of the OpenAPI document: 1.3.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Beperkingsgebied;
import org.openapitools.client.model.NietNatuurlijkPersoonBeperkt;
import org.openapitools.client.model.Waardelijst;

/**
 * Beperkingen op een kadastraal onroerende zaak die door de overheid zijn opgelegd. Deze bepalen wat een eigenaar wel of niet mag doen met een woning, een ander gebouw of een stuk grond. Het gaat het bijvoorbeeld om beschermde monumenten, natuurmonumenten, bodembescherming, eisen die binnen de Woningwet worden gesteld, of maatregelen die nodig zijn voor landsverdediging. 
 */
@ApiModel(description = "Beperkingen op een kadastraal onroerende zaak die door de overheid zijn opgelegd. Deze bepalen wat een eigenaar wel of niet mag doen met een woning, een ander gebouw of een stuk grond. Het gaat het bijvoorbeeld om beschermde monumenten, natuurmonumenten, bodembescherming, eisen die binnen de Woningwet worden gesteld, of maatregelen die nodig zijn voor landsverdediging. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-07T08:42:32.695Z[Etc/UTC]")
public class PubliekrechtelijkeBeperking {
  public static final String SERIALIZED_NAME_IDENTIFICATIE = "identificatie";
  @SerializedName(SERIALIZED_NAME_IDENTIFICATIE)
  private String identificatie;

  public static final String SERIALIZED_NAME_DOMEIN = "domein";
  @SerializedName(SERIALIZED_NAME_DOMEIN)
  private String domein;

  public static final String SERIALIZED_NAME_GRONDSLAG = "grondslag";
  @SerializedName(SERIALIZED_NAME_GRONDSLAG)
  private Waardelijst grondslag;

  public static final String SERIALIZED_NAME_DATUM_IN_WERKING = "datumInWerking";
  @SerializedName(SERIALIZED_NAME_DATUM_IN_WERKING)
  private LocalDate datumInWerking;

  public static final String SERIALIZED_NAME_DATUM_BEEINDIGING = "datumBeeindiging";
  @SerializedName(SERIALIZED_NAME_DATUM_BEEINDIGING)
  private LocalDate datumBeeindiging;

  public static final String SERIALIZED_NAME_BEVOEGD_GEZAG = "bevoegdGezag";
  @SerializedName(SERIALIZED_NAME_BEVOEGD_GEZAG)
  private NietNatuurlijkPersoonBeperkt bevoegdGezag = null;

  public static final String SERIALIZED_NAME_STUK_IDENTIFICATIES = "stukIdentificaties";
  @SerializedName(SERIALIZED_NAME_STUK_IDENTIFICATIES)
  private List<String> stukIdentificaties = null;

  public static final String SERIALIZED_NAME_IS_GEBASEERD_OP_STUKDEEL_IDENTIFICATIE = "isGebaseerdOpStukdeelIdentificatie";
  @SerializedName(SERIALIZED_NAME_IS_GEBASEERD_OP_STUKDEEL_IDENTIFICATIE)
  private String isGebaseerdOpStukdeelIdentificatie;

  public static final String SERIALIZED_NAME_IS_VERMELD_IN_STUKDEEL_IDENTIFICATIES = "isVermeldInStukdeelIdentificaties";
  @SerializedName(SERIALIZED_NAME_IS_VERMELD_IN_STUKDEEL_IDENTIFICATIES)
  private List<String> isVermeldInStukdeelIdentificaties = null;

  public static final String SERIALIZED_NAME_BEPERKINGSGEBIED = "beperkingsgebied";
  @SerializedName(SERIALIZED_NAME_BEPERKINGSGEBIED)
  private Beperkingsgebied beperkingsgebied;


  public PubliekrechtelijkeBeperking identificatie(String identificatie) {
    
    this.identificatie = identificatie;
    return this;
  }

   /**
   * Get identificatie
   * @return identificatie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdentificatie() {
    return identificatie;
  }


  public void setIdentificatie(String identificatie) {
    this.identificatie = identificatie;
  }


  public PubliekrechtelijkeBeperking domein(String domein) {
    
    this.domein = domein;
    return this;
  }

   /**
   * Het domein waartoe de identificatie behoort. 
   * @return domein
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Het domein waartoe de identificatie behoort. ")

  public String getDomein() {
    return domein;
  }


  public void setDomein(String domein) {
    this.domein = domein;
  }


  public PubliekrechtelijkeBeperking grondslag(Waardelijst grondslag) {
    
    this.grondslag = grondslag;
    return this;
  }

   /**
   * Get grondslag
   * @return grondslag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Waardelijst getGrondslag() {
    return grondslag;
  }


  public void setGrondslag(Waardelijst grondslag) {
    this.grondslag = grondslag;
  }


  public PubliekrechtelijkeBeperking datumInWerking(LocalDate datumInWerking) {
    
    this.datumInWerking = datumInWerking;
    return this;
  }

   /**
   * Get datumInWerking
   * @return datumInWerking
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getDatumInWerking() {
    return datumInWerking;
  }


  public void setDatumInWerking(LocalDate datumInWerking) {
    this.datumInWerking = datumInWerking;
  }


  public PubliekrechtelijkeBeperking datumBeeindiging(LocalDate datumBeeindiging) {
    
    this.datumBeeindiging = datumBeeindiging;
    return this;
  }

   /**
   * Get datumBeeindiging
   * @return datumBeeindiging
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getDatumBeeindiging() {
    return datumBeeindiging;
  }


  public void setDatumBeeindiging(LocalDate datumBeeindiging) {
    this.datumBeeindiging = datumBeeindiging;
  }


  public PubliekrechtelijkeBeperking bevoegdGezag(NietNatuurlijkPersoonBeperkt bevoegdGezag) {
    
    this.bevoegdGezag = bevoegdGezag;
    return this;
  }

   /**
   * Get bevoegdGezag
   * @return bevoegdGezag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NietNatuurlijkPersoonBeperkt getBevoegdGezag() {
    return bevoegdGezag;
  }


  public void setBevoegdGezag(NietNatuurlijkPersoonBeperkt bevoegdGezag) {
    this.bevoegdGezag = bevoegdGezag;
  }


  public PubliekrechtelijkeBeperking stukIdentificaties(List<String> stukIdentificaties) {
    
    this.stukIdentificaties = stukIdentificaties;
    return this;
  }

  public PubliekrechtelijkeBeperking addStukIdentificatiesItem(String stukIdentificatiesItem) {
    if (this.stukIdentificaties == null) {
      this.stukIdentificaties = new ArrayList<>();
    }
    this.stukIdentificaties.add(stukIdentificatiesItem);
    return this;
  }

   /**
   * Identificatie van het stuk. Een stuk is een brondocument dat aanleiding geeft tot een wijziging van de gegevens in een basisregistratie. Dit kan een aangeboden stuk of een kadasterstuk zijn. 
   * @return stukIdentificaties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identificatie van het stuk. Een stuk is een brondocument dat aanleiding geeft tot een wijziging van de gegevens in een basisregistratie. Dit kan een aangeboden stuk of een kadasterstuk zijn. ")

  public List<String> getStukIdentificaties() {
    return stukIdentificaties;
  }


  public void setStukIdentificaties(List<String> stukIdentificaties) {
    this.stukIdentificaties = stukIdentificaties;
  }


  public PubliekrechtelijkeBeperking isGebaseerdOpStukdeelIdentificatie(String isGebaseerdOpStukdeelIdentificatie) {
    
    this.isGebaseerdOpStukdeelIdentificatie = isGebaseerdOpStukdeelIdentificatie;
    return this;
  }

   /**
   * De identificatie van het stukdeel (paragraaf in een akte met een rechtsfeit) waarop deze publiekrechtelijke beperking is gebaseerd. 
   * @return isGebaseerdOpStukdeelIdentificatie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "De identificatie van het stukdeel (paragraaf in een akte met een rechtsfeit) waarop deze publiekrechtelijke beperking is gebaseerd. ")

  public String getIsGebaseerdOpStukdeelIdentificatie() {
    return isGebaseerdOpStukdeelIdentificatie;
  }


  public void setIsGebaseerdOpStukdeelIdentificatie(String isGebaseerdOpStukdeelIdentificatie) {
    this.isGebaseerdOpStukdeelIdentificatie = isGebaseerdOpStukdeelIdentificatie;
  }


  public PubliekrechtelijkeBeperking isVermeldInStukdeelIdentificaties(List<String> isVermeldInStukdeelIdentificaties) {
    
    this.isVermeldInStukdeelIdentificaties = isVermeldInStukdeelIdentificaties;
    return this;
  }

  public PubliekrechtelijkeBeperking addIsVermeldInStukdeelIdentificatiesItem(String isVermeldInStukdeelIdentificatiesItem) {
    if (this.isVermeldInStukdeelIdentificaties == null) {
      this.isVermeldInStukdeelIdentificaties = new ArrayList<>();
    }
    this.isVermeldInStukdeelIdentificaties.add(isVermeldInStukdeelIdentificatiesItem);
    return this;
  }

   /**
   * De identificaties van de stukdelen (paragrafen in een akte met een rechtsfeit) waarin deze publiekrechtelijke beperking gerechtigde is vermeld. 
   * @return isVermeldInStukdeelIdentificaties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "De identificaties van de stukdelen (paragrafen in een akte met een rechtsfeit) waarin deze publiekrechtelijke beperking gerechtigde is vermeld. ")

  public List<String> getIsVermeldInStukdeelIdentificaties() {
    return isVermeldInStukdeelIdentificaties;
  }


  public void setIsVermeldInStukdeelIdentificaties(List<String> isVermeldInStukdeelIdentificaties) {
    this.isVermeldInStukdeelIdentificaties = isVermeldInStukdeelIdentificaties;
  }


  public PubliekrechtelijkeBeperking beperkingsgebied(Beperkingsgebied beperkingsgebied) {
    
    this.beperkingsgebied = beperkingsgebied;
    return this;
  }

   /**
   * Get beperkingsgebied
   * @return beperkingsgebied
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Beperkingsgebied getBeperkingsgebied() {
    return beperkingsgebied;
  }


  public void setBeperkingsgebied(Beperkingsgebied beperkingsgebied) {
    this.beperkingsgebied = beperkingsgebied;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PubliekrechtelijkeBeperking publiekrechtelijkeBeperking = (PubliekrechtelijkeBeperking) o;
    return Objects.equals(this.identificatie, publiekrechtelijkeBeperking.identificatie) &&
        Objects.equals(this.domein, publiekrechtelijkeBeperking.domein) &&
        Objects.equals(this.grondslag, publiekrechtelijkeBeperking.grondslag) &&
        Objects.equals(this.datumInWerking, publiekrechtelijkeBeperking.datumInWerking) &&
        Objects.equals(this.datumBeeindiging, publiekrechtelijkeBeperking.datumBeeindiging) &&
        Objects.equals(this.bevoegdGezag, publiekrechtelijkeBeperking.bevoegdGezag) &&
        Objects.equals(this.stukIdentificaties, publiekrechtelijkeBeperking.stukIdentificaties) &&
        Objects.equals(this.isGebaseerdOpStukdeelIdentificatie, publiekrechtelijkeBeperking.isGebaseerdOpStukdeelIdentificatie) &&
        Objects.equals(this.isVermeldInStukdeelIdentificaties, publiekrechtelijkeBeperking.isVermeldInStukdeelIdentificaties) &&
        Objects.equals(this.beperkingsgebied, publiekrechtelijkeBeperking.beperkingsgebied);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identificatie, domein, grondslag, datumInWerking, datumBeeindiging, bevoegdGezag, stukIdentificaties, isGebaseerdOpStukdeelIdentificatie, isVermeldInStukdeelIdentificaties, beperkingsgebied);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PubliekrechtelijkeBeperking {\n");
    sb.append("    identificatie: ").append(toIndentedString(identificatie)).append("\n");
    sb.append("    domein: ").append(toIndentedString(domein)).append("\n");
    sb.append("    grondslag: ").append(toIndentedString(grondslag)).append("\n");
    sb.append("    datumInWerking: ").append(toIndentedString(datumInWerking)).append("\n");
    sb.append("    datumBeeindiging: ").append(toIndentedString(datumBeeindiging)).append("\n");
    sb.append("    bevoegdGezag: ").append(toIndentedString(bevoegdGezag)).append("\n");
    sb.append("    stukIdentificaties: ").append(toIndentedString(stukIdentificaties)).append("\n");
    sb.append("    isGebaseerdOpStukdeelIdentificatie: ").append(toIndentedString(isGebaseerdOpStukdeelIdentificatie)).append("\n");
    sb.append("    isVermeldInStukdeelIdentificaties: ").append(toIndentedString(isVermeldInStukdeelIdentificaties)).append("\n");
    sb.append("    beperkingsgebied: ").append(toIndentedString(beperkingsgebied)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
