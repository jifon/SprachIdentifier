package whz.sparchidentifikation;

import java.io.*;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

public class Main {


    public static void main(String[] args) {

        // Pfad zum Ordner mit den Textdateien in verschiedenen Sprachen
        String folderPath = "src\\whz\\sparchidentifikation\\data\\short";

//        // Text, dessen Sprache identifiziert werden soll
//        String textToIdentify = "()._&";
//
//        // Identifiziere die Sprache des gegebenen Textes
//        String identifiedLanguage = identifyLanguage(folderPath, textToIdentify);
//
//        System.out.println("Identifizierte Sprache: " + identifiedLanguage);


//        ___________________________________________________________________________
        // Пример тестовых предложений и соответствующих языков
        String[] testSentences = {
                "Anton (or Antonius) Maria Schyrleus (also Schyrl, Schyrle) of Rheita (1604–1660) ((in Czech) Antonín Maria Šírek z Reity) was an astronomer and optician. He developed several inverting and erecting eyepieces, and was the maker of Kepler’s telescope. Things appear more alive with the binocular telescope, he wrote, doubly as exact so to speak, as well as large and bright.[1] His binocular telescope is the precursor to our binoculars.",
                "Zvi Zamir born Zvicka Zarzevsky (born 1925) was a major general in the Israel Defense Forces and the Director of the Mossad from 1968 to 1974. Born in Poland, Zamir immigrated with his family to the then British Mandate of Palestine when only seven months old. At the age of 18 Zamir began his military career, first as a soldier in the Haganah's Palmach, a unit that included future Israeli leaders among the likes of Moshe Dayan and Yitzhak Rabin. During the 1948 Arab–Israeli War, Zamir fought in the newly created Israel Defense Forces. After the war he continued climbing the chain of command, eventually promoted to the Commander of the Southern Command. His final IDF post before being appointed Mossad Director came in 1966 when he was appointed the military attaché to London.",
                "Texas A&M hired Kennedy in May 2011 after Mark Turgeon left for the Maryland head coaching job. Kennedy previously coached at A&M from 1990-91. Kennedy stated at the press conference that A&M is his destination job and he plans to retire there. He was given the honors of SEC Men's Basketball Coach of the Year in 2016.",
                "Philip Johnson architectural drawings, 1943-1994 (bulk 1943-1970).Held by the Department of Drawings & Archives, Avery Architectural & Fine Arts Library, Columbia University.",
                "AVCO Embassy Pictures, the film's financial backer, preferred either Charles Bronson or Tommy Lee Jones to play the role of Snake Plissken to Carpenter's choice of Kurt Russell, who was trying to overcome the lightweight screen image conveyed by his roles in several Disney comedies. Carpenter refused to cast Bronson on the grounds that he was too old, and because he worried that he could lose directorial control over the picture with an experienced actor. At the time, Russell described his character as a mercenary, and his style of fighting is a combination of Bruce Lee, The Exterminator, and Darth Vader, with Eastwood's vocal-ness. All that matters to Snake, according to the actor, is the next 60 seconds. Living for exactly that next minute is all there is. Russell used a rigorous diet and exercise program in order to develop a lean and muscular build. He also endeavored to stay in character between takes and throughout the shooting, as he welcomed the opportunity to get away from the Disney comedies he had done previously. He did find it necessary to remove the eyepatch between takes, as wearing it constantly seriously affected his depth perception.",
                "Ilex mucronata, formerly the type species of Nemopanthus, is native to eastern North America. Nemopanthus was treated as a separate genus with eight species. of the family Aquifoliaceae, now transferred to Ilex on molecular data; it is closely related to Ilex amelanchier.",
                "Orner, along with actress Cate Blanchett, was one of only two Australians nominated for an Oscar in 2008. Most commentators predicted that Michael Moore's Sicko would win the Best Documentary category. However, to the surprise of many, Orner's Taxi to the Dark Side, which examines US torture practices in Afghanistan, Iraq and Guantanamo Bay, received the award.",
                "The Berliner Joyce design, a conventional biplane of mixed metal and fabric construction with staggered wings and the pilot and observer seated in tandem in open cockpits, first flew in May 1931. By that time the rival XOK-1 was already destroyed in a crash. Following trials that lasted into 1932, BuAer awarded Berliner-Joyce a contract.",
                "Inspired by his tempestuous relationships with his wives Anna Gordy and Janis Hunter, Gaye added more of a personal depth in the songs he recorded for the album.",
                "All 14 tracks were written and produced by Woodruff, one of which features vocal by reggae singer Half Pint and one of which features vocals from Woodruff's close friend, T.J. O'Neill. Woodruff cowrote five of the tracks with O'Neill; the two had spent time traveling abroad together in Indonesia, Australia, Fiji, Thailand, and New Zealand starting in 2010, finding mutual inspiration for songwriting.",

                "Les supporters de l'ASM Clermont Auvergne ont reçu en 2007, 2008 et 2009 le prix de l’Éthique et de la convivialité (challenge des meilleurs supporters) du Top 14.",
                "Ralph Staub est un réalisateur, producteur, scénariste, acteur, monteur et directeur de la photographie américain né le 21 juillet 1899 à Chicago, Illinois (États-Unis), décédé le 22 octobre 1969.",
                "La Carrera est créée en 1964. Carrera signifie « course » en espagnol et évoque également la Carrera Panamericana courue pendant les années 1950 en Amérique centrale. En 2007, année de lancement d'une nouvelle collection de Grand Carrera,. En 2010, la Carrera se décline en version pour homme comme pour femme, en montre ou en chronographe et bénéficie de diverses « motorisations » : Calibre S Laptimer, Calibre 360, Calibre 17, etc. Pour les 150 ans de TAG Heuer, la Carrera est la première montre de la marque à recevoir le mouvement chronographe Calibre 1887 assemblé par TAG Heuer dans son usine de Chevenez.",
                "La réduction des clubs de l'élite entamée en 1994 aboutit à une poule unique de seize clubs en 2004 (Top 16), réduite à quatorze clubs en 2005 (Top 14). Pour encourager le spectacle, le système de points de bonus en usage dans l'hémisphère Sud et en Coupe du monde est mis en place : un point de bonus défensif inscrit pour une défaite de sept points d'écart ou moins; un point de bonus offensif pour quatre essais marqués. En 2007, ce barème de bonus est adapté à l'usage domestique : le bonus offensif est accordé à l'équipe qui inscrit trois essais de plus que son adversaire, tandis que le bonus défensif est accordé pour une défaite de cinq points ou moins.",
                "Roissy fut érigé en commune indépendante en 1790. La même année le village perdra sa particule « en-France ». Le 31 janvier 1790, le premier maire fut élu à l'école du village, ce n'était autre que Maurice Gabriel Joseph de Riquet, vicomte de Caraman, né en 1765 à Roissy-en-France, fils Victor-Maurice Riquet, comte de Caraman, dernier seigneur des lieux. Cependant, il ne conserva pas longtemps son mandat, démissionnaire, il fut remplacé par le cultivateur Pierre Ducrocq dès le 20 juin suivant.",
                "Les recettes de fonctionnement se montaient à : 5 976 901 € d'impôts et taxes, 5 769 901 € d'une dotation de la communauté de communes, 2 103 566 € de la vente de terrains, 1 043 907 € de dotations et subventions, 579 141 € de produits divers (loyers…) et 370 850 € provenant des produits des services.",
                "À l’élection présidentielle de 2007, le premier tour a vu se démarquer en tête Nicolas Sarkozy avec 34,07 %, suivi de Ségolène Royal avec 22,02 %, François Bayrou avec 17,53 %, Jean-Marie Le Pen avec 14,68 %, enfin Olivier Besancenot avec 4,78 %, aucun autre candidat ne dépassant le seuil des 1,5 %. Le second tour a vu arriver largement en tête Nicolas Sarkozy avec 59,78 % (résultat national : 53,06 %) contre 40,22 % pour Ségolène Royal (national : 46,94 %).",
                "En 2009/2010, le budget moyen d'un club de l'élite est de 14,6 millions d'euros, il a été multiplié par cinq en huit ans mais il est trois fois inférieur à celui d'un club de football de Ligue 1. Dans ce domaine, le rugby est le deuxième sport en France, devant le basket-ball.",
                "le Stade toulousain est en tête du bilan avec 19 titres dont cinq remportés de 1922 à 1927 inclus et quatre consécutifs remportés de 1994 à 1997 inclus;",
                "Les matchs du Top 14 sont actuellement diffusés par Canal+, Canal+ Sport et Rugby+ et la finale du Top 14 est codiffusée en crypté par Canal+ et en clair sur France 2 depuis 2007.",

                "Die Windkiste – Das Rektorat der Antillen (Fort-de-France, Martinique, Frankreich, Kolonialstil um 1900, Christian Hauvette). Produktion 1998, Erstausstrahlung am 9. Juni 2001.",
                "Im Herbst 2008 begann mit den HzL-Classic-Zügen nach 30 Jahren erneut der SPNV, zumindest mit Ausflugszügen. 2009 wurde der Freizeitverkehr als „3-Löwen-Takt Radexpress Eyachtäler“ aufgenommen und schrittweise ausgeweitet. Seit 2012 verkehrt er an allen Sonn- und Feiertagen vom 1. Mai bis zum dritten Sonntag im Oktober. Dabei pendelt ein Triebwagen im Zweistundentakt zwischen Eyach und Hechingen Landesbahn (Kursbuchstrecke 767). Bis 2011 wurde hauptsächlich eine historische MAN-Schienenbus-Garnitur eingesetzt (dann Fristablauf der Fahrzeuge und anschließender Verkauf), die ab 2012 durch moderne Regio-Shuttle ersetzt wurde. Weitere Fahrten gibt es alljährlich zum Haigerlocher Christkindlesmarkt. Zukünftige Fahrpläne sehen einen 30-Minuten-Takt im Anschluss an das Touristikangebot zu der Metropolregion Stuttgart auf der Gäubahn vor.",
                "Im Verlauf der Auseinandersetzungen mit den Ständen war Dietrich versucht, auf das Amt zu verzichten und es wurde geplant, einen Koadjutor zu bestimmen. Insgeheim wurde dafür einer der Söhne Caspars Friedrich von Fürstenberg und später Johann Gottfried von Fürstenberg ausersehen. Dieser Versuch, auch nach Dietrich einen Fürstenberger auf den Bischofssessel in Paderborn zu bringen, scheiterte am zunehmenden Einfluss der Wittelsbacher im Nordwesten des Heiligen Römischen Reiches. Daher wurde 1612 Ferdinand von Bayern zum Koadjutor gewählt.",
                "V.2. Hubert Julius Maximilian gen. Max von Guilleaume (* 17. Februar 1866; † 15. Juni 1932; Geheimer Kommerzienrat) ∞ Clara Michels (1869–1930), Tochter von Gustav Michels",
                "Den Zweiten Weltkrieg überstand das Denkmal ohne größere Schäden. Witterungseinflüsse und Vandalismus erforderten jedoch zu Beginn der 1980er Jahre Maßnahmen zur Rettung des Denkmals. Der desolate Zustand des Marmors und der gewaltige Umfang des Denkmals verhinderten eine Verwahrung des Originaldenkmals und den Ersatz durch eine Nachbildung. Einerseits bestand die Gefahr, dass der Stein bei der Umsetzung einfach zerbröckelt wäre, andererseits stand im Lapidarium, dem üblichen Verwahrungsort, kein Platz zur Verfügung. 1987 erhielt das Denkmal deshalb nach einem Entwurf der Architektin Marianne Wagner ein Schutzdach, eine Stahlkonstruktion in Form eines plexiglasüberdeckten Tonnengewölbes. Ein Wachsüberzug schützt den Stein zusätzlich vor Witterungseinflüssen.",
                "Neben Einzelhandelsgeschäften und kleineren Supermärkten direkt im Ortskern gibt es auch große Bau- und Supermärkte an der Peripherie. Mit dem Bus gelangt man schnell in die Mainzer oder Wiesbadener Innenstadt, mit dem Auto sind es wenige Minuten auf der Autobahn Richtung Frankfurt, Koblenz oder Kaiserslautern. Familien mit Kindern finden in Mombach mehrere Kindergärten, zwei Grundschulen und eine Realschule plus; andere weiterführende Schulen sind mit den öffentlichen Verkehrsmitteln in kurzer Zeit zu erreichen.",
                "Lode war und ist Mitglied in zahlreichen Deutschen, Europäischen und Amerikanischen wissenschaftlichen Vereinigungen. Darunter zählen die Deutsche Gesellschaft für Kinder und Jugendmedizin, die American Association of Cancer Research, die American Society of Hematology, die American Association of Immunologists sowie die American Society of Clinical Oncology. Seit 2013 ist er Mitglied des Beratenden Wissenschaftsausschuss der International Society for Pediatric Oncology Europe Neuroblastoma (SIOPEN), Vorsitzender des Immuntherapie Komitees der SIOPEN und Mitglied des Wissenschaftskomitees der International Society for Pediatric Oncology (SIOP SPAC Member).",
                "Die verschiedenen Umschrift- bzw. Romanisierung-Systeme sind dadurch sehr komplex geworden. Zum Beispiel, die englische Übersetzung des Kubijovyč der Ukraine: A Concise Encyclopædia nutzt eine modifizierte Library of Congress (ALA-LC), wie für ukrainische und russische Namen-mit den Ausnahmen für Endungen oder verdoppelte Konsonanten Anwendung verschiedentlich persönliche und geografische Namen aufgeführt. ",
                "Aus verschiedenen traditionellen, gewohnheitsmäßigen und auch aus technischen Gründen, verwenden Karten in der Enzyklopädie unterschiedliche Namenskonventionen. ",
                "Die Namen der Personen werden meist in der internationalen Schreibweise in der britischen Transkription bei enzyklopädischen Texten wiedergeben. wiedergegeben, sondern daher auch in ihrer ursprünglichen Form im Index. Verschiedene geographische Namen in ihrer englischen, deutschen Transkription, aus der russischen oder in der ukrainischen Schreibweise und der polnischen Formen geben das w bzw. v in verschiedenen Formen wieder.",

                "Nel film Il bisbetico domato, Don Cirillo durante l'allenamento dei suoi ragazzi, poco prima di incontrare il suo amico Elia (A. Celentano), cita tale motto per incitarli a dare il meglio in vista della finale di basket.",
                "L'incontro con Silva è a senso unico, in quanto l'ispanico porta l'avversario a terra subito e lo controlla con un violento e costante ground and pound che porta a far sanguinare Silva al volto: il KO tecnico viene già chiamato nel primo round.",
                "Prima che iniziasse il 24 settembre 2006, la ABC ha usato questa canzone per promuovere il primo episodio, Listen to the Rain on the Roof, della terza stagione di Desperate Housewives.",
                "Ceduto il ruolo di The Falcon al fratello Tom Conway, Sanders si affermò come uno dei migliori attori cinematografici dell'epoca, interprete dall'innata eleganza e dai modi spesso ingannevolmente soavi, e dotato di una gradevole voce baritonale dal marcato accento britannico.",
                "Tra le molte celebri pellicole da lui interpretate, sono da ricordare i thriller Il prigioniero di Amsterdam (1940) e Rebecca - La prima moglie (1940), entrambi diretti da Alfred Hitchcock, Il ritratto di Dorian Gray (1945), in cui interpretò la figura del diabolico e libertino Lord Henry Wotton, il noir Lo sparviero di Londra (1947), il romantico Il fantasma e la signora Muir (1947), nei panni dello spregiudicato scrittore Miles Farley, e il dramma in costume Ambra (1947), in cui vestì i panni del re Carlo II d'Inghilterra, ruolo che avrebbe ripreso una decina di anni più tardi nell'avventura in costume Il ladro del re (1956).",
                "Candela Maza è una ragazza di 15 anni che è rimasta orfana insieme ai suoi fratelli Hosana e Facundo. Il giudice decise che i ragazzi devono andare a vivere insieme allo zio Juan Maza, un uomo ricco.",
                "Nel 2008 consolida la propria presenza nel mercato francese con l'acquisizione del ramo tissue di Novacare s.a. con lo stabilimento di Laval quasi interamente dedicato alla produzione di articoli per il mercato AFH (away from home).",
                "L'ufficio progettazione, sembra ormai certo, si trasferirà a Noale, mentre alla fine anno partono i lavori di ristrutturazione degli stabilimenti di via Parodi 57, con progetto e concessione edilizia già appese sull'esterno della fabbrica.",
                "L'operazione ha causato la messa in cassa integrazione di buona parte degli impiegati e il sorgere di numerose polemiche",
                "Il caso dello smemorato di Collegno, noto anche come caso Bruneri-Canella, è un famoso caso giudiziario e mediatico che si svolse in Italia tra il 1927 e il 1931, riguardante un individuo affetto da amnesia ricoverato presso il manicomio di Collegno.",

                "エノが行きがかり",
                "シャーリー・フィールドは、サン・ベルナルド・アベニュー沿い市民センターとR&Tマーティン高校に隣接してある。1937年にマーティン高校と共に建設された。ラレド独立学区のアウトドア・アスレチックがあり、毎年ボーダー・オリンピックが開催される。通常5,000席だが、エンドゾーンに追加席を加えることで10,000席まで拡大できる。メキシコのプロ・サッカークラブがここで様々な練習試合を行い、天然芝が「良い」サッカー試合を作るとしている。フットボール、サッカーおよび陸上競技が行われる。この歴史ある競技場に大きな改修工事が計画されている。",
                "教会旋法はまず終止音（finalis）によって4つに分類される。そしてそれぞれが音域（ambitus）によって終止音から高くまで上がる正格（authenticus）とあまり上がらない変格（plagalis）の2つに分けられる。 例えば、ドリア旋法はニ音を終止音とする正格旋法であり、ヒポドリア旋法はその変格旋法である。",
                "バロンはブレスラウで金鋳造工のミヒャエル・バロンのもとに生まれた。息子も同じ道を歩むだろうと思われていたが、バロンは早くから音楽に興味を示し、後にそれを職業とした。1710年頃から、コホトというボヘミア人からリュートを学んだ。",
                "ブレスラウのエリザベス朝ギムナジウムに入学し、1715年からはライプツィヒ大学で哲学と法律を学んだ。",
                "ハレ、ケーテン、シュライツ、フェルト、ルドルシュタットを訪れた後、1720年にイエナを訪れ、そこで2年間を過ごした。その後、カッセル、フルダ、ヴュルツブルク、ニュルンベルク、レーゲンスブルクを訪れ、1727年にニュルンベルクで著作『』（ラウテン楽器の歴史的理論と実践的研究）を出版した。",
                "リュート-神々の楽器 と題されたこの作品は、1727年にニュルンベルクで出版された。 1728年、ゴータの宮廷で事故死したリュート奏者ミュッセルの後を継ぎ、4年間その職を務め、ゴータ公の死後アイゼナハに移り、1737年にはメルゼブルク、ケーテン、ツェルプストを訪問。",
                "テオルボを買うためにドレスデンへ行くことを許された。ドレスデンでは、ルーテニストのシルヴィウス・レオポルト・ヴァイスとI.A.ホーファーに教えを受けた。1740年にフリードリヒが即位すると、王立音楽協会のテオービストを務め、その地位は亡くなるまで続いた。",
                "態の転換は接尾辞-gi-、-hi-、-i-によって表される。これらの接尾辞は現代朝鮮語と同様に、態の転換のみならず自動詞の他動詞化や形容詞の動詞化の際にも用いられる。例：'ormgi-（移す）＜ 'orm-（移る）、japi-（捉えられる）＜ jab-（捉える）、siei-（立てる）＜ sie-（立つ）。また、ㄹ語幹に付く態転換接尾辞に-@-/-y-がある。例：sar@-（生かす）＜ sar-（生きる）。",
                "アメリカ合衆国の対メキシコ貿易額の47%、メキシコの対米貿易額の36%がラレド港を出入り口としている。ラレドの経済と生活様式は商業と産業用倉庫業、輸入業および輸出業を中心に回っている。国際貿易の主要な担い手として北アメリカ自由貿易協定の成立で恩恵を受けた。市内のラレド国際空港からはヒューストン、ダラス、およびラスベガスに直行便が飛んでいる。ラレド港にはリオ・グランデ川を渡ってメキシコのタマウリパス州やヌエボ・レオン州に入る5つの国際橋がある。",

                "대한민국에서의 21세기 현대적인 좌익국민주의는 1970년대 후반에서 1980년대 후반까지 민족해방(NL)이라는 진보적인 민주화 운동을 통해서 처음으로 나타났다.",
                "이들중 극소수는 조선민주주의인민공화국의 좌파 파시즘적인 주체사상을 신념으로 가진 세력도 있었지만, 대다수는 비주류이며, 반미적인 좌익국민주의자들이 대부분이다. ",
                "대한민국에서 좌익국민주의는 당시는 노동착취가 만연하고 기득권 그리고 주류 정치인들은 국민주의를 운운해 우민화 정책을 이용하면서, 자신들은 철저한 친미주의자인 시대였고, 이런 시대에서 평등 그리고 복지가 아닌 과한 경쟁과 기득권 안정만을 추구하는적인 사상을 지닌 정치인들이 많았던 시기라는 점에서 큰 지지를 얻었다. ",
                "그러나 이러한 운동은 마르크스 사상을 기초로 한다는 하에 반공주의가 심화된 대한민국에서는 지속적으로 지지를 얻기 힘들었다. 또한 반미적이고 국민주의적이며, 사회주의적인 생각을 가지고 있는 좌익국민주의자들은 때때로 조선민주주의인민공화국과 비슷하다는 소리와 함께 조작된 간첩사건의 주역도 되었다.",
                "자사 노선은 도부 스카이트리라인 오시아게 - 도부 도부쓰코엔 사이, 도부 철도 이세사키 선 도부 도부쓰코엔 - 구키 사이, 도부 닛코 선 도부 도부쓰코엔 - 미나미구리하시 간에서 운용된다. 운행 종별은 원칙으로 준급·급행에서만 운용된다. 기본적으로 30000계와 운용 구분은 없다.",
                "세월호 참사 초기 구조 당시에 현장지휘관 (OSC·On Scene-Commander)인 2일차 청문회 당시 영상을 찍어보낸적이 없다고 부인한 김경일 123정 정장의 휴대폰이 참사 당일 10시 28분, 세월호 2등항해사 김영호 씨 명의의 제주 소재 유선전화로 발신이 되어, 13초 간 통화한 사실이 밝혀졌다.",
                "효모는 세포 수준의 생물학에서 모델 생물의 첫 번째 본보기로 간주해도 좋을 것이다. 호흡 및 효소에 대한 생화학 분야는 여기에서 시작된다. 이어 아카빤카비가 유전학 연구에서 이용되면서 유명해졌다.",
                "그 이후에도 기초 생물학의 여러 분야는 미생물을 모델로 사용하여 왔으나, 오히려 균류보다 더 작고 단순한 미생물이다 박테리아류나 바이러스가 분자 생물학이나 유전학의 모델로 사용되는 것이 많아졌다. ",
                "그러나 이러한 생물은 원핵 세포이며 우리와 같은 진핵 세포가 아니므로 가장 다루기 쉬운 진핵 생물로 균류가 사용되는 예는 많다. ",
                "자주 사용되는 것은 신진 효모 Saccharomyces cerevisiae와 분열 효모 Schizosaccharomyces pombe이다.",

                "Циммерн-об-Ротвайль (нем. Zimmern ob Rottweil) — Германия Федеративдик Республикасынын Баден-Вюртемберг жеринде жайгашкан муниципалитет. Фрайбург административдик округуна карайт. Ротвайль районуна кирет.",
                "Калкы - 3036 киши (31-декабрь, 2010-жыл). Болжолдуу аянты - 12,96 км². Мамлекет ичинде бекитилген расмий коду — 09 2 75 144. Муниципалитеттин башчысы — Йозеф Шецль.",
                "Чым көңдүү күл топурагы басымдуу, ошондой эле чым көңдүү глей, күл-саз топурактары да өөрчүгөн. Эң күрдүү чым көң карбонаттуу топурак өлкөнүн түндүк жана борбордук бөлүктөрүндө, Шяшупе дарыясынын алабында таралган. ",
                "Ири дарыяларынын (Нямунас жана башка) өрөөндөрүнө аллювий топурактары мүнөздүү.",
                "Литванын аймагы ийне-жазы жалбырактуу токой зонасында жайгашкан. ",
                "Токой каптоосу 33,5%. Токоюнун 50%тен ашыгы өлкөнүн түштүк-чыгыш тарабында. ",
                "Жазы жалбырактуу токой негизинен өлкөнүн ортонку бөлүгүндө. Литванын аймагынын 17%ке жакынын шалбаа жана жайыт, 7%ин саз ээлейт.",
                "Орусиянын мамлекеттик суу реестринин маалыматы боюнча Төмөнкү Обь бассейнинин айланасында жатат, дарыянын суу чарбачылык бөлүгү — Таз дарыясы. ",
                "Дарыянын айрыгы — айрыгы жок, дарыя бассейни — Таз.",
                "Камсыздандыруу камсыздоосу – айрым объекттер же камсыздандыруучунун баардык мүлкү камсыздандырылган мүлктү камсыздандыруудагы абсолюттук (нарктык) кошунду. К. к. түшүнүгү камсыздоочу уюмдун жүзөгө ашырган камсыздандыруу түрлөрүнүн жыйындысы боюнча жалпы милдеттенмелерин баалоо үчүн да колдонулат.",

                "W Wicca eklektycznym (raczej w różnych nurtach współczesnego pogaństwa inspirowanego wicca) powyższe zasady nie są przestrzegane. ",
                "Księgę cieni można zaczerpnąć z dowolnego źródła bądź nawet napisać ją samemu.",
                "Istnieje co najmniej kilka opublikowanych wersji księgi cieni napisanych na użytek osób praktykujących wicca eklektyczne. ",
                "W Polsce do bardziej znanych należy Księga Cieni Stojących Kamieni Scotta Cunninghama, opublikowana w jego książce „Wicca. ",
                "Przewodnik dla osób samotnie praktykujących magię”. ",
                "Inną wykorzystywaną księgą cieni jest „Liber umbrarum” Doreen Valiente, opublikowaną w jej książce „Witchcraft for tomorrow”.",
                "Istnieją także internetowe wersje ksiąg cieni, które mogą być wykorzystywane przez wiccan eklektycznych.",
                "Teksas jest największym producentem energii elektrycznej w Stanach Zjednoczonych.",
                "Na terenie stanu licznie występują złoża surowców mineralnych m.in. 30% krajowego wydobycia ropy naftowej i gazu ziemnego, 50% siarki, ponadto wydobywa się grafit, gips, sól kamienna, baryt, rudy żelaza, magnezyty",
                "Tiangong 2 (chiń. 天宫二号, Pałac Niebiański nr 2) – chiński moduł orbitalny przeznaczony do eksperymentów na orbicie z udziałem załogowego statku kosmicznego Shenzhou 11 oraz towarowego Tianzhou. Eksperymenty te będą stanowiły etap w pracach nad chińską stałą stacją orbitalną. Tiangong 2 umieszczony został na orbicie 15 września 2016 r. za pomocą rakiety Chang Zheng 2F. W październiku 2016 roku zacumował do niego załogowy Shenzhou 11 z dwójką załogi, a w kwietniu 2017 zadokował zaopatrzeniowy Tianzhou 1.",

                "Московская Патриархия — учреждение Русской православной церкви, объединяющее структуры, непосредственно руководимые Патриархом. ",
                "Патриарх — священноархимандрит (настоятель) Троице-Сергиевой лавры, а также ряда других монастырей, имеющих статус патриарших ставропигий.",
                "В 1735 году, не дойдя ещё до богословского класса, Ломоносов был вместе с другими двенадцатью учениками Спасского училища отправлен в Петербург и зачислен в студенты университета при Академии Наук. ",
                "По одной из версий, богословская карьера Ломоносова оборвалась из-за вскрывшегося подлога документов при поступлении.",
                "Рукоположение не состоялось, но способный семинарист был направлен на ниву естествознания.",
                "В первые дни пребывания в Петербурге Ломоносов и его товарищи поселились при самой Академии Наук, а в дальнейшем переехали на жительство в снятое Академией каменное здание новгородской епархии на 1-й линии Васильевского острова, около Невы.",
                "Для них были куплены простые деревянные кровати с тюфяками, по одному маленькому столу и стулу, на всех три платяных и три книжных шкафа.",
                "Им были выданы необходимые одежда, обувь, бельё и т. д. Одним из существенных пробелов в их образовании было то, что они не знали немецкого языка, распространённого в то время в Академии. ",
                "Занятия начались с изучения немецкого языка, которому их обучал ежедневно учитель Христиан Герман.",
                "23 ноября 2015 года во «ВКонтакте» и других сайтах (имиджборд «Двач» и прочих) появляются шокирующие фотографии бросившейся под поезд школьницы, известной в социальной сети как Рина Паленкова. Непосредственно перед совершением самоубийства девушка делает «селфи» на фоне проезжающего поезда и выкладывает их на страницы с подписью «ня. пока.». Девушкой оказывается 16-летняя студентка колледжа из Уссурийска Рената Камболина, предположительно решившаяся на этот шаг из-за неурядиц в семье и на фоне сложных личных отношений. В интернете распространяются фотографии и мемы с соответствующим чёрным юмором, использующие слова «Рина» и «Ня. пока».",

                "Web uygulamalarına atfedilmiş bir güvenlik duvarı sunan ilk şirket AppShield ürünü ile birlikte Perfecto Technologies olmuştur.",
                "Bu ürün e-ticaret piyasasına odaklanmıştır ve geçersiz web sayfası karakteri girişlerine karşı koruma sağlamıştır.",
                "Perfecto ismini Sanctum olarak değiştirmiş ve aşağıdaki ilk on web uygulaması saldırı tekniklerini isimlendirmiş ve WAF piyasası için temeli atmıştır:",
                "Köyde ilköğretim okulu vardır. Ancak kullanılmamaktadır.",
                "Köyün içme suyu şebekesi vardır ancak kanalizasyon şebekesi yoktur.",
                "PTT şubesi ve PTT acentesi yoktur. Dergi, ülkenin geleceği açısından Molla Nasreddin ile pek çok konuda amaç birliği içerisinde olan Füyûzat ile dil meselesinde ayrılmıştır",
                "Toplumun büyük bir kısmı okuma yazma bilmediği için Molla Nasredin dergisi yazarları edebi dilin geliştirilmesinde halk diline yönelme gereğini savunmuşlardır.",
                "Köye ulaşımı sağlayan yol asfalt olup köyde elektrik ve sabit telefon vardır.",
                "Dergi, ülkenin geleceği açısından Molla Nasreddin ile pek çok konuda amaç birliği içerisinde olan Füyûzat ile dil meselesinde ayrılmıştır",
                "Füyûzat Arapça- Farsça tamlamalarla ve zaman zaman ağdalı bir Osmanlı üslubuyla seçkin bir kesime hitap ederken, Molla Nasreddin tamamen açık, duru bir Azerbaycan Türkçesiyle ve sade bir üslupla topluma yönelik yayın yapmıştır."

        };
        String[] actualLanguages = {
                "english",
                "english",
                "english",
                "english",
                "english",
                "english",
                "english",
                "english",
                "english",
                "english",

                "french",
                "french",
                "french",
                "french",
                "french",
                "french",
                "french",
                "french",
                "french",
                "french",

                "german",
                "german",
                "german",
                "german",
                "german",
                "german",
                "german",
                "german",
                "german",
                "german",

                "italian",
                "italian",
                "italian",
                "italian",
                "italian",
                "italian",
                "italian",
                "italian",
                "italian",
                "italian",

                "japanese",
                "japanese",
                "japanese",
                "japanese",
                "japanese",
                "japanese",
                "japanese",
                "japanese",
                "japanese",
                "japanese",

                "korean",
                "korean",
                "korean",
                "korean",
                "korean",
                "korean",
                "korean",
                "korean",
                "korean",
                "korean",

                "kyrgyz",
                "kyrgyz",
                "kyrgyz",
                "kyrgyz",
                "kyrgyz",
                "kyrgyz",
                "kyrgyz",
                "kyrgyz",
                "kyrgyz",
                "kyrgyz",

                "polish",
                "polish",
                "polish",
                "polish",
                "polish",
                "polish",
                "polish",
                "polish",
                "polish",
                "polish",

                "russian",
                "russian",
                "russian",
                "russian",
                "russian",
                "russian",
                "russian",
                "russian",
                "russian",
                "russian",

                "turkish",
                "turkish",
                "turkish",
                "turkish",
                "turkish",
                "turkish",
                "turkish",
                "turkish",
                "turkish",
                "turkish"
        };

        // Теперь используем цикл для прогона на каждом из тестовых предложений
        for (int i = 0; i < testSentences.length; i++) {
            String textToIdentify = testSentences[i];
            String identifiedLanguage = identifyLanguage(folderPath, textToIdentify);
            System.out.println("Identified Language: " + identifiedLanguage);
            System.out.println("Actual Language: " + actualLanguages[i]);
            System.out.println("");
        }



    }

