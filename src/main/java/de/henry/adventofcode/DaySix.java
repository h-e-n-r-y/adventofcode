package de.henry.adventofcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Solves the "customs declaration forms"-Riddle of December 6th 2020.
 * https://adventofcode.com/2020
 * 
 * @author henry
 *
 */
public class DaySix {
	
	private static final String INPUT = "iwaduermzfyc\n"
			+ "zdmrlfyau\n"
			+ "wfdzhrmauy\n"
			+ "yfzdmaru\n"
			+ "dtagqzbovprnyufm\n"
			+ "\n"
			+ "qblufrmcdiyg\n"
			+ "qlbrguycvim\n"
			+ "rbcugqymipnol\n"
			+ "cyrxvmqiugbld\n"
			+ "\n"
			+ "qlszkm\n"
			+ "mlzksqo\n"
			+ "kmsqlzgwr\n"
			+ "qfzslkm\n"
			+ "mvlksqz\n"
			+ "\n"
			+ "dgxpqkmnfbz\n"
			+ "bvaqgnxmfkp\n"
			+ "nfgbkmqpx\n"
			+ "qnpgbakfmx\n"
			+ "\n"
			+ "bdzj\n"
			+ "imbuqjo\n"
			+ "\n"
			+ "wrt\n"
			+ "ahd\n"
			+ "uodk\n"
			+ "da\n"
			+ "lu\n"
			+ "\n"
			+ "edshb\n"
			+ "bhdse\n"
			+ "ebdsh\n"
			+ "bhsde\n"
			+ "ehsbd\n"
			+ "\n"
			+ "jbcosmfq\n"
			+ "pwhjqobms\n"
			+ "gajnsbtyqvrx\n"
			+ "jqlmbksced\n"
			+ "puhsobimjkq\n"
			+ "\n"
			+ "kwamuzxefjdh\n"
			+ "hkwefujxdmza\n"
			+ "zmahefxdjuwk\n"
			+ "\n"
			+ "fqdekjsohmapxcv\n"
			+ "mspojfeqchdvxak\n"
			+ "khxmfpqtsdocveja\n"
			+ "xpmcaofdvqshkje\n"
			+ "exvkdqpahsmjcof\n"
			+ "\n"
			+ "e\n"
			+ "e\n"
			+ "e\n"
			+ "e\n"
			+ "e\n"
			+ "\n"
			+ "evpzjxh\n"
			+ "njkhfwxaz\n"
			+ "hzxjb\n"
			+ "xzhjp\n"
			+ "zxhcj\n"
			+ "\n"
			+ "rpxuhocalwzimgq\n"
			+ "ohabqlzcxp\n"
			+ "fqzploknaxvjyhd\n"
			+ "oeplzbhtxqa\n"
			+ "pxotwhlqsazg\n"
			+ "\n"
			+ "gsojiczhxte\n"
			+ "ueztjxacsfihg\n"
			+ "zsctgxjieh\n"
			+ "yegxiqjshtzc\n"
			+ "jgpirctszdwenmhxlbv\n"
			+ "\n"
			+ "wivcamperqnhbfyxz\n"
			+ "mheivqblpuwgzy\n"
			+ "\n"
			+ "fbkgvetioyx\n"
			+ "gxuflyrqwvkae\n"
			+ "fgyvnekx\n"
			+ "bsexyvghkfz\n"
			+ "fyexgsmvk\n"
			+ "\n"
			+ "jierpsnvdykz\n"
			+ "itadlxypu\n"
			+ "ubdpycio\n"
			+ "iyopdq\n"
			+ "\n"
			+ "kupenvlbdsfqtjgh\n"
			+ "tplszfghbjcvidnqeku\n"
			+ "tdsqhfrgbvjulnwkep\n"
			+ "qufvnjetlsbpdgkh\n"
			+ "tqpfndmbvulkghseaj\n"
			+ "\n"
			+ "qaw\n"
			+ "wae\n"
			+ "tw\n"
			+ "wgj\n"
			+ "\n"
			+ "kzid\n"
			+ "ikz\n"
			+ "\n"
			+ "kyxaqwnvucidbflreghsmt\n"
			+ "luehtsfrywkbidqoan\n"
			+ "\n"
			+ "zrk\n"
			+ "gzrak\n"
			+ "kpsd\n"
			+ "k\n"
			+ "k\n"
			+ "\n"
			+ "zkja\n"
			+ "pxigkfbsecdnh\n"
			+ "ajwyumvtk\n"
			+ "lwvkqo\n"
			+ "\n"
			+ "ghfblwixs\n"
			+ "pbzhlifnsqcew\n"
			+ "\n"
			+ "axmuhos\n"
			+ "ylmxhi\n"
			+ "duomxh\n"
			+ "hxma\n"
			+ "trmfqhekzgpxwc\n"
			+ "\n"
			+ "mubieqjlwkgyacs\n"
			+ "cmlyeauqjiwgskb\n"
			+ "lsgmjeyqwucbaik\n"
			+ "\n"
			+ "bn\n"
			+ "nb\n"
			+ "nb\n"
			+ "nb\n"
			+ "dbyn\n"
			+ "\n"
			+ "gcmd\n"
			+ "mgdc\n"
			+ "mgdacq\n"
			+ "mdgc\n"
			+ "\n"
			+ "ewsjylqrxuftnado\n"
			+ "lvyuhgkidpqcwbz\n"
			+ "\n"
			+ "xyhtj\n"
			+ "htsyqjxpc\n"
			+ "xtjyh\n"
			+ "\n"
			+ "kzbxdhusvmqao\n"
			+ "kvbphfojus\n"
			+ "bkoushv\n"
			+ "\n"
			+ "egiltzxynrjdumwbqcs\n"
			+ "rypkbxiultgqzmwfs\n"
			+ "ugyziqfmstlaxobwr\n"
			+ "\n"
			+ "uoxalvtnhy\n"
			+ "olgpwzaebrthmnixqyfc\n"
			+ "\n"
			+ "mwgpjfbnli\n"
			+ "cytevrafsukqo\n"
			+ "\n"
			+ "onpjurvcix\n"
			+ "stfmzjgpwu\n"
			+ "ujpbvox\n"
			+ "\n"
			+ "yurxcdoangpmj\n"
			+ "duytponmjgaxcrw\n"
			+ "nvcdogajumrxyp\n"
			+ "pjoyrmugcxnad\n"
			+ "\n"
			+ "vtydbxfr\n"
			+ "bfodyt\n"
			+ "dufybt\n"
			+ "idybrftq\n"
			+ "ndztfsmcwylbep\n"
			+ "\n"
			+ "sblnkuypvamofcrzdqxhje\n"
			+ "bfxldcrwjnopqkys\n"
			+ "yspfqgobdxrtcljnk\n"
			+ "xklqsprjbioycndf\n"
			+ "\n"
			+ "nrmfi\n"
			+ "mgituvxhp\n"
			+ "rnim\n"
			+ "\n"
			+ "wbmdtpjxkr\n"
			+ "bdkxptj\n"
			+ "xtbkpdj\n"
			+ "btdkpxj\n"
			+ "\n"
			+ "ciekfw\n"
			+ "gwkefnc\n"
			+ "hcekfw\n"
			+ "wckfje\n"
			+ "\n"
			+ "u\n"
			+ "k\n"
			+ "u\n"
			+ "axth\n"
			+ "\n"
			+ "y\n"
			+ "h\n"
			+ "\n"
			+ "mfkgxp\n"
			+ "xgpmf\n"
			+ "xmfpg\n"
			+ "gfxpm\n"
			+ "\n"
			+ "jmhsoidplratz\n"
			+ "loimdprtah\n"
			+ "hlodmrtaip\n"
			+ "\n"
			+ "wtg\n"
			+ "lwt\n"
			+ "wpt\n"
			+ "tcw\n"
			+ "zkbhiw\n"
			+ "\n"
			+ "umwhbqykcfpe\n"
			+ "dznjeyxaitbcmorw\n"
			+ "elcmwykbv\n"
			+ "\n"
			+ "lvpitkqwu\n"
			+ "kjpfclwqvt\n"
			+ "\n"
			+ "gmzjpkxtv\n"
			+ "mvtjx\n"
			+ "vtmjx\n"
			+ "vxmtj\n"
			+ "xmjvt\n"
			+ "\n"
			+ "uokaqlfv\n"
			+ "vaqfxup\n"
			+ "qfvoukaj\n"
			+ "\n"
			+ "oidcu\n"
			+ "by\n"
			+ "\n"
			+ "vxo\n"
			+ "xov\n"
			+ "xvo\n"
			+ "\n"
			+ "qrzkbcioujsy\n"
			+ "ukqstiyz\n"
			+ "pzkuiyqs\n"
			+ "qkzdyuis\n"
			+ "\n"
			+ "efjbgqzhrycnvk\n"
			+ "vnycfrbgkzjeh\n"
			+ "\n"
			+ "yjgrwla\n"
			+ "vzed\n"
			+ "oy\n"
			+ "\n"
			+ "druxgb\n"
			+ "bdgm\n"
			+ "kgxbu\n"
			+ "fgsbeq\n"
			+ "\n"
			+ "uvkah\n"
			+ "ahvku\n"
			+ "auvhk\n"
			+ "\n"
			+ "blkqsho\n"
			+ "hkyjqsuobl\n"
			+ "ohkqsbl\n"
			+ "\n"
			+ "rbimoglvhdkjstaqy\n"
			+ "myarioqdxtljkhbvsg\n"
			+ "gystjrhmloabivqdk\n"
			+ "yuslatdojmrgikvqbh\n"
			+ "\n"
			+ "nxfouqhsjz\n"
			+ "qsupzfoxnhj\n"
			+ "\n"
			+ "utxaghbricml\n"
			+ "ctbspquxwgkioern\n"
			+ "yujfvdbzi\n"
			+ "\n"
			+ "gtery\n"
			+ "efgrt\n"
			+ "yrtge\n"
			+ "ertg\n"
			+ "tgrqe\n"
			+ "\n"
			+ "nquewmlgbxpo\n"
			+ "wbymzlheuc\n"
			+ "ywevurmbhl\n"
			+ "bwmeulsjtcad\n"
			+ "wbierumaykl\n"
			+ "\n"
			+ "laidnpehksuybrjfwgxcqzvm\n"
			+ "poyiduqkcxanelghsw\n"
			+ "\n"
			+ "xqljtm\n"
			+ "vntiqkfpym\n"
			+ "\n"
			+ "sziguyprwob\n"
			+ "chunwizgy\n"
			+ "igunzylwct\n"
			+ "giwtjyuvz\n"
			+ "uzwmiyg\n"
			+ "\n"
			+ "eiczlqurydafjvg\n"
			+ "lczvrifeujaqdgy\n"
			+ "crqwtlnagkbuyxfdeivzj\n"
			+ "\n"
			+ "mg\n"
			+ "mg\n"
			+ "gm\n"
			+ "mg\n"
			+ "pmgn\n"
			+ "\n"
			+ "uhnisjvtaow\n"
			+ "usodbnpewj\n"
			+ "\n"
			+ "humogatsr\n"
			+ "mgahswcujtoer\n"
			+ "uqantosgmhr\n"
			+ "smargtuoh\n"
			+ "mougtsarh\n"
			+ "\n"
			+ "jdkhmoqvtrigbfac\n"
			+ "mfyrsjevhgdcboiaxw\n"
			+ "fcjiagovdmbrhs\n"
			+ "\n"
			+ "qaklxrwijuztsvpymce\n"
			+ "saxyvkletrjgfumpiwz\n"
			+ "rwvaqspyjmiklteuxz\n"
			+ "\n"
			+ "spcjfoelh\n"
			+ "auejpcfs\n"
			+ "\n"
			+ "pxuj\n"
			+ "xojzhin\n"
			+ "\n"
			+ "rceuomtqsikgj\n"
			+ "skogqeircumj\n"
			+ "gmrueqckoijs\n"
			+ "mesjoqckirgu\n"
			+ "\n"
			+ "bn\n"
			+ "lkb\n"
			+ "bk\n"
			+ "\n"
			+ "ykgwqtxcjblnpe\n"
			+ "gytwemsbqupahnkixdo\n"
			+ "\n"
			+ "uhglnqjf\n"
			+ "ubhqkxmsyogrte\n"
			+ "uhgnjqcd\n"
			+ "vghijqu\n"
			+ "\n"
			+ "tajvmlfkhpgsuq\n"
			+ "tvuakpifqmgnh\n"
			+ "amupnfhgqzvtk\n"
			+ "\n"
			+ "xpaq\n"
			+ "nylehubatvi\n"
			+ "arswo\n"
			+ "\n"
			+ "kbhip\n"
			+ "upihbk\n"
			+ "pikbh\n"
			+ "hpbki\n"
			+ "\n"
			+ "nbfcwzlausepqdhtiykj\n"
			+ "pfkqbhyuseawdcztlnji\n"
			+ "pljqbszkuytwdchafnei\n"
			+ "efkqituynpschbzldawj\n"
			+ "jpnyfzhaskdelbutqciw\n"
			+ "\n"
			+ "xmjnuraeksqclvy\n"
			+ "uljeyxckrqsnamv\n"
			+ "msekrcnuvqjlaxy\n"
			+ "lakcmyesnruxvjq\n"
			+ "sakrqmexlcnjyuv\n"
			+ "\n"
			+ "gfuotyvwzxepcdqlk\n"
			+ "yxwfqpotuelzcvdkg\n"
			+ "tdowvzfkegxlucqyp\n"
			+ "\n"
			+ "bdzkpvacrmhuonisy\n"
			+ "shikoudnarcypxmfvz\n"
			+ "wdskihrzoynmpavcu\n"
			+ "vizrodsyuckhnmapg\n"
			+ "bdrmkcpyivanzouhs\n"
			+ "\n"
			+ "cerdpblwsukqzgnixmhvf\n"
			+ "rfezsuhgkdbxcinwqpvl\n"
			+ "eysoqvkxuirbpfcdwhzln\n"
			+ "fkmhprcixbsvuqledanwz\n"
			+ "lufkqbrnwvezhjdpxcsi\n"
			+ "\n"
			+ "yiupdaq\n"
			+ "tykdpioqu\n"
			+ "\n"
			+ "ld\n"
			+ "sdl\n"
			+ "\n"
			+ "txwdhbp\n"
			+ "iwbxdn\n"
			+ "coalejvdkbgfu\n"
			+ "zdstbr\n"
			+ "zmbqyd\n"
			+ "\n"
			+ "jdgqxwfbhecizmausykprotv\n"
			+ "cgokdaxvwfypzerhqitsm\n"
			+ "fpyvrwzagcixmhtkdqeos\n"
			+ "\n"
			+ "idbfusrwtqvn\n"
			+ "dusbnqfcrivw\n"
			+ "\n"
			+ "xldkwe\n"
			+ "qaytum\n"
			+ "\n"
			+ "hvpotjgxbra\n"
			+ "wajnovpbxr\n"
			+ "duroaybfjpx\n"
			+ "xacpjbltrio\n"
			+ "\n"
			+ "a\n"
			+ "a\n"
			+ "ia\n"
			+ "\n"
			+ "jkfotirpayg\n"
			+ "ytoarjkigp\n"
			+ "rogkaytpij\n"
			+ "gpyaktcojri\n"
			+ "\n"
			+ "vjyimxuqdf\n"
			+ "osdrekgyihnfa\n"
			+ "ytlpdwifb\n"
			+ "\n"
			+ "sozivyegmtuhxqfblcrakjn\n"
			+ "vgyczxqjoriuktfbehnslm\n"
			+ "qvombncjtkexrzfhyigusl\n"
			+ "\n"
			+ "tkfnhxzrmuiowe\n"
			+ "xeibtmuwfn\n"
			+ "nfmwxtduei\n"
			+ "mpuexbifwgntq\n"
			+ "\n"
			+ "h\n"
			+ "h\n"
			+ "yc\n"
			+ "h\n"
			+ "\n"
			+ "kvqozebgtahjyipcd\n"
			+ "agzebopvtkyjdcih\n"
			+ "cbahzyogtjveipdk\n"
			+ "dbtahigckzypvjoe\n"
			+ "\n"
			+ "adbpjxlgkrtcyqz\n"
			+ "brzqtxcgkjlayd\n"
			+ "zqphgckytxrlajdb\n"
			+ "jtmaqwbkgfrdcyizlxs\n"
			+ "lrjbectxzdgqahyk\n"
			+ "\n"
			+ "hntrcwu\n"
			+ "er\n"
			+ "yrqf\n"
			+ "ker\n"
			+ "r\n"
			+ "\n"
			+ "xc\n"
			+ "cx\n"
			+ "rcyx\n"
			+ "xc\n"
			+ "xc\n"
			+ "\n"
			+ "rfcizqyuendtbjgvshalmk\n"
			+ "hitbeujyncadosklzvfgqmr\n"
			+ "vebgukhrjqtzpyailsnd\n"
			+ "drqzvywbtihgkxauslnej\n"
			+ "\n"
			+ "bkvxumfrcedjpwlhianotg\n"
			+ "gfzeavcdxwbpniuhtojmlkr\n"
			+ "fljouhnkvtseamrwpbdigxcy\n"
			+ "patkdvmjqenxcwglfuorbhi\n"
			+ "kfouqivmpblxagrtdnwjehc\n"
			+ "\n"
			+ "fkelyhdrij\n"
			+ "phkrmuoieyx\n"
			+ "bwhceyiqkr\n"
			+ "xzkuhmylaivred\n"
			+ "ydirekfpth\n"
			+ "\n"
			+ "wbhymxv\n"
			+ "fgjph\n"
			+ "\n"
			+ "uigajlyo\n"
			+ "zugjhqni\n"
			+ "jbuhgi\n"
			+ "\n"
			+ "vzqplnhuoiwsct\n"
			+ "wnuvipqs\n"
			+ "spinwqfvu\n"
			+ "isvqpnwu\n"
			+ "\n"
			+ "xfbwaho\n"
			+ "xuaofwyln\n"
			+ "\n"
			+ "ciurnqwftzplmgyhda\n"
			+ "olceapvs\n"
			+ "csljkape\n"
			+ "axcblp\n"
			+ "\n"
			+ "ztrsayu\n"
			+ "kcefwlb\n"
			+ "\n"
			+ "rmeuk\n"
			+ "ukerm\n"
			+ "kumre\n"
			+ "urmek\n"
			+ "\n"
			+ "qlakzcpeimybjtrhufds\n"
			+ "dfasmtzylrhcuiekqbpj\n"
			+ "uyzqalrihcdbmpsjetfkn\n"
			+ "tekpdbhzcuasyilmqfrj\n"
			+ "jydsmfxckbrptiezaquhl\n"
			+ "\n"
			+ "ldbhawit\n"
			+ "\n"
			+ "wyajlmvxuieogzbqnhpfs\n"
			+ "jbfazsonuexyw\n"
			+ "fdxascejzyunobrw\n"
			+ "zyftuajnwexbkso\n"
			+ "\n"
			+ "hotwcuxzbejpg\n"
			+ "vxjgchpetwnqzy\n"
			+ "\n"
			+ "ftozydwpj\n"
			+ "uwrdvplyz\n"
			+ "hqpznrsydw\n"
			+ "dnzgawyqp\n"
			+ "azywdp\n"
			+ "\n"
			+ "abcmorpqlzyeiktu\n"
			+ "uwlfnzomhrxkace\n"
			+ "\n"
			+ "wmbhacsx\n"
			+ "whbxmacfe\n"
			+ "\n"
			+ "burjz\n"
			+ "zjrb\n"
			+ "jbr\n"
			+ "kbjtgrl\n"
			+ "rbj\n"
			+ "\n"
			+ "kzxwaunvcpoebfg\n"
			+ "iugvzyjkncbfpwe\n"
			+ "dcfbwghuqkzpslrenmvt\n"
			+ "\n"
			+ "ufmqzbtwcop\n"
			+ "tzwubcmoqfkp\n"
			+ "ctuwfpoqmbz\n"
			+ "cwbzmqutpof\n"
			+ "\n"
			+ "zobu\n"
			+ "qfuztob\n"
			+ "ozub\n"
			+ "buzo\n"
			+ "obuz\n"
			+ "\n"
			+ "ekludvj\n"
			+ "mvduqyg\n"
			+ "oshaifnc\n"
			+ "\n"
			+ "spl\n"
			+ "pxfdzs\n"
			+ "sdaxtnp\n"
			+ "vycps\n"
			+ "\n"
			+ "ebouryktmjdzgvplcxnsf\n"
			+ "gusbnmjfdrzkocpevt\n"
			+ "hsntwefzrgckjpbumdvo\n"
			+ "njmibtducgrzfkoevps\n"
			+ "onmdsfvzjcghpubekrt\n"
			+ "\n"
			+ "tqjnvdhaixrmycz\n"
			+ "rzjmyvaqxwdtci\n"
			+ "maxkqyrtjvecdiz\n"
			+ "dvqtyjmzapxrci\n"
			+ "\n"
			+ "qevs\n"
			+ "lhi\n"
			+ "\n"
			+ "lsdvjgwtefqhpxuioykbanrz\n"
			+ "xrknyjoszeblifpwgtdvhqua\n"
			+ "jzedwghuofytaxsvnlqpbirk\n"
			+ "bqtvpkxjswlhfrudniezaygo\n"
			+ "doljnfphutrievzsyaxwkqbg\n"
			+ "\n"
			+ "abwjgxkvdpnzeofr\n"
			+ "mdtsfioyquzhecl\n"
			+ "\n"
			+ "vaemqpsif\n"
			+ "apsmjqkvfei\n"
			+ "pfvoeimsaq\n"
			+ "mfvosiapqer\n"
			+ "seipqlrmafv\n"
			+ "\n"
			+ "e\n"
			+ "e\n"
			+ "e\n"
			+ "e\n"
			+ "e\n"
			+ "\n"
			+ "ermiy\n"
			+ "lxfsezmruiqtk\n"
			+ "rdpeimv\n"
			+ "eihrbm\n"
			+ "\n"
			+ "tjuflnkszgwvxdmebphyoc\n"
			+ "fuhkmtopngvdjwsxczley\n"
			+ "mqidxojfsuhlyczwnepgkv\n"
			+ "\n"
			+ "srpnizhuwlcyf\n"
			+ "sfzoucpynwdrlhi\n"
			+ "uryawfnplshzci\n"
			+ "winflsruzphcy\n"
			+ "ypcfzriwulsnh\n"
			+ "\n"
			+ "hwfpuyn\n"
			+ "lahopnftdzywk\n"
			+ "ifywnph\n"
			+ "\n"
			+ "ujaewsblrkidv\n"
			+ "blarwevdu\n"
			+ "ewurmnldbva\n"
			+ "gudwablevr\n"
			+ "barezvwlud\n"
			+ "\n"
			+ "qjiayxckn\n"
			+ "jaxkqyi\n"
			+ "\n"
			+ "fwtkmvslieqpxz\n"
			+ "lgxsuihyvzpkfwqe\n"
			+ "zfwhekxlsqipv\n"
			+ "zseqdyvfiuxlkphwc\n"
			+ "\n"
			+ "hlcskadr\n"
			+ "askhrldc\n"
			+ "hscrldak\n"
			+ "asclurhdk\n"
			+ "\n"
			+ "wufilybhsndoc\n"
			+ "kerzjwxsm\n"
			+ "wztrsjgaemp\n"
			+ "\n"
			+ "z\n"
			+ "z\n"
			+ "t\n"
			+ "\n"
			+ "kyqod\n"
			+ "node\n"
			+ "\n"
			+ "fwj\n"
			+ "fjw\n"
			+ "fwjc\n"
			+ "fjw\n"
			+ "\n"
			+ "moxrkcugsipbt\n"
			+ "mbudctwkgpxys\n"
			+ "mscpkbgxijtou\n"
			+ "thcmxpqzkusvflnbg\n"
			+ "raktsoxugbpcm\n"
			+ "\n"
			+ "zegphbnmaysoj\n"
			+ "pyqniguvwtl\n"
			+ "\n"
			+ "yqrliu\n"
			+ "shgycqp\n"
			+ "cyuzfal\n"
			+ "xytbvmwo\n"
			+ "\n"
			+ "vcrehwzybmlgktdpqsxfja\n"
			+ "iltbarjdosnqzywfckxv\n"
			+ "\n"
			+ "h\n"
			+ "h\n"
			+ "h\n"
			+ "h\n"
			+ "h\n"
			+ "\n"
			+ "dwinekmthbcsjxvzpaq\n"
			+ "bjwzximactvdnehkqsp\n"
			+ "mezvnpkqtjwhdsbxcia\n"
			+ "\n"
			+ "cnoybehf\n"
			+ "ehcofnb\n"
			+ "eohvbcnfk\n"
			+ "\n"
			+ "dqorpjnciuzx\n"
			+ "drciqzpjuxon\n"
			+ "cqrxpuizjdno\n"
			+ "nozrqicpxdju\n"
			+ "cuoqipthngzsxjdr\n"
			+ "\n"
			+ "qgyditruzoh\n"
			+ "irzuqodgyht\n"
			+ "oyrhitzguqd\n"
			+ "gqzydihrout\n"
			+ "jozdyuitfgqhr\n"
			+ "\n"
			+ "iwcyv\n"
			+ "yn\n"
			+ "\n"
			+ "ubjkctshvlrxpeydigzao\n"
			+ "alesrovdczjxibukhgpty\n"
			+ "tlczbukeyahgnxjivmsrdpo\n"
			+ "\n"
			+ "vhstrpwzdy\n"
			+ "gokxabufm\n"
			+ "qinejclry\n"
			+ "\n"
			+ "iytqrcoubzj\n"
			+ "octzrujxylbq\n"
			+ "\n"
			+ "sphaldfykcm\n"
			+ "fvhmrcqyuapldt\n"
			+ "whclmpdfasy\n"
			+ "khiclymfdpa\n"
			+ "\n"
			+ "lsuybvitm\n"
			+ "bvymtlsi\n"
			+ "\n"
			+ "vpyhfrciuqjbotnzxgaed\n"
			+ "qnyugvbzphioejrctxd\n"
			+ "\n"
			+ "dflgwrkesnzatpu\n"
			+ "dawtpezlkgnrfsu\n"
			+ "kalswznfguptrde\n"
			+ "\n"
			+ "helzx\n"
			+ "exhl\n"
			+ "elxh\n"
			+ "\n"
			+ "cvw\n"
			+ "vwc\n"
			+ "wvc\n"
			+ "\n"
			+ "uwhyajzlbirfvxkeq\n"
			+ "fravqjzebiklxywhu\n"
			+ "zlajiqbuxkhfrwyve\n"
			+ "buwrxyfkjivqzlaeh\n"
			+ "\n"
			+ "kcdglshnzopaityux\n"
			+ "hagpclikonydtsuzx\n"
			+ "xaihknpoldtyscgzu\n"
			+ "\n"
			+ "m\n"
			+ "m\n"
			+ "u\n"
			+ "m\n"
			+ "\n"
			+ "l\n"
			+ "iw\n"
			+ "\n"
			+ "ujbfdygsm\n"
			+ "vprliowa\n"
			+ "\n"
			+ "knpurmwljsebzatdgxfyoi\n"
			+ "xynugrzebopclvwfktimd\n"
			+ "\n"
			+ "xguzneby\n"
			+ "kpfoidglmnwacvqr\n"
			+ "hntjge\n"
			+ "\n"
			+ "vlqmnj\n"
			+ "lmvqjn\n"
			+ "qlmvjn\n"
			+ "pjcqmnvla\n"
			+ "nmlvqj\n"
			+ "\n"
			+ "vfx\n"
			+ "fxv\n"
			+ "\n"
			+ "gmakihxfusr\n"
			+ "ikfmaregxhu\n"
			+ "\n"
			+ "hx\n"
			+ "hx\n"
			+ "hx\n"
			+ "xh\n"
			+ "\n"
			+ "duyqvncfr\n"
			+ "cvdgrfunqy\n"
			+ "vudchqyrnf\n"
			+ "urqfyncdv\n"
			+ "yvdfgqnrcu\n"
			+ "\n"
			+ "k\n"
			+ "u\n"
			+ "entb\n"
			+ "\n"
			+ "clkrqustv\n"
			+ "ktulqecsvr\n"
			+ "kucstqlvr\n"
			+ "\n"
			+ "iyp\n"
			+ "iy\n"
			+ "\n"
			+ "wqjkczvbdnst\n"
			+ "tdjnvcbszmkuwq\n"
			+ "kzctdnwvjbqs\n"
			+ "akjdqbsvtizncw\n"
			+ "xsptcqwvkbnjdz\n"
			+ "\n"
			+ "cxmhkotez\n"
			+ "tgvphemck\n"
			+ "\n"
			+ "hktgv\n"
			+ "hgtnvk\n"
			+ "htgkv\n"
			+ "kthvg\n"
			+ "kgjxtshv\n"
			+ "\n"
			+ "nma\n"
			+ "a\n"
			+ "vdacx\n"
			+ "\n"
			+ "hmktfpbidasnvlycezwgx\n"
			+ "gfnlsdotviazmecphyk\n"
			+ "dktoaczyshepnlfmgvi\n"
			+ "\n"
			+ "dcozuyl\n"
			+ "uzyoldkc\n"
			+ "zdoclyu\n"
			+ "\n"
			+ "sx\n"
			+ "yzl\n"
			+ "gw\n"
			+ "t\n"
			+ "g\n"
			+ "\n"
			+ "quald\n"
			+ "luhar\n"
			+ "acmkupwnl\n"
			+ "dlau\n"
			+ "adflyu\n"
			+ "\n"
			+ "kuveojiwzpnqxrfth\n"
			+ "zwprjfehqotuaxknv\n"
			+ "bcwevjkxitqzdupfhnor\n"
			+ "ertvljpqkhzfuwxgno\n"
			+ "\n"
			+ "z\n"
			+ "z\n"
			+ "z\n"
			+ "z\n"
			+ "m\n"
			+ "\n"
			+ "uvgtdaqwniflojepr\n"
			+ "aueorgvjiplnfdt\n"
			+ "efiaupjovrldtgn\n"
			+ "fjopvliuxtdeargn\n"
			+ "\n"
			+ "za\n"
			+ "az\n"
			+ "za\n"
			+ "\n"
			+ "tkdjofl\n"
			+ "ecugdyoxj\n"
			+ "\n"
			+ "xnjvdyarg\n"
			+ "vfdnryjxg\n"
			+ "zdrxvnpyjg\n"
			+ "agxyjdnrv\n"
			+ "xndrgjvyf\n"
			+ "\n"
			+ "pbwzmfjvgahx\n"
			+ "wvxfapzmhgjb\n"
			+ "bvtzaxkmjfgpuh\n"
			+ "\n"
			+ "pwg\n"
			+ "wgp\n"
			+ "gmwp\n"
			+ "\n"
			+ "jvypfm\n"
			+ "kh\n"
			+ "gzdot\n"
			+ "\n"
			+ "iwqsxlgrkhodme\n"
			+ "isgerxlmqdhkw\n"
			+ "esxwramnlqgbkidh\n"
			+ "\n"
			+ "q\n"
			+ "v\n"
			+ "\n"
			+ "ulphs\n"
			+ "hpsl\n"
			+ "yopzxlths\n"
			+ "lpsh\n"
			+ "\n"
			+ "cnfgljuxaths\n"
			+ "fljxhundg\n"
			+ "\n"
			+ "cpfehsduxbqarogjilt\n"
			+ "kqezudcilypbnjorfa\n"
			+ "zociruejldfnbvmaqp\n"
			+ "\n"
			+ "ewtfjax\n"
			+ "qpczkufbwxjhna\n"
			+ "wafjyxd\n"
			+ "\n"
			+ "yasjgukbqdfczhnm\n"
			+ "sghnfdbmyaczujqk\n"
			+ "adqksjybzfcugmnh\n"
			+ "qcjzyshkungdfmbra\n"
			+ "\n"
			+ "ymoj\n"
			+ "jyoc\n"
			+ "sor\n"
			+ "\n"
			+ "eingkycmfzspdj\n"
			+ "dcjomypeitkubf\n"
			+ "djcykfmpegi\n"
			+ "\n"
			+ "fvlyuzgebichdwopmtrkasj\n"
			+ "jctvsbugdmkoyearlphizfw\n"
			+ "tambvrwlupyiokdzshecgj\n"
			+ "plcbwedtzjsakmihuvoryg\n"
			+ "modcubahjtglyrszeivnwkp\n"
			+ "\n"
			+ "qced\n"
			+ "qwce\n"
			+ "xqdce\n"
			+ "hnqeslcpgz\n"
			+ "ecqj\n"
			+ "\n"
			+ "hcvapid\n"
			+ "vjzonw\n"
			+ "tvmf\n"
			+ "\n"
			+ "zfuvpqom\n"
			+ "evufopqmzb\n"
			+ "pvqfuomz\n"
			+ "oumynfvpqz\n"
			+ "\n"
			+ "toxpjkrndwahum\n"
			+ "wandohmrlpj\n"
			+ "dirajwolnhpem\n"
			+ "dhejacpomnrwf\n"
			+ "jwadhionprm\n"
			+ "\n"
			+ "rs\n"
			+ "rs\n"
			+ "\n"
			+ "vgxlwkqnm\n"
			+ "nvqwgxlmk\n"
			+ "qlgmkwdnxv\n"
			+ "qwxnmglkv\n"
			+ "xmqkvglnw\n"
			+ "\n"
			+ "vxyhlaod\n"
			+ "tqsnzejp\n"
			+ "\n"
			+ "kosjlemhcq\n"
			+ "rcvuyi\n"
			+ "gwvzcrdbntx\n"
			+ "\n"
			+ "xgevmlpzodtrwnsckybf\n"
			+ "grwbizsxokcneftlydm\n"
			+ "\n"
			+ "puzrmhtfygawovsqnlijdckb\n"
			+ "tkuwjnadhlqeopmcgzifbrsy\n"
			+ "loyipshkjqtezcwdgfanmubr\n"
			+ "dpfnjwqayismrtlhecougkzb\n"
			+ "kzpothwfsucqmadbrgiynjl\n"
			+ "\n"
			+ "wrcmlnibykxeagqjtshudf\n"
			+ "ouplqxmbrtygnziajedfkwvc\n"
			+ "\n"
			+ "yij\n"
			+ "ibjw\n"
			+ "jiy\n"
			+ "zcjri\n"
			+ "\n"
			+ "vkil\n"
			+ "ilvk\n"
			+ "lkvi\n"
			+ "vlki\n"
			+ "\n"
			+ "kpwaqbcxng\n"
			+ "gifcsrab\n"
			+ "rfucgbah\n"
			+ "dgabcst\n"
			+ "\n"
			+ "fxliwtghcyombq\n"
			+ "idrgjnkuvq\n"
			+ "\n"
			+ "koprlgzyhsuvtn\n"
			+ "nlrikpyzsogu\n"
			+ "jfpzckoulrgynmq\n"
			+ "\n"
			+ "spqmyr\n"
			+ "apsyrtmv\n"
			+ "srmyzkp\n"
			+ "\n"
			+ "dujinlbgxvkch\n"
			+ "lcqjpdfokz\n"
			+ "dtjkcl\n"
			+ "freljdack\n"
			+ "cmowldkj\n"
			+ "\n"
			+ "jvdg\n"
			+ "vfdgj\n"
			+ "jdnvg\n"
			+ "jgvxd\n"
			+ "gvjd\n"
			+ "\n"
			+ "ugdfv\n"
			+ "fdquv\n"
			+ "ctduipvbsxf\n"
			+ "vuzdf\n"
			+ "\n"
			+ "sqi\n"
			+ "is\n"
			+ "isq\n"
			+ "isuf\n"
			+ "sip\n"
			+ "\n"
			+ "uyxbezalrngis\n"
			+ "gxuefoarblp\n"
			+ "\n"
			+ "m\n"
			+ "m\n"
			+ "m\n"
			+ "m\n"
			+ "m\n"
			+ "\n"
			+ "lmp\n"
			+ "ml\n"
			+ "\n"
			+ "gonkbqyrefwvixc\n"
			+ "gbqflrvkoceuxywin\n"
			+ "aygocmixqnlfrwvekb\n"
			+ "qunfkgxoyivbtrwace\n"
			+ "wedjqygbncorizfxkv\n"
			+ "\n"
			+ "xjc\n"
			+ "cj\n"
			+ "xcj\n"
			+ "jc\n"
			+ "rkjsc\n"
			+ "\n"
			+ "w\n"
			+ "qran\n"
			+ "mdwc\n"
			+ "\n"
			+ "mzbiqulharef\n"
			+ "dhinazluftgsebkqr\n"
			+ "abruzlvfqehim\n"
			+ "ixeuzbhafqrl\n"
			+ "qralhuebzif\n"
			+ "\n"
			+ "jcovwb\n"
			+ "vulyo\n"
			+ "\n"
			+ "xubwpgcjhlzirdtfeomkya\n"
			+ "dfwixhjezgpotyucblmakvr\n"
			+ "wlgyxukpbhctjfardeimzo\n"
			+ "tckapyfrgmjxzidhbowelu\n"
			+ "dwozhugpeybrftmcljxiak\n"
			+ "\n"
			+ "jxsdk\n"
			+ "dxjs\n"
			+ "\n"
			+ "cspwbtofzqnahxlj\n"
			+ "psounwixqlakvtczj\n"
			+ "jcwaxqntspozblhg\n"
			+ "\n"
			+ "siztpkayg\n"
			+ "tayzgspki\n"
			+ "kpygiztas\n"
			+ "\n"
			+ "bedphz\n"
			+ "pbhdez\n"
			+ "cebxzpdhn\n"
			+ "dbpezwh\n"
			+ "\n"
			+ "clzrw\n"
			+ "uzylrc\n"
			+ "\n"
			+ "tqfslmubxcnvzraejwhgop\n"
			+ "mgtfqnboerlzpuwhjcavsx\n"
			+ "aqstpzxbvocfrmuelhnjwg\n"
			+ "\n"
			+ "i\n"
			+ "wzyi\n"
			+ "iukygez\n"
			+ "og\n"
			+ "ndxsrmjc\n"
			+ "\n"
			+ "fqeubcrvxmaynztkod\n"
			+ "yzlbofqwtxivgsjrhnu\n"
			+ "\n"
			+ "ghtnwdbezoycqa\n"
			+ "dqrbtjmhag\n"
			+ "ltqgdhba\n"
			+ "\n"
			+ "kcwgtvjpaqsh\n"
			+ "kwmsngqpcthvja\n"
			+ "eswvlkzhgqtjoapc\n"
			+ "dahbuswyjfgicxrtkqp\n"
			+ "\n"
			+ "fgbon\n"
			+ "funwodbgx\n"
			+ "gnofe\n"
			+ "icnhgmofl\n"
			+ "gavfonu\n"
			+ "\n"
			+ "adopqhjmsvytrcu\n"
			+ "qourdcamhtpjvys\n"
			+ "sdbqmyjchfutvpoa\n"
			+ "yjuadmtsohqvwcpl\n"
			+ "\n"
			+ "ojvxlcpqiwyzhk\n"
			+ "vqxyemrh\n"
			+ "bvyqhx\n"
			+ "\n"
			+ "mqjotgpxyewuafib\n"
			+ "xpbfegwyujiqaomt\n"
			+ "xiqmojuepgwayftb\n"
			+ "auoxjeypmiqbwtfg\n"
			+ "\n"
			+ "sd\n"
			+ "sd\n"
			+ "cds\n"
			+ "sid\n"
			+ "\n"
			+ "x\n"
			+ "x\n"
			+ "xwl\n"
			+ "x\n"
			+ "x\n"
			+ "\n"
			+ "xpswktynofdr\n"
			+ "dltjaiv\n"
			+ "utldv\n"
			+ "\n"
			+ "yzqjaxf\n"
			+ "xfzlj\n"
			+ "xjufz\n"
			+ "\n"
			+ "hqwscjn\n"
			+ "jcvhswq\n"
			+ "\n"
			+ "zoulxteni\n"
			+ "xoneultzi\n"
			+ "izutonlex\n"
			+ "elznxotiu\n"
			+ "egutoxilznj\n"
			+ "\n"
			+ "qbtpni\n"
			+ "ipbqtn\n"
			+ "btipnq\n"
			+ "\n"
			+ "dulavqjpwr\n"
			+ "qwpbudrji\n"
			+ "rojqxkzeymnhcwtfs\n"
			+ "irvadlgjwqb\n"
			+ "\n"
			+ "vtpledhq\n"
			+ "lsdxhet\n"
			+ "\n"
			+ "jcrb\n"
			+ "rcjb\n"
			+ "crbj\n"
			+ "\n"
			+ "cdz\n"
			+ "d\n"
			+ "d\n"
			+ "d\n"
			+ "\n"
			+ "dcb\n"
			+ "bdwlc\n"
			+ "cbd\n"
			+ "\n"
			+ "qgash\n"
			+ "j\n"
			+ "nfrm\n"
			+ "f\n"
			+ "\n"
			+ "sxruehldbwv\n"
			+ "ewvbdrhulsx\n"
			+ "xsedhluwvbr\n"
			+ "\n"
			+ "egndobvljxfwpktuhir\n"
			+ "xtwbvkreilhfgopqa\n"
			+ "\n"
			+ "nbxtozmgwhjk\n"
			+ "gditmuxlpvoqjz\n"
			+ "ngxjtozm\n"
			+ "\n"
			+ "grpmyidhnlbazko\n"
			+ "yfbutdmplghn\n"
			+ "pgmdhnylub\n"
			+ "\n"
			+ "oknu\n"
			+ "kuon\n"
			+ "nuziok\n"
			+ "kguno\n"
			+ "\n"
			+ "fjnqebx\n"
			+ "xqfnbje\n"
			+ "fenjxqb\n"
			+ "bexnqjf\n"
			+ "fjxqben\n"
			+ "\n"
			+ "ngcemiwbaovjtkhyq\n"
			+ "bckqlsfjitmxnruad\n"
			+ "\n"
			+ "hj\n"
			+ "hj\n"
			+ "jh\n"
			+ "\n"
			+ "drlmsfpytkwogba\n"
			+ "ayuprtwkldgmsf\n"
			+ "djgirkwhnfvsmaylpq\n"
			+ "arkdwlmpsfxgy\n"
			+ "\n"
			+ "iuxen\n"
			+ "akunxbhvye\n"
			+ "mngesfotdjq\n"
			+ "\n"
			+ "bzjln\n"
			+ "bljnz\n"
			+ "\n"
			+ "rcwqlu\n"
			+ "wqclut\n"
			+ "clkqusw\n"
			+ "qwluc\n"
			+ "qlmcwruz\n"
			+ "\n"
			+ "pvuehjntwmldofszca\n"
			+ "wblhcravqutdzn\n"
			+ "wdclvhaunxtqz\n"
			+ "nlgukahzvitwqdc\n"
			+ "uwzanhdvltc\n"
			+ "\n"
			+ "gnvwedmsypzkfiucxj\n"
			+ "wdgiyeuzvcjmksfpxn\n"
			+ "ximnkbvgjezdhsfuwypc\n"
			+ "gxwjapiszkceumnyfvd\n"
			+ "zmyvkwnesfpjucdxig\n"
			+ "\n"
			+ "gjfcieanskuxp\n"
			+ "kjgcfpxniae\n"
			+ "pjaidcfxgekn\n"
			+ "afnmjcpixekg\n"
			+ "\n"
			+ "ftkpsec\n"
			+ "kjustapc\n"
			+ "gpbesktc\n"
			+ "tkspqc\n"
			+ "\n"
			+ "ugstoxvclf\n"
			+ "flvmoicgx\n"
			+ "jeykgovlfznxc\n"
			+ "ixfotglvwcqd\n"
			+ "\n"
			+ "mexhldbpjou\n"
			+ "mdjlupeobx\n"
			+ "\n"
			+ "dhlfxywnburezpi\n"
			+ "dciqxmzpkrgtehun\n"
			+ "\n"
			+ "bsquyvomwxfatdehkz\n"
			+ "jyfgcwspdaonrilekq\n"
			+ "\n"
			+ "g\n"
			+ "f\n"
			+ "jps\n"
			+ "jtxi\n"
			+ "rvydkw\n"
			+ "\n"
			+ "cudmjlhxy\n"
			+ "hkgyjrsdwilxubv\n"
			+ "etlxjhyud\n"
			+ "halydxucj\n"
			+ "hayuxljd\n"
			+ "\n"
			+ "byxiq\n"
			+ "jiscfwzd\n"
			+ "reitu\n"
			+ "in\n"
			+ "\n"
			+ "qhtgwkndxcoijmpa\n"
			+ "mkhigcoyrwqbdjvpxa\n"
			+ "ihkmpdqoajcxwg\n"
			+ "\n"
			+ "cel\n"
			+ "cle\n"
			+ "lec\n"
			+ "\n"
			+ "jbtpqhikyfurmcdv\n"
			+ "eoxasngz\n"
			+ "\n"
			+ "qlbnc\n"
			+ "nqcldb\n"
			+ "mqwynlc\n"
			+ "\n"
			+ "izufhegmnvqsx\n"
			+ "qsnvixfeuhgybz\n"
			+ "\n"
			+ "znqhkcpsbeja\n"
			+ "qjiucbtvzmwns\n"
			+ "\n"
			+ "ryxwzf\n"
			+ "xcfrwv\n"
			+ "ufapnmrtlgwesxdibo\n"
			+ "xkwqrhf\n"
			+ "\n"
			+ "b\n"
			+ "b\n"
			+ "\n"
			+ "haplgzidj\n"
			+ "dpziajghl\n"
			+ "ziaphlgjd\n"
			+ "izdpghajl\n"
			+ "\n"
			+ "bicvhyur\n"
			+ "buxvichyr\n"
			+ "bigrchvyu\n"
			+ "\n"
			+ "ksbucalv\n"
			+ "sbmxtaklc\n"
			+ "skalcg\n"
			+ "lcnikas\n"
			+ "yfzjcslhaoke\n"
			+ "\n"
			+ "yfjdnzh\n"
			+ "elp\n"
			+ "\n"
			+ "d\n"
			+ "k\n"
			+ "t\n"
			+ "d\n"
			+ "\n"
			+ "dctvqjfyxbzkhmiwgp\n"
			+ "dxzlfwbcimgtkv\n"
			+ "cfvzxbigkwtmd\n"
			+ "\n"
			+ "bcgklzedjqyrxsnaowu\n"
			+ "dcbarwmzouejqklnsgyx\n"
			+ "rloyjkanqzdecgubxsw\n"
			+ "\n"
			+ "pvslrgbcwdkqminxzeufa\n"
			+ "tqlkonvaxyjfwcdehbz\n"
			+ "\n"
			+ "eyjbotcnwpixkrdqzhslugfvm\n"
			+ "vkbehwqfrlmgoctxsjuzdyp\n"
			+ "qbcfoxhywmdetpvjklrgsuz\n"
			+ "rgpmjdwxbhcsqykozevluft\n"
			+ "\n"
			+ "mbqdivuazsljnhgpc\n"
			+ "nozculmjkhgdivpsebq\n"
			+ "dyxwzujgsqlpmcvhbni\n"
			+ "hqvnczbgplkdsjimu\n"
			+ "sujqghlvrpmbinczda\n"
			+ "\n"
			+ "kqrwhcjs\n"
			+ "wdqrjshk\n"
			+ "\n"
			+ "uzdmsfrklnce\n"
			+ "khvcpgy\n"
			+ "\n"
			+ "rtnuvbi\n"
			+ "xsgwtozba\n"
			+ "ubftpnvye\n"
			+ "\n"
			+ "wylvbjzdqn\n"
			+ "zbvnlwyjdq\n"
			+ "qdbvwnyzjl\n"
			+ "jznlwvbqyd\n"
			+ "\n"
			+ "nbi\n"
			+ "nbdxupk\n"
			+ "ybqmzawscg\n"
			+ "ljtfineb\n"
			+ "\n"
			+ "yavmstjkiczf\n"
			+ "kvsiaytfczmj\n"
			+ "fyitcazpkjmvs\n"
			+ "maicfytjzvsk\n"
			+ "vizyamskftjc\n"
			+ "\n"
			+ "kluwomaznivpjgdt\n"
			+ "amevngiortudzpjwkl\n"
			+ "pktnivmdlgojzacuw\n"
			+ "lwtoxnpdfjyuigkzahmv\n"
			+ "vtkinjumlwdpzoga\n"
			+ "\n"
			+ "hujbrpgdklecmsaoqwtnzv\n"
			+ "whpltrjfxksazvquy\n"
			+ "wplsvkirhaztuqj\n"
			+ "\n"
			+ "jzp\n"
			+ "jqczp\n"
			+ "cjzp\n"
			+ "pwilzj\n"
			+ "pzyj\n"
			+ "\n"
			+ "xuldhjrcqtsanfwembigpzo\n"
			+ "ydnuzisxprevwo\n"
			+ "pixwdounzrske\n"
			+ "srnpuezwoxid\n"
			+ "\n"
			+ "zc\n"
			+ "pjmzcv\n"
			+ "uzacir\n"
			+ "\n"
			+ "stng\n"
			+ "hsa\n"
			+ "wpfho\n"
			+ "fgwyzl\n"
			+ "iuvjcbmkqrx\n"
			+ "\n"
			+ "isygk\n"
			+ "gsiky\n"
			+ "sxgyik\n"
			+ "kgsiy\n"
			+ "yksgi\n"
			+ "\n"
			+ "a\n"
			+ "a\n"
			+ "a\n"
			+ "ad\n"
			+ "a\n"
			+ "\n"
			+ "d\n"
			+ "d\n"
			+ "wamdyvkbsf\n"
			+ "\n"
			+ "nuboltsfmqidev\n"
			+ "ietomdsql\n"
			+ "\n"
			+ "hjgmusbnr\n"
			+ "rsmgbnuj\n"
			+ "njrmbgus\n"
			+ "usbmnrgj\n"
			+ "\n"
			+ "yhsicqowdx\n"
			+ "hygjsrpixwqkdnzo\n"
			+ "yiusdxwohq\n"
			+ "idfqswxhyco\n"
			+ "iwqshoduyx\n"
			+ "\n"
			+ "whavqbzpcxt\n"
			+ "lbfpqecim\n"
			+ "kboydgjnu\n"
			+ "\n"
			+ "lyrdtfe\n"
			+ "yrtmflvq\n"
			+ "tqrfyl\n"
			+ "\n"
			+ "ol\n"
			+ "ol\n"
			+ "ol\n"
			+ "lo\n"
			+ "lo\n"
			+ "\n"
			+ "obmulhyjxtf\n"
			+ "nmhxvuqz\n"
			+ "smdhgpkxiwaer\n"
			+ "zxhlqm\n"
			+ "\n"
			+ "s\n"
			+ "s\n"
			+ "s\n"
			+ "s\n"
			+ "vs\n"
			+ "\n"
			+ "homqjfrnuptgvkdewsbx\n"
			+ "ezyukvxogipthdwqrmjf\n"
			+ "mtohlvdkujgqwcnpxfre\n"
			+ "\n"
			+ "ah\n"
			+ "a\n"
			+ "\n"
			+ "l\n"
			+ "l\n"
			+ "l\n"
			+ "\n"
			+ "pelqakfsnm\n"
			+ "vathjmflkpnq\n"
			+ "\n"
			+ "dfzo\n"
			+ "dzga\n"
			+ "dz\n"
			+ "gziwd\n"
			+ "jzd\n"
			+ "\n"
			+ "tfnkdivuyoszbxrpwg\n"
			+ "ixgsfzodtrkuwnbvmpy\n"
			+ "gnwzjkiopsxrbyfutd\n"
			+ "wzftgxkdjopruisbyn\n"
			+ "gqfsekcbnzuxwridtypo\n"
			+ "\n"
			+ "dpoy\n"
			+ "ydpo\n"
			+ "\n"
			+ "bvfpielj\n"
			+ "lxfb\n"
			+ "flb\n"
			+ "\n"
			+ "ntsorhklpjawxvgc\n"
			+ "wnribsgpflzcyho\n"
			+ "nmupwhrlsbgefocq\n"
			+ "\n"
			+ "nwfxuvazbsp\n"
			+ "txazjnufwb\n"
			+ "hauewxfbnz\n"
			+ "\n"
			+ "rdjzk\n"
			+ "xghiyalv\n"
			+ "\n"
			+ "sjgxtuvlkwadhfpn\n"
			+ "tfwxrckgljdushoa\n"
			+ "lawsktgxfchjdu\n"
			+ "\n"
			+ "omslwvcyup\n"
			+ "gpluqhjos\n"
			+ "uzritolpan\n"
			+ "beluhoydp\n"
			+ "\n"
			+ "ewxhvcugaqdmlitps\n"
			+ "gpusmrbqhidewltkvaxc\n"
			+ "lvmicwtagdxshueqp\n"
			+ "shcgeaupqidvmlxwt\n"
			+ "\n"
			+ "nhsy\n"
			+ "lnxwvgzyi\n"
			+ "ysn\n"
			+ "\n"
			+ "m\n"
			+ "a\n"
			+ "m\n"
			+ "\n"
			+ "decjihxk\n"
			+ "idkexjch\n"
			+ "\n"
			+ "if\n"
			+ "wd\n"
			+ "r\n"
			+ "o\n"
			+ "\n"
			+ "bxsmk\n"
			+ "bqlmnz\n"
			+ "m\n"
			+ "wrohm\n"
			+ "paudcimf\n"
			+ "\n"
			+ "agu\n"
			+ "causg\n"
			+ "aui\n"
			+ "meauxtk\n"
			+ "\n"
			+ "wdqfn\n"
			+ "nfqd\n"
			+ "\n"
			+ "oxy\n"
			+ "chbwyur\n"
			+ "\n"
			+ "zkvujiot\n"
			+ "tkvjzui\n"
			+ "\n"
			+ "qnhdovxtmslkgarbcyu\n"
			+ "stgdnovqhwkraflmxcbuy\n"
			+ "dabthokserxpmgqnyucvl\n"
			+ "vnroakbqduclgxysthm\n"
			+ "rcaqyztgmlnkdubshvox\n"
			+ "\n"
			+ "lacj\n"
			+ "lcj\n"
			+ "ajlc\n"
			+ "lcj\n"
			+ "vjlfc\n"
			+ "\n"
			+ "olbatqnghkcvp\n"
			+ "aghctqklpbovn\n"
			+ "kcrbvptohlngaq\n"
			+ "\n"
			+ "swrginfxypvcjh\n"
			+ "xcswphgnryjvi\n"
			+ "grwvishxeqjcnyp\n"
			+ "zgvrwxynpcjihs\n"
			+ "gvcinwxjfphyrs\n"
			+ "\n"
			+ "ey\n"
			+ "y\n"
			+ "cy\n"
			+ "ye\n"
			+ "luy\n"
			+ "\n"
			+ "voiyjclzmxdkswr\n"
			+ "mwgqrazvf\n"
			+ "wrvatzm\n"
			+ "\n"
			+ "ktpxlhbq\n"
			+ "blkxtpqh\n"
			+ "tlkqbpxh\n"
			+ "\n"
			+ "vst\n"
			+ "v\n"
			+ "vg\n"
			+ "v\n"
			+ "v\n"
			+ "\n"
			+ "mzeqwvhcylausk\n"
			+ "wlhkausvzecq\n"
			+ "qcvelzautgpwksh\n"
			+ "wemlushzqcvak\n"
			+ "\n"
			+ "lhmivroaxdcnuq\n"
			+ "vgdlqowpfsmhzc\n"
			+ "\n"
			+ "wnvkytcj\n"
			+ "kvntwbcjdy\n"
			+ "tnjwyvck\n"
			+ "nhkcsytjwv\n"
			+ "cyvftjwnk\n"
			+ "\n"
			+ "vas\n"
			+ "q\n"
			+ "kqu\n"
			+ "k\n"
			+ "\n"
			+ "utzilqesjybogr\n"
			+ "sizlcdkpqwhtuer\n"
			+ "\n"
			+ "y\n"
			+ "yep\n"
			+ "oymj\n"
			+ "yt\n"
			+ "y\n"
			+ "\n"
			+ "rwpg\n"
			+ "pemxwg\n"
			+ "jdcpau\n"
			+ "\n"
			+ "fka\n"
			+ "kfa\n"
			+ "akf\n"
			+ "akf\n"
			+ "\n"
			+ "kfgwtbvhiqrouzsyc\n"
			+ "zrufhmcbqklwdygvts\n"
			+ "bgscqwfrvzkhyuxt\n"
			+ "vsfwgzkybtcuhpqr\n"
			+ "zsrqufnkyhgcvtwb\n"
			+ "\n"
			+ "otdzwrhcglfsqxjnmabkevyiup\n"
			+ "kfrvlhtdxypczeqoigbwunajsm\n"
			+ "\n"
			+ "kwruhzno\n"
			+ "renu\n"
			+ "rwscujhnx\n"
			+ "znrmwktu\n"
			+ "lnuavfbgqrd\n"
			+ "\n"
			+ "cmjfuhgosqvtdra\n"
			+ "qkbrnvgcfazwduh\n"
			+ "\n"
			+ "e\n"
			+ "e\n"
			+ "e\n"
			+ "e\n"
			+ "\n"
			+ "mvxfoken\n"
			+ "hdmgf\n"
			+ "rbfuysatlj\n"
			+ "\n"
			+ "dhkibzgqsfnjwoeay\n"
			+ "kzswqguicporhamnxy\n"
			+ "\n"
			+ "lizspt\n"
			+ "swfrz\n"
			+ "pzus\n"
			+ "\n"
			+ "xifpbzlhwjyrdaekcu\n"
			+ "rgdejwzxthovbplyki\n"
			+ "fnepivxrjkwbydhzl\n"
			+ "ledhzkpjsxwyiurb\n"
			+ "zeyrmlhwqijkxbdp\n"
			+ "\n"
			+ "pegvkaihzo\n"
			+ "vehiuab\n"
			+ "\n"
			+ "mltync\n"
			+ "ugwncvopytlqfmk\n"
			+ "rlcmytn\n"
			+ "zlcymtn\n"
			+ "\n"
			+ "zejdqact\n"
			+ "ihmsftgxqnzew\n"
			+ "rubvqtpeolky\n"
			+ "\n"
			+ "rwfuaothcpseybqjinlkzmgdx\n"
			+ "djxnrvwiplcoyeusgqkfahtzbm\n"
			+ "dzkxonbclysgajhpiterfwmuq\n"
			+ "utsphwyogxrnmeazdjiqclfkb\n"
			+ "\n"
			+ "elrg\n"
			+ "rlge\n"
			+ "jsvelrkg\n"
			+ "\n"
			+ "timlpywofghdcqn\n"
			+ "odywtpghrlfnm\n"
			+ "lpgwydkfmnvhtos\n"
			+ "oghfxvpltjwydmn\n"
			+ "wnflgohpymdt\n"
			+ "\n"
			+ "dbvwknom\n"
			+ "qcgnsxdjwmaz\n"
			+ "fdwtnmi\n"
			+ "\n"
			+ "farjis\n"
			+ "jsfria\n"
			+ "fsraijp\n"
			+ "ejsfari\n"
			+ "fsiajr\n"
			+ "\n"
			+ "czrjbswgqdxl\n"
			+ "iyunqrkwt\n"
			+ "rnhqmvwf\n"
			+ "\n"
			+ "gemcvijdrtalbyhs\n"
			+ "bgmtfdewikrcy\n"
			+ "rdeymcgitb\n"
			+ "ecbftpidrgmy\n"
			+ "\n"
			+ "afzebldqucmvjr\n"
			+ "auoenmzbixkljyv\n"
			+ "\n"
			+ "symzkwifnbql\n"
			+ "kyiqfslvzmntb\n"
			+ "symbkfrilgqzdo\n"
			+ "\n"
			+ "syz\n"
			+ "zsvr\n"
			+ "djz\n"
			+ "oeftzw\n"
			+ "\n"
			+ "oqciyjnbzgptes\n"
			+ "jesntxqidopgvcy\n"
			+ "hnoipetqcgsyj\n"
			+ "\n"
			+ "kxmbzruqhpvfyjgdtilwno\n"
			+ "xmbokfdyjirqgtpuhlznvw\n"
			+ "\n"
			+ "lnpyeoixb\n"
			+ "oq\n"
			+ "sjor\n"
			+ "osr\n"
			+ "\n"
			+ "ubiqcsmpgxonea\n"
			+ "nqiovhbmcpazs\n"
			+ "minqobswpac\n"
			+ "\n"
			+ "fac\n"
			+ "cfav\n"
			+ "lacf\n"
			+ "\n"
			+ "euh\n"
			+ "hue\n"
			+ "ehu\n"
			+ "ehu\n"
			+ "\n"
			+ "pibzno\n"
			+ "nipzbo\n"
			+ "nopibz\n"
			+ "zpobni\n"
			+ "\n"
			+ "jefntxhzgiawm\n"
			+ "zaewgxrqhnotmj\n"
			+ "\n"
			+ "oiywejqmnbrpgvth\n"
			+ "pwdosarivngeyjtxz\n"
			+ "\n"
			+ "qzsldmcgwfkoxbvn\n"
			+ "ojtlieuqdkyxrwapsfhb\n"
			+ "\n"
			+ "njlqgd\n"
			+ "jqnldg\n"
			+ "\n"
			+ "xokdpgrluybv\n"
			+ "golybpvudkxr\n"
			+ "oykdngblrpvxu\n"
			+ "rgdxykbopvlu\n"
			+ "gkbuporvldxy\n"
			+ "\n"
			+ "byirmfuqnh\n"
			+ "bfytmnrhq\n"
			+ "nufrmbhqy\n"
			+ "\n"
			+ "bwlakexy\n"
			+ "waxblyke\n"
			+ "\n"
			+ "iwcpgbtrvkxozhafsjl\n"
			+ "ajrgblxfiwovzhspckt\n"
			+ "svrbkcwlafjihptxzog\n"
			+ "pagstcijkvxlfzrbohw\n"
			+ "klvzrxishwatjfcpgbo\n"
			+ "\n"
			+ "pyldrtzakimus\n"
			+ "ytahudmilqpsrkz\n"
			+ "azmpuikdystwrl\n"
			+ "\n"
			+ "p\n"
			+ "p\n"
			+ "p\n"
			+ "p\n"
			+ "pqfn\n"
			+ "\n"
			+ "fnryzjdcxt\n"
			+ "arnbxcjezod\n"
			+ "\n"
			+ "axhwfgyodzb\n"
			+ "dxvyzwhaogfb\n"
			+ "bwyfzavodgpxh\n"
			+ "tbxqnygadwofzh\n"
			+ "wzgbyofxahd\n"
			+ "\n"
			+ "i\n"
			+ "xiq\n"
			+ "i\n"
			+ "\n"
			+ "tbzocxvneisgudfh\n"
			+ "qvawchrnoftxeisubgz\n"
			+ "nfvitxeguohcsjzb\n"
			+ "hgtmdibvsnfcpzlxuoe\n"
			+ "\n"
			+ "typrmhdbfokg\n"
			+ "rmbdtgaypkhf\n"
			+ "fdgntmrapkbxhy\n"
			+ "rhzyukfemsdctgpb\n"
			+ "gfdyjmrnhpbkt\n"
			+ "\n"
			+ "ecqofgx\n"
			+ "egxocf\n"
			+ "\n"
			+ "lbajxmytnvcu\n"
			+ "cyxatbeum\n"
			+ "maefidcuybthx\n"
			+ "cmdibxtayu\n"
			+ "\n"
			+ "iucbxarvygmdfh\n"
			+ "srvbufihcg\n"
			+ "wznvrgcohui\n"
			+ "fuvbiretchg\n"
			+ "jgfuahicdryv\n"
			+ "\n"
			+ "ibqmhrkjsxozwep\n"
			+ "cqgyubldnzxvarhtwmk\n"
			+ "\n"
			+ "sohwyfmrgqdpntjeuizcvb\n"
			+ "cjufwgzmlnryxbdsopiahtqev\n"
			+ "ektzudfyhsqgjmpcnbowvri\n"
			+ "chqwbidoprfseyntzugjmv\n"
			+ "\n"
			+ "tbjxvwd\n"
			+ "bvdwit\n"
			+ "cvdmwtob\n"
			+ "\n"
			+ "cnqiytpemfksgwrdaojhul\n"
			+ "bqltdfpmukxshvgaw\n"
			+ "\n"
			+ "pelvkjuxoz\n"
			+ "jcukzolyxvphnd\n"
			+ "kvjzxpolu\n"
			+ "zxjuspkolv\n"
			+ "zakuxvolpj\n"
			+ "\n"
			+ "ugtfxis\n"
			+ "ftxugs\n"
			+ "tusgfx\n"
			+ "gfxsut\n"
			+ "stguxf\n"
			+ "\n"
			+ "pnwhy\n"
			+ "rlzvtbgjcuioe\n"
			+ "hksxfq\n"
			+ "kdsyqf\n"
			+ "\n"
			+ "oq\n"
			+ "jb\n"
			+ "\n"
			+ "aoprdcixzkjbygw\n"
			+ "ikogwradbyzjcpx\n"
			+ "xijpaodkzygbrwc\n"
			+ "pgodkyziwbrxjca\n"
			+ "djxrgwicbpozyak\n"
			+ "\n"
			+ "girlmkueqz\n"
			+ "mrzlgiequk\n"
			+ "roequmigklz\n"
			+ "zurmlegqki\n"
			+ "rgizumkvelq\n"
			+ "\n"
			+ "ptxuemkwrcnifd\n"
			+ "euakfprntx\n"
			+ "nperfutxk\n"
			+ "rtnufepxk\n"
			+ "\n"
			+ "irseqtuvchjbkd\n"
			+ "ejtvrdsqcbihuk\n"
			+ "rvucbqenlsjkti\n"
			+ "btirjqecsvkhu\n"
			+ "skrtuevijcqb\n"
			+ "\n"
			+ "dvoamzlskeqncipfjrxy\n"
			+ "yqebxdztokampnfhvrcsjl\n"
			+ "cpuoyxeqsnkzdawjg\n"
			+ "\n"
			+ "wvgeuabrofsthzj\n"
			+ "zvutemgshowckqb\n"
			+ "uazeiytghwvbsxo\n"
			+ "\n"
			+ "rsunhbyz\n"
			+ "uyhzns\n"
			+ "\n"
			+ "qcmdnyupvhzsobjfwrgaxkte\n"
			+ "qvjemnkfprcuwhdabxotsy\n"
			+ "sdmhnqwpctujykofbexrav\n"
			+ "ywqedptrcfkmjuavbhxnos\n"
			+ "\n"
			+ "b\n"
			+ "bwd\n"
			+ "orynghs\n"
			+ "cdb\n"
			+ "\n"
			+ "xcafnlipok\n"
			+ "jybqnohclf\n"
			+ "\n"
			+ "ibdktq\n"
			+ "kqbitd\n"
			+ "tbqifdk\n"
			+ "knbtdiq\n"
			+ "\n"
			+ "ukozvn\n"
			+ "cgrbylzv\n"
			+ "\n"
			+ "vbrmxepqhgwcjynkf\n"
			+ "mnjwgbcvepfhyrxukq\n"
			+ "fwjrgvxqumyenpchb\n"
			+ "cnbpegqxvmyhjrfw\n"
			+ "fvcxweqgmsyjrbnph\n"
			+ "\n"
			+ "kevsifhanlxmu\n"
			+ "czquwbjir\n"
			+ "\n"
			+ "dpubgykrv\n"
			+ "ghmucyeozf\n"
			+ "\n"
			+ "vkuzbypfxadsirnh\n"
			+ "gqoackjuzfshxinrydv\n"
			+ "\n"
			+ "qfxjpy\n"
			+ "czgqfeolsjypn\n"
			+ "ufrqdjpy\n"
			+ "\n"
			+ "djahmfvl\n"
			+ "mdhal\n"
			+ "kxpaedhm\n"
			+ "\n"
			+ "itjqk\n"
			+ "jzafmlsur\n"
			+ "kvcjog\n"
			+ "\n"
			+ "tabhwlx\n"
			+ "lcawzb\n"
			+ "bislwa\n"
			+ "wsbal\n"
			+ "ybegoulqwmva\n"
			+ "\n"
			+ "sailcfhebp\n"
			+ "bsaedhut\n"
			+ "\n"
			+ "vybgqotrufexkcmwhspd\n"
			+ "exdulgqysmfknhtpcbov\n"
			+ "\n"
			+ "aw\n"
			+ "aw\n"
			+ "wa\n"
			+ "aw\n"
			+ "aw\n"
			+ "\n"
			+ "koacmwyvusxzrgdnb\n"
			+ "agbsuzydwnocrvxmk\n"
			+ "zsrkgbuvnomcydxaw\n"
			+ "ncokzmrgvbsayxwud\n"
			+ "\n"
			+ "kcowqjmbxhrfgiuvsndtp\n"
			+ "ucxghrwbdjkqvtmfpsoni\n"
			+ "bnkmhqvufpywijogxcsdt\n"
			+ "\n"
			+ "nhkvbro\n"
			+ "ejxftohulgqkbd\n"
			+ "obhk\n"
			+ "azkhnypwbo\n"
			+ "hbovk\n"
			+ "\n"
			+ "rxkfcenp\n"
			+ "pfrxke\n"
			+ "\n"
			+ "cirvlkbahnxt\n"
			+ "azjhxnvrkcig\n"
			+ "\n"
			+ "wbjkcg\n"
			+ "kgbjw\n"
			+ "\n"
			+ "z\n"
			+ "z\n"
			+ "z\n"
			+ "z\n"
			+ "\n"
			+ "untoxhwspyi\n"
			+ "cahnbvudygp\n"
			+ "yfhspunexm\n"
			+ "\n"
			+ "ykjcr\n"
			+ "ycrk\n"
			+ "pyckr\n"
			+ "rcyk\n"
			+ "\n"
			+ "x\n"
			+ "y\n"
			+ "x\n"
			+ "x\n"
			+ "x\n"
			+ "\n"
			+ "ljamgiu\n"
			+ "giumrlenkh\n"
			+ "ismuglp\n"
			+ "ugmlsi\n"
			+ "auiomgslf\n"
			+ "\n"
			+ "tibudoa\n"
			+ "obuatifgp";

