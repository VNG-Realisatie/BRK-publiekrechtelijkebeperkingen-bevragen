/* 
 * Kadaster - Publiekrechtelijke beperkingen
 *
 * De definitie van de Publiekrechtelijke beperkingen endpoints en components. 
 *
 * The version of the OpenAPI document: 1.3.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// PubliekrechtelijkeBeperkingHal
    /// </summary>
    [DataContract]
    public partial class PubliekrechtelijkeBeperkingHal :  IEquatable<PubliekrechtelijkeBeperkingHal>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PubliekrechtelijkeBeperkingHal" /> class.
        /// </summary>
        /// <param name="identificatie">identificatie.</param>
        /// <param name="domein">Het domein waartoe de identificatie behoort. .</param>
        /// <param name="grondslag">grondslag.</param>
        /// <param name="datumInWerking">datumInWerking.</param>
        /// <param name="datumBeeindiging">datumBeeindiging.</param>
        /// <param name="bevoegdGezag">bevoegdGezag.</param>
        /// <param name="stukIdentificaties">Identificatie van het stuk. Een stuk is een brondocument dat aanleiding geeft tot een wijziging van de gegevens in een basisregistratie. Dit kan een aangeboden stuk of een kadasterstuk zijn. .</param>
        /// <param name="isGebaseerdOpStukdeelIdentificatie">De identificatie van het stukdeel (paragraaf in een akte met een rechtsfeit) waarop deze publiekrechtelijke beperking is gebaseerd. .</param>
        /// <param name="isVermeldInStukdeelIdentificaties">De identificaties van de stukdelen (paragrafen in een akte met een rechtsfeit) waarin deze publiekrechtelijke beperking gerechtigde is vermeld. .</param>
        /// <param name="beperkingsgebied">beperkingsgebied.</param>
        /// <param name="links">links.</param>
        public PubliekrechtelijkeBeperkingHal(string identificatie = default(string), string domein = default(string), Waardelijst grondslag = default(Waardelijst), DateTime datumInWerking = default(DateTime), DateTime datumBeeindiging = default(DateTime), NietNatuurlijkPersoonBeperkt bevoegdGezag = default(NietNatuurlijkPersoonBeperkt), List<string> stukIdentificaties = default(List<string>), string isGebaseerdOpStukdeelIdentificatie = default(string), List<string> isVermeldInStukdeelIdentificaties = default(List<string>), Beperkingsgebied beperkingsgebied = default(Beperkingsgebied), PubliekrechtelijkeBeperkingLinks links = default(PubliekrechtelijkeBeperkingLinks))
        {
            this.Identificatie = identificatie;
            this.Domein = domein;
            this.Grondslag = grondslag;
            this.DatumInWerking = datumInWerking;
            this.DatumBeeindiging = datumBeeindiging;
            this.BevoegdGezag = bevoegdGezag;
            this.StukIdentificaties = stukIdentificaties;
            this.IsGebaseerdOpStukdeelIdentificatie = isGebaseerdOpStukdeelIdentificatie;
            this.IsVermeldInStukdeelIdentificaties = isVermeldInStukdeelIdentificaties;
            this.Beperkingsgebied = beperkingsgebied;
            this.Links = links;
        }
        
        /// <summary>
        /// Gets or Sets Identificatie
        /// </summary>
        [DataMember(Name="identificatie", EmitDefaultValue=false)]
        public string Identificatie { get; set; }

        /// <summary>
        /// Het domein waartoe de identificatie behoort. 
        /// </summary>
        /// <value>Het domein waartoe de identificatie behoort. </value>
        [DataMember(Name="domein", EmitDefaultValue=false)]
        public string Domein { get; set; }

        /// <summary>
        /// Gets or Sets Grondslag
        /// </summary>
        [DataMember(Name="grondslag", EmitDefaultValue=false)]
        public Waardelijst Grondslag { get; set; }

        /// <summary>
        /// Gets or Sets DatumInWerking
        /// </summary>
        [DataMember(Name="datumInWerking", EmitDefaultValue=false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime DatumInWerking { get; set; }

        /// <summary>
        /// Gets or Sets DatumBeeindiging
        /// </summary>
        [DataMember(Name="datumBeeindiging", EmitDefaultValue=false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime DatumBeeindiging { get; set; }

        /// <summary>
        /// Gets or Sets BevoegdGezag
        /// </summary>
        [DataMember(Name="bevoegdGezag", EmitDefaultValue=false)]
        public NietNatuurlijkPersoonBeperkt BevoegdGezag { get; set; }

        /// <summary>
        /// Identificatie van het stuk. Een stuk is een brondocument dat aanleiding geeft tot een wijziging van de gegevens in een basisregistratie. Dit kan een aangeboden stuk of een kadasterstuk zijn. 
        /// </summary>
        /// <value>Identificatie van het stuk. Een stuk is een brondocument dat aanleiding geeft tot een wijziging van de gegevens in een basisregistratie. Dit kan een aangeboden stuk of een kadasterstuk zijn. </value>
        [DataMember(Name="stukIdentificaties", EmitDefaultValue=false)]
        public List<string> StukIdentificaties { get; set; }

        /// <summary>
        /// De identificatie van het stukdeel (paragraaf in een akte met een rechtsfeit) waarop deze publiekrechtelijke beperking is gebaseerd. 
        /// </summary>
        /// <value>De identificatie van het stukdeel (paragraaf in een akte met een rechtsfeit) waarop deze publiekrechtelijke beperking is gebaseerd. </value>
        [DataMember(Name="isGebaseerdOpStukdeelIdentificatie", EmitDefaultValue=false)]
        public string IsGebaseerdOpStukdeelIdentificatie { get; set; }

        /// <summary>
        /// De identificaties van de stukdelen (paragrafen in een akte met een rechtsfeit) waarin deze publiekrechtelijke beperking gerechtigde is vermeld. 
        /// </summary>
        /// <value>De identificaties van de stukdelen (paragrafen in een akte met een rechtsfeit) waarin deze publiekrechtelijke beperking gerechtigde is vermeld. </value>
        [DataMember(Name="isVermeldInStukdeelIdentificaties", EmitDefaultValue=false)]
        public List<string> IsVermeldInStukdeelIdentificaties { get; set; }

        /// <summary>
        /// Gets or Sets Beperkingsgebied
        /// </summary>
        [DataMember(Name="beperkingsgebied", EmitDefaultValue=false)]
        public Beperkingsgebied Beperkingsgebied { get; set; }

        /// <summary>
        /// Gets or Sets Links
        /// </summary>
        [DataMember(Name="_links", EmitDefaultValue=false)]
        public PubliekrechtelijkeBeperkingLinks Links { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PubliekrechtelijkeBeperkingHal {\n");
            sb.Append("  Identificatie: ").Append(Identificatie).Append("\n");
            sb.Append("  Domein: ").Append(Domein).Append("\n");
            sb.Append("  Grondslag: ").Append(Grondslag).Append("\n");
            sb.Append("  DatumInWerking: ").Append(DatumInWerking).Append("\n");
            sb.Append("  DatumBeeindiging: ").Append(DatumBeeindiging).Append("\n");
            sb.Append("  BevoegdGezag: ").Append(BevoegdGezag).Append("\n");
            sb.Append("  StukIdentificaties: ").Append(StukIdentificaties).Append("\n");
            sb.Append("  IsGebaseerdOpStukdeelIdentificatie: ").Append(IsGebaseerdOpStukdeelIdentificatie).Append("\n");
            sb.Append("  IsVermeldInStukdeelIdentificaties: ").Append(IsVermeldInStukdeelIdentificaties).Append("\n");
            sb.Append("  Beperkingsgebied: ").Append(Beperkingsgebied).Append("\n");
            sb.Append("  Links: ").Append(Links).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as PubliekrechtelijkeBeperkingHal);
        }

        /// <summary>
        /// Returns true if PubliekrechtelijkeBeperkingHal instances are equal
        /// </summary>
        /// <param name="input">Instance of PubliekrechtelijkeBeperkingHal to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PubliekrechtelijkeBeperkingHal input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Identificatie == input.Identificatie ||
                    (this.Identificatie != null &&
                    this.Identificatie.Equals(input.Identificatie))
                ) && 
                (
                    this.Domein == input.Domein ||
                    (this.Domein != null &&
                    this.Domein.Equals(input.Domein))
                ) && 
                (
                    this.Grondslag == input.Grondslag ||
                    (this.Grondslag != null &&
                    this.Grondslag.Equals(input.Grondslag))
                ) && 
                (
                    this.DatumInWerking == input.DatumInWerking ||
                    (this.DatumInWerking != null &&
                    this.DatumInWerking.Equals(input.DatumInWerking))
                ) && 
                (
                    this.DatumBeeindiging == input.DatumBeeindiging ||
                    (this.DatumBeeindiging != null &&
                    this.DatumBeeindiging.Equals(input.DatumBeeindiging))
                ) && 
                (
                    this.BevoegdGezag == input.BevoegdGezag ||
                    (this.BevoegdGezag != null &&
                    this.BevoegdGezag.Equals(input.BevoegdGezag))
                ) && 
                (
                    this.StukIdentificaties == input.StukIdentificaties ||
                    this.StukIdentificaties != null &&
                    input.StukIdentificaties != null &&
                    this.StukIdentificaties.SequenceEqual(input.StukIdentificaties)
                ) && 
                (
                    this.IsGebaseerdOpStukdeelIdentificatie == input.IsGebaseerdOpStukdeelIdentificatie ||
                    (this.IsGebaseerdOpStukdeelIdentificatie != null &&
                    this.IsGebaseerdOpStukdeelIdentificatie.Equals(input.IsGebaseerdOpStukdeelIdentificatie))
                ) && 
                (
                    this.IsVermeldInStukdeelIdentificaties == input.IsVermeldInStukdeelIdentificaties ||
                    this.IsVermeldInStukdeelIdentificaties != null &&
                    input.IsVermeldInStukdeelIdentificaties != null &&
                    this.IsVermeldInStukdeelIdentificaties.SequenceEqual(input.IsVermeldInStukdeelIdentificaties)
                ) && 
                (
                    this.Beperkingsgebied == input.Beperkingsgebied ||
                    (this.Beperkingsgebied != null &&
                    this.Beperkingsgebied.Equals(input.Beperkingsgebied))
                ) && 
                (
                    this.Links == input.Links ||
                    (this.Links != null &&
                    this.Links.Equals(input.Links))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Identificatie != null)
                    hashCode = hashCode * 59 + this.Identificatie.GetHashCode();
                if (this.Domein != null)
                    hashCode = hashCode * 59 + this.Domein.GetHashCode();
                if (this.Grondslag != null)
                    hashCode = hashCode * 59 + this.Grondslag.GetHashCode();
                if (this.DatumInWerking != null)
                    hashCode = hashCode * 59 + this.DatumInWerking.GetHashCode();
                if (this.DatumBeeindiging != null)
                    hashCode = hashCode * 59 + this.DatumBeeindiging.GetHashCode();
                if (this.BevoegdGezag != null)
                    hashCode = hashCode * 59 + this.BevoegdGezag.GetHashCode();
                if (this.StukIdentificaties != null)
                    hashCode = hashCode * 59 + this.StukIdentificaties.GetHashCode();
                if (this.IsGebaseerdOpStukdeelIdentificatie != null)
                    hashCode = hashCode * 59 + this.IsGebaseerdOpStukdeelIdentificatie.GetHashCode();
                if (this.IsVermeldInStukdeelIdentificaties != null)
                    hashCode = hashCode * 59 + this.IsVermeldInStukdeelIdentificaties.GetHashCode();
                if (this.Beperkingsgebied != null)
                    hashCode = hashCode * 59 + this.Beperkingsgebied.GetHashCode();
                if (this.Links != null)
                    hashCode = hashCode * 59 + this.Links.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}