    // Methode zur Identifizierung der Sprache mithilfe des Algorithmus
    private static String identifyLanguage(String folderPath, String textToIdentify) {
        long startTime = System.nanoTime();

        double minDifference = Double.MAX_VALUE;
        String identifiedLanguage = "";

        // Lese Dateien aus dem angegebenen Ordner
        File folder = new File(folderPath);
        File[] files = folder.listFiles();

        // Überprüfe, ob Dateien im Ordner existieren
        if (files != null) {
            // Iteriere durch jede Datei im Ordner
            for (File file : files) {
                // Überprüfe, ob die Datei eine Textdatei ist
                if (file.isFile() && file.getName().endsWith(".txt")) {
                    try {
                        // Lese den Inhalt der Textdatei
                        String content = readTextFile(file);
                        String textToTest = content + textToIdentify;

                        // Ermittle die komprimierte Größe des konkatenierten Texts und des einzelnen Texts
                        double zipLengthTextToTest = getCompressedSize(textToTest);
                        double zipLengthContent = getCompressedSize(content);

                        // Berechne die Differenz in den komprimierten Größen
                        double difference = zipLengthTextToTest - zipLengthContent;

                        // Überprüfe auf die kleinste Differenz
                        if (difference < minDifference) {
                            minDifference = difference;
                            // Extrahiere die identifizierte Sprache aus dem Dateinamen
                            identifiedLanguage = file.getName().replace(".txt", "");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }


        } else {
            System.out.println("Der Ordner ist leer oder existiert nicht.");
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1_000_000; // Zeit in Millisekunden

        System.out.println("Laufzeit des Algorithmus: " + duration + " ms");

        return identifiedLanguage;
    }

    // Methode zum Lesen des Inhalts aus einer Textdatei
    private static String readTextFile(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        // Lese jede Zeile und füge sie dem StringBuilder hinzu
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append("\n");
        }
        reader.close();
        return stringBuilder.toString();
    }

    // Methode zur Ermittlung der komprimierten Größe des Texts mithilfe von Deflater
    private static double getCompressedSize(String text) throws IOException {
        // ByteArrayOutputStream zum Speichern der komprimierten Daten initialisieren
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        // Deflater für die Kompression initialisieren
        Deflater deflater = new Deflater();

        // DeflaterOutputStream initialisieren, um den komprimierten Text zu schreiben
        OutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
        deflaterOutputStream.write(text.getBytes());

        // Den DeflaterOutputStream schließen, um die vollständige Komprimierung abzuschließen
        deflaterOutputStream.close();

        // Gib die Größe der komprimierten Daten zurück
        return byteArrayOutputStream.toByteArray().length;
    }
}



