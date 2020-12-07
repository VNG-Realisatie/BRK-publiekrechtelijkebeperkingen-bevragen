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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.HalLink;

/**
 * PubliekrechtelijkeBeperkingLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-07T08:42:32.695Z[Etc/UTC]")
public class PubliekrechtelijkeBeperkingLinks {
  public static final String SERIALIZED_NAME_BEVOEGD_GEZAG = "bevoegdGezag";
  @SerializedName(SERIALIZED_NAME_BEVOEGD_GEZAG)
  private HalLink bevoegdGezag;

  public static final String SERIALIZED_NAME_STUKKEN = "stukken";
  @SerializedName(SERIALIZED_NAME_STUKKEN)
  private List<HalLink> stukken = null;

  public static final String SERIALIZED_NAME_IS_GEBASEERD_OP_STUKDEEL = "isGebaseerdOpStukdeel";
  @SerializedName(SERIALIZED_NAME_IS_GEBASEERD_OP_STUKDEEL)
  private HalLink isGebaseerdOpStukdeel;

  public static final String SERIALIZED_NAME_IS_VERMELD_IN_STUKDELEN = "isVermeldInStukdelen";
  @SerializedName(SERIALIZED_NAME_IS_VERMELD_IN_STUKDELEN)
  private List<HalLink> isVermeldInStukdelen = null;

  public static final String SERIALIZED_NAME_KADASTRAAL_ONROERENDE_ZAAK = "kadastraalOnroerendeZaak";
  @SerializedName(SERIALIZED_NAME_KADASTRAAL_ONROERENDE_ZAAK)
  private List<HalLink> kadastraalOnroerendeZaak = null;


  public PubliekrechtelijkeBeperkingLinks bevoegdGezag(HalLink bevoegdGezag) {
    
    this.bevoegdGezag = bevoegdGezag;
    return this;
  }

   /**
   * Get bevoegdGezag
   * @return bevoegdGezag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HalLink getBevoegdGezag() {
    return bevoegdGezag;
  }


  public void setBevoegdGezag(HalLink bevoegdGezag) {
    this.bevoegdGezag = bevoegdGezag;
  }


  public PubliekrechtelijkeBeperkingLinks stukken(List<HalLink> stukken) {
    
    this.stukken = stukken;
    return this;
  }

  public PubliekrechtelijkeBeperkingLinks addStukkenItem(HalLink stukkenItem) {
    if (this.stukken == null) {
      this.stukken = new ArrayList<>();
    }
    this.stukken.add(stukkenItem);
    return this;
  }

   /**
   * Get stukken
   * @return stukken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<HalLink> getStukken() {
    return stukken;
  }


  public void setStukken(List<HalLink> stukken) {
    this.stukken = stukken;
  }


  public PubliekrechtelijkeBeperkingLinks isGebaseerdOpStukdeel(HalLink isGebaseerdOpStukdeel) {
    
    this.isGebaseerdOpStukdeel = isGebaseerdOpStukdeel;
    return this;
  }

   /**
   * Get isGebaseerdOpStukdeel
   * @return isGebaseerdOpStukdeel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HalLink getIsGebaseerdOpStukdeel() {
    return isGebaseerdOpStukdeel;
  }


  public void setIsGebaseerdOpStukdeel(HalLink isGebaseerdOpStukdeel) {
    this.isGebaseerdOpStukdeel = isGebaseerdOpStukdeel;
  }


  public PubliekrechtelijkeBeperkingLinks isVermeldInStukdelen(List<HalLink> isVermeldInStukdelen) {
    
    this.isVermeldInStukdelen = isVermeldInStukdelen;
    return this;
  }

  public PubliekrechtelijkeBeperkingLinks addIsVermeldInStukdelenItem(HalLink isVermeldInStukdelenItem) {
    if (this.isVermeldInStukdelen == null) {
      this.isVermeldInStukdelen = new ArrayList<>();
    }
    this.isVermeldInStukdelen.add(isVermeldInStukdelenItem);
    return this;
  }

   /**
   * Get isVermeldInStukdelen
   * @return isVermeldInStukdelen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<HalLink> getIsVermeldInStukdelen() {
    return isVermeldInStukdelen;
  }


  public void setIsVermeldInStukdelen(List<HalLink> isVermeldInStukdelen) {
    this.isVermeldInStukdelen = isVermeldInStukdelen;
  }


  public PubliekrechtelijkeBeperkingLinks kadastraalOnroerendeZaak(List<HalLink> kadastraalOnroerendeZaak) {
    
    this.kadastraalOnroerendeZaak = kadastraalOnroerendeZaak;
    return this;
  }

  public PubliekrechtelijkeBeperkingLinks addKadastraalOnroerendeZaakItem(HalLink kadastraalOnroerendeZaakItem) {
    if (this.kadastraalOnroerendeZaak == null) {
      this.kadastraalOnroerendeZaak = new ArrayList<>();
    }
    this.kadastraalOnroerendeZaak.add(kadastraalOnroerendeZaakItem);
    return this;
  }

   /**
   * Get kadastraalOnroerendeZaak
   * @return kadastraalOnroerendeZaak
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<HalLink> getKadastraalOnroerendeZaak() {
    return kadastraalOnroerendeZaak;
  }


  public void setKadastraalOnroerendeZaak(List<HalLink> kadastraalOnroerendeZaak) {
    this.kadastraalOnroerendeZaak = kadastraalOnroerendeZaak;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PubliekrechtelijkeBeperkingLinks publiekrechtelijkeBeperkingLinks = (PubliekrechtelijkeBeperkingLinks) o;
    return Objects.equals(this.bevoegdGezag, publiekrechtelijkeBeperkingLinks.bevoegdGezag) &&
        Objects.equals(this.stukken, publiekrechtelijkeBeperkingLinks.stukken) &&
        Objects.equals(this.isGebaseerdOpStukdeel, publiekrechtelijkeBeperkingLinks.isGebaseerdOpStukdeel) &&
        Objects.equals(this.isVermeldInStukdelen, publiekrechtelijkeBeperkingLinks.isVermeldInStukdelen) &&
        Objects.equals(this.kadastraalOnroerendeZaak, publiekrechtelijkeBeperkingLinks.kadastraalOnroerendeZaak);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bevoegdGezag, stukken, isGebaseerdOpStukdeel, isVermeldInStukdelen, kadastraalOnroerendeZaak);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PubliekrechtelijkeBeperkingLinks {\n");
    sb.append("    bevoegdGezag: ").append(toIndentedString(bevoegdGezag)).append("\n");
    sb.append("    stukken: ").append(toIndentedString(stukken)).append("\n");
    sb.append("    isGebaseerdOpStukdeel: ").append(toIndentedString(isGebaseerdOpStukdeel)).append("\n");
    sb.append("    isVermeldInStukdelen: ").append(toIndentedString(isVermeldInStukdelen)).append("\n");
    sb.append("    kadastraalOnroerendeZaak: ").append(toIndentedString(kadastraalOnroerendeZaak)).append("\n");
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