	private static final String[] GROUPS = INPUT.split("\n\n");
	
	static int count(String pGroup) {
		String[] answers = pGroup.split("[^a-z]*");
		Arrays.sort(answers);
		// System.out.println(Arrays.toString(answers));
		Set<Object> uniq = new HashSet<>();
		Collections.addAll(uniq, Arrays.stream(answers).filter(a -> a.matches("[a-z]")).toArray());
		return uniq.size();
	}
	
	static int count2(String pGroup) {
		String[] answers = pGroup.split("\n");
		Set<String> commonAnswers = new HashSet<>(Arrays.asList(answers[0].split("")));
		
		for (String a : answers) {
			commonAnswers.retainAll(new HashSet<>(Arrays.asList(a.split(""))));
		}
		System.out.println(commonAnswers.toString() + " count2: " + commonAnswers.size());
		return commonAnswers.size();
	}
	
	static Set<Integer> seats = new HashSet<>();
	public static void main(String[] args) {
		int count = 0;
		int count2 = 0;
		// 
		for (int row = 0; row < GROUPS.length; row++) {
			System.out.println(GROUPS[row]);
			count += count(GROUPS[row]);
			count2 += count2(GROUPS[row]);
		}
		System.out.println("" + count + " is the count");
		System.out.println("" + count2 + " is the new count");
		

	}

}
