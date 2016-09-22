# Case 2 - Smarthus
Selskapet SmartereHus AS har ansatt dere for å designe et webbasert grensesnitt til systemet deres. Grensesnittet skal fungere både på nettbrett og datamaskin (frivillig: og mobiltelefon). For å begrense oppgaven skal grensesnittet dere lager kun gjøre følgende:

- Styre varmen i huset (forskjellige rom kan ha forskjellig temperatur til forskjellige tidspunkter).
- Styre lys, og kunne skru lys av og på til forhåndsbestemte tider på gitte rom.
- Styre lydanlegg/radio i rom det det finnes, og kunne skru dette av og på til forhåndsbestemte tider (f.eks for vekking/innsovning på soverom eller en planlagt fest).
- Systemet skal ha et "live"-panel som viser nå-situasjonen, innstilt temperatur og lys på hvert rom, og om lydanlegget er på.

Dette systemet vil bli markedsført som et system for deg som vil ha enkelhet og luksus i hverdagen, uten å måtte styre med masse tekniske detaljer. Et foreløpig slagord for prosjektet er "Mer chill, mindre dill".

# Backend
Lag en backend for valgt case. Dette skal være en REST-server utviklet med JAX-RS.

- Tenk "RESTfully". Bruk enkle GET/POST/PUT/DELETE-operasjoner for valgte entiteter (ressurser).
- Test tjenestene ved å bruker browser for GET, og enten CURL eller en nettleserplugin for POST/PUT/DELETE.
- Dere kan bruke en database i bunnen hvis dere vil, men det er greit at alt lagres i statiske variabler på REST-serveren.
- Dere trenger ikke beskytte REST-tjenestene med autentisering.

# Frontend
Lag en enkel frontend for casen.

- Legg vekt på å få opp skjermbilder og funksjonalitet, ikke tenk så mye på utseende
- Bruk jQuery for AJAX-kall mot REST-serveren dere lagde i forrige øving.
- Bruk Bootstrap eller et annet CSS-rammeverk, men som sagt skal dere gjøre GUI'et enkelt.
- 
#Case 7

a)

I denne deloppgaven skal dere ikke tenke så mye konkret på hva dere allerede har laget, men heller prøve å tenke på caset som om dere skulle begynt fra skrætsj. Prøv å være litt ambisiøs på systemet sine vegne:

- Elsykkelutleie: Hvorfor skal brukerne få lyst til å prøve, og deretter komme tilbake og fortsette å bruke det?
- Smarthus: Smarthussystem er en stor investering, så brukerne trenger å følge seg trygge på at akkurat dere er det perfekte valget før de blar opp. Så hvorfor velge dere blant alle konkurrentene?

Definer målgruppen for systemet dere lager og beskriv brukeropplevelsen dere ønsker de skal ha når de bruker det (se hvordan brukeropplevelsen er beskrevet i leksjonen, ta utgangspunkt i det). Bestem også hva dere mener er de viktigste elementene av brukskvalitet og universell utforming for systemet deres (dette kan tenkes på som en del av brukeropplevelsen).
 

b)

Gå gjennom brukergrensesnittet dere har laget i Øving 6 (skjermbilde for skjermbilde), og kommenter på hvert av dem mhp.

- de fem punktene for brukskvalitet,
- de sju punktene for universell utforming og
- brukeropplevelsen.

Legg spesielt vekt på det dere kom fram til i deloppgave a). Foreslå så minst tre forbedringspunkter for hvert skjermbilde og implementer dem. Har dere mange skjermbilder skal dere gå gjennom alle, men dere trenger ikke å implementere endringer for mer enn fire av dem.) 

 

c)

Lag en brukertest for det redesignede systemet deres. Dere bør gjennomføre testen på minst 3 personer som ikke er med i gruppa (og helst ikke i en annen gruppe med samme case). Dere skal lage

- en plan for hvordan testen skal gjennomføres (fysiske omgivelser, teknologi, oppgaver som skal løses mm.),
- en beskrivelse av resultatene, og
- forslag til endringer av brukergrensesnittet basert på resultatene.

(Disse endringene trenger dere ikke å implementere, men ta vare på dem til neste øving da vi skal jobbe videre med GUIet.)

Info for oppgave a) fra leksjonen:

Brukeropplevelsen

Brukeropplevelsen, eller UX som det noen ganger forkortes til (fra engelsk: 
user experience), flytter fokuset fra ren brukskvalitet og over til hvilke følelser det å bruke et system gir oss. En av de 
første til å ta dette på alvor var Donald Norman, som i 1988 ga ut en bok kalt The Psychology of Everyday Things (og som anbefales varmt som tilleggslitteratur for de som er interessert, den er både underholdende og lettlest). Her peker han på at teknologi først og fremst er der for å støtte oss i det vi gjør, og ikke for sin egen del. Det betyr at at teknologi som er laget slik at vi sitter igjen 
med negative følelser (som for eksempel frustrasjon, utålmodighet, forvirring eller en følelse av å 
være dum) i mange tilfeller kan sies å ha et dårlig design. Det betyr at problemet ikke 
nødvendigvis ligger i at det er vi som ikke er “gode nok” brukere, som mange, mer eller mindre 
bevisst, tenker når de ikke lykkes med å bruke teknologi.

I dag er avansert datateknologi er en del av hverdagen vår på stadig flere måter, spesielt i form av 
mobil teknologi og innebygd datateknologi i stadig flere hverdagsgjenstander. Det betyr at ikke 
bare brukervennlighet, men også brukeropplevelsen blir viktigere og viktigere. Dette ser vi for 
eksempel på Apples suksess, som i hvert fall delvis skyldes at de tar nettopp brukeropplevelsen 
og brukskvalitet mye mer på alvor enn mange andre teknologifirmaer. Lenge var datateknologi 
forbeholdt eksperter og entusiastiske hobbybrukere, og da var det få som stilte spørsmål ved 
forestillingen om at vi skulle tilpasse oss teknologien og ikke omvendt. I dag, når datateknologien 
invaderer hverdagen (inkludert vårt sosiale liv) på stadig nye måter, må vi ha et bredere perspektiv 
for å lykkes med ny teknologi.

Så, hva er egentlig brukeropplevelsen? Som du skjønner kan man tenke på brukeropplevelsen 
som en utvidelse av brukskvalitetsbegrepet, det inkluderer brukskvalitet, men går utover dette og 
tar med følelser og holdninger som brukeren har til et system. Det betyr at brukeropplevelsen i stor 
grad en subjektiv opplevelse som finnes i hodet til den enkelte brukeren, og som vi kun kan 
undersøke ved å spørre brukere. Det er finnes ennå ingen større enighet om en felles definisjon 
av begrepet brukeropplevelse, men vi når vi undersøker brukeropplevelsen av et system vil vi 
typisk være interessert i ting som


✓ Totalinntrykk.
 Liker brukeren systemet og vil anbefale det til andre? Hvordan er de 
sammenlignet med andre lignende systemer?


✓ Brukskvalitet.
 Er systemet effektivt å bruke, oppfører det seg som forventet, og kan man 
bruke det uten altfor mye frustrasjoner?

✓ Følelser.
 Hvordan føler brukeren seg etter å ha brukt produktet ei stund? Glad, motivert, 
underholdt, avslappet, stresset eller irritert? Hvorfor?

✓ Estetikk.
 Opplever brukeren systemet som estetisk tiltrekkende?
Hvilke mål som er viktigst vil nødvendigvis henge sammen med hva som er målet med systemet 
og hvordan brukere samhandler med det.

 
