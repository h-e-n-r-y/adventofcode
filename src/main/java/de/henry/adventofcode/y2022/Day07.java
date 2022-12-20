package de.henry.adventofcode.y2022;

import java.util.HashMap;
import java.util.Map;

public class Day07 {

    static Map<String,Integer> filesizes = new HashMap<>();
    static Map<String,Integer> filesizesRecursive = new HashMap<>();

    public static void main(String[] args) {
        buildFileTree(INPUT);
        calcRecursiveSizes();

        System.out.println("result: " + printRecursiveSizes());

        System.out.println("delete: " + bestDirToDelete());

    }


    protected static int printRecursiveSizes() {
        int s = 0;
        for (Map.Entry<String, Integer> e : filesizesRecursive.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
            if (e.getValue() <= 100000) {
                s += e.getValue();
            }
        }
        return s;
    }
    protected static int bestDirToDelete() {
        int o = filesizesRecursive.get("/");
        int s = o;
        for (Map.Entry<String, Integer> e : filesizesRecursive.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
            if (70_000_000 - o + e.getValue() >= 30_000_000) {
                // candidate
                if (s > e.getValue()) {
                    s = e.getValue();
                }
            }
        }
        return s;
    }

    protected static void calcRecursiveSizes() {
        for (Map.Entry<String, Integer> e : filesizes.entrySet()) {
            // add size to this and parent folders
            String path = e.getKey();
            do {
                Integer s = filesizesRecursive.get(path);
                filesizesRecursive.put(path, s == null ? e.getValue() : s + e.getValue());
                path = getParent(path);
            } while (path != null);
        }
    }

    protected static void buildFileTree(String pInput) {
        String path = "";
        for (String line : pInput.split("\n")) {
            if (line.equals("$ ls") || line.startsWith("dir ")) {
                // ignore
            } else if (line.startsWith("$ cd ")) {
                String dir = line.substring(5);
                if ("..".equals(dir)) {
                    path = getParent(path);
                } else if ("/".equals(dir)) {
                    path = "/";
                } else {
                    if ("/".equals(path)) {
                        path = path + dir;
                    } else {
                        path = path + '/' + dir;
                    }
                }
                // System.out.println(path.equals("") ? "/" : path);
            } else {
                // 112449 npp.vjv
                int size = Integer.parseInt(line.substring(0, line.indexOf(' ')));
                filesizes.merge(path, size, Integer::sum);
            }
        }
    }

    private static String getParent(String path) {
        if ("/".equals(path)) {
            return null;
        }
        String p = path.substring(0, path.lastIndexOf('/'));
        return "".equals(p) ? "/" : p;
    }

    private static final String INPUT = "$ cd /\n" +
            "$ ls\n" +
            "dir brhvclj\n" +
            "dir clnvqg\n" +
            "dir dtqtvvrn\n" +
            "dir lcz\n" +
            "dir pcqjncwl\n" +
            "dir qwvfpgl\n" +
            "dir rtmj\n" +
            "dir shg\n" +
            "dir tcdmgwp\n" +
            "$ cd brhvclj\n" +
            "$ ls\n" +
            "40016 mtlscfrd.gdr\n" +
            "dir mvslzl\n" +
            "112449 npp.vjv\n" +
            "46674 pbgjwb\n" +
            "dir qdtls\n" +
            "dir tfns\n" +
            "$ cd mvslzl\n" +
            "$ ls\n" +
            "dir dngldfww\n" +
            "dir dzplphqw\n" +
            "$ cd dngldfww\n" +
            "$ ls\n" +
            "102218 wcrvztrh.mzb\n" +
            "$ cd ..\n" +
            "$ cd dzplphqw\n" +
            "$ ls\n" +
            "93724 brhvclj\n" +
            "169467 cwqwcjc.lgd\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd qdtls\n" +
            "$ ls\n" +
            "dir nnlzrwgh\n" +
            "dir svc\n" +
            "168425 tcq.lng\n" +
            "99608 vjrntvbz.sgn\n" +
            "dir wshf\n" +
            "dir wtmdzgvg\n" +
            "$ cd nnlzrwgh\n" +
            "$ ls\n" +
            "141976 fnb\n" +
            "$ cd ..\n" +
            "$ cd svc\n" +
            "$ ls\n" +
            "87249 hzrml\n" +
            "46855 qbmgmmc\n" +
            "147235 zsbsq.cvq\n" +
            "$ cd ..\n" +
            "$ cd wshf\n" +
            "$ ls\n" +
            "25072 npp.vjv\n" +
            "$ cd ..\n" +
            "$ cd wtmdzgvg\n" +
            "$ ls\n" +
            "165660 cfpfdqq.vfd\n" +
            "dir dhbrmn\n" +
            "176203 dscvmj.wpn\n" +
            "dir rcdwft\n" +
            "$ cd dhbrmn\n" +
            "$ ls\n" +
            "200474 brhvclj.hcf\n" +
            "233675 npp.vjv\n" +
            "218734 ttntt\n" +
            "$ cd ..\n" +
            "$ cd rcdwft\n" +
            "$ ls\n" +
            "dir wvfdjv\n" +
            "$ cd wvfdjv\n" +
            "$ ls\n" +
            "104669 mdrr\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd tfns\n" +
            "$ ls\n" +
            "dir clnvqg\n" +
            "15637 mlft.cvp\n" +
            "dir pqp\n" +
            "77675 svc.mqv\n" +
            "dir ttntt\n" +
            "dir wfcczs\n" +
            "dir wshwhzw\n" +
            "$ cd clnvqg\n" +
            "$ ls\n" +
            "dir brhvclj\n" +
            "103188 cdfj\n" +
            "256254 svc\n" +
            "72302 tndnh.vgg\n" +
            "$ cd brhvclj\n" +
            "$ ls\n" +
            "dir brhvclj\n" +
            "$ cd brhvclj\n" +
            "$ ls\n" +
            "246966 mlrcgl\n" +
            "93485 ttntt.ztq\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd pqp\n" +
            "$ ls\n" +
            "dir svc\n" +
            "206837 ttntt.qpm\n" +
            "$ cd svc\n" +
            "$ ls\n" +
            "202934 bsczwq\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ttntt\n" +
            "$ ls\n" +
            "dir dfmgqmvm\n" +
            "126511 hpdm.ctv\n" +
            "$ cd dfmgqmvm\n" +
            "$ ls\n" +
            "dir qbms\n" +
            "201736 wczpvsw.ddr\n" +
            "dir wshwhzw\n" +
            "$ cd qbms\n" +
            "$ ls\n" +
            "20046 lvfphhpw.sjv\n" +
            "186516 pdbtbmf\n" +
            "149493 svc.dqh\n" +
            "dir tdvtcmwz\n" +
            "$ cd tdvtcmwz\n" +
            "$ ls\n" +
            "100584 hpdm.ctv\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd wshwhzw\n" +
            "$ ls\n" +
            "116856 hwvgnwf\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd wfcczs\n" +
            "$ ls\n" +
            "dir rlbnv\n" +
            "$ cd rlbnv\n" +
            "$ ls\n" +
            "55214 ttntt.mnl\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd wshwhzw\n" +
            "$ ls\n" +
            "34867 clnvqg\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd clnvqg\n" +
            "$ ls\n" +
            "dir bchstbpm\n" +
            "dir bgbdbr\n" +
            "dir clnvqg\n" +
            "25956 clnvqg.rbr\n" +
            "60939 gzzpwvzn.zzr\n" +
            "212583 jjfrh.ttr\n" +
            "dir jlsvjcdm\n" +
            "dir mzmqr\n" +
            "dir rtmg\n" +
            "dir tqnmwdl\n" +
            "$ cd bchstbpm\n" +
            "$ ls\n" +
            "dir sgbwd\n" +
            "dir ttntt\n" +
            "$ cd sgbwd\n" +
            "$ ls\n" +
            "267083 clnvqg\n" +
            "$ cd ..\n" +
            "$ cd ttntt\n" +
            "$ ls\n" +
            "243283 rwcmtrr.nvf\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd bgbdbr\n" +
            "$ ls\n" +
            "dir jshpz\n" +
            "$ cd jshpz\n" +
            "$ ls\n" +
            "dir dpnqrg\n" +
            "dir gsvwsc\n" +
            "173172 jjfrh.ttr\n" +
            "203836 jzm.fcn\n" +
            "83990 pdbtbmf\n" +
            "276348 pqcmhzhv.ltv\n" +
            "dir ttntt\n" +
            "dir wshwhzw\n" +
            "$ cd dpnqrg\n" +
            "$ ls\n" +
            "140379 dvmnw.gmd\n" +
            "$ cd ..\n" +
            "$ cd gsvwsc\n" +
            "$ ls\n" +
            "84951 pdbtbmf\n" +
            "$ cd ..\n" +
            "$ cd ttntt\n" +
            "$ ls\n" +
            "149785 brhvclj\n" +
            "dir rfcssr\n" +
            "$ cd rfcssr\n" +
            "$ ls\n" +
            "13174 lgwztd.fcm\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd wshwhzw\n" +
            "$ ls\n" +
            "55302 clnvqg.nqz\n" +
            "dir cpbh\n" +
            "dir mrv\n" +
            "139006 wshwhzw.chb\n" +
            "dir zgtnfm\n" +
            "$ cd cpbh\n" +
            "$ ls\n" +
            "13930 wvnzlj\n" +
            "$ cd ..\n" +
            "$ cd mrv\n" +
            "$ ls\n" +
            "207468 cqhpvpzf.zjn\n" +
            "dir drgcn\n" +
            "211947 pdbtbmf\n" +
            "dir svc\n" +
            "$ cd drgcn\n" +
            "$ ls\n" +
            "dir brhvclj\n" +
            "247117 gnrdmjls.tps\n" +
            "$ cd brhvclj\n" +
            "$ ls\n" +
            "162309 hpdm.ctv\n" +
            "231880 jjfrh.ttr\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd svc\n" +
            "$ ls\n" +
            "270511 cjsh\n" +
            "dir ttntt\n" +
            "$ cd ttntt\n" +
            "$ ls\n" +
            "43248 ssrrt.dqr\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd zgtnfm\n" +
            "$ ls\n" +
            "dir vhjtgv\n" +
            "$ cd vhjtgv\n" +
            "$ ls\n" +
            "98550 svc\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd clnvqg\n" +
            "$ ls\n" +
            "dir gcnc\n" +
            "141966 nrlptqrq.jtv\n" +
            "$ cd gcnc\n" +
            "$ ls\n" +
            "268141 bqzr\n" +
            "dir brhvclj\n" +
            "dir cjcpzv\n" +
            "262869 npp.vjv\n" +
            "$ cd brhvclj\n" +
            "$ ls\n" +
            "dir qqr\n" +
            "dir qwwl\n" +
            "265677 rcnn\n" +
            "$ cd qqr\n" +
            "$ ls\n" +
            "143274 stpjr\n" +
            "$ cd ..\n" +
            "$ cd qwwl\n" +
            "$ ls\n" +
            "dir clnvqg\n" +
            "213885 mfctzj\n" +
            "27640 tvp.fqv\n" +
            "$ cd clnvqg\n" +
            "$ ls\n" +
            "dir brhvclj\n" +
            "dir zzhwq\n" +
            "$ cd brhvclj\n" +
            "$ ls\n" +
            "67021 ttntt.fjp\n" +
            "$ cd ..\n" +
            "$ cd zzhwq\n" +
            "$ ls\n" +
            "dir gsplfsvm\n" +
            "$ cd gsplfsvm\n" +
            "$ ls\n" +
            "103196 qgjmbn\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd cjcpzv\n" +
            "$ ls\n" +
            "173344 bjpb.tln\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd jlsvjcdm\n" +
            "$ ls\n" +
            "dir bmgbjnbr\n" +
            "dir brhvclj\n" +
            "106074 brhvclj.cwn\n" +
            "96364 gwgzvwf\n" +
            "199266 hpdm.ctv\n" +
            "dir svc\n" +
            "168747 tsb.grv\n" +
            "170407 ttntt\n" +
            "$ cd bmgbjnbr\n" +
            "$ ls\n" +
            "dir bddbffsf\n" +
            "dir brhvclj\n" +
            "143376 clnvqg\n" +
            "dir ddbcvhqr\n" +
            "199097 flq.rls\n" +
            "156627 hbjcftfb.vvj\n" +
            "41970 jjfrh.ttr\n" +
            "dir rlj\n" +
            "dir svc\n" +
            "dir wshwhzw\n" +
            "dir zhczqq\n" +
            "$ cd bddbffsf\n" +
            "$ ls\n" +
            "181609 svc.vdv\n" +
            "$ cd ..\n" +
            "$ cd brhvclj\n" +
            "$ ls\n" +
            "dir brhvclj\n" +
            "64387 cdfj\n" +
            "168933 fhq.lzh\n" +
            "193119 njrrzm\n" +
            "129346 svc.tqs\n" +
            "$ cd brhvclj\n" +
            "$ ls\n" +
            "dir bpgmc\n" +
            "dir brhvclj\n" +
            "dir nrrpsn\n" +
            "dir ttntt\n" +
            "$ cd bpgmc\n" +
            "$ ls\n" +
            "42515 npp.vjv\n" +
            "dir wshwhzw\n" +
            "$ cd wshwhzw\n" +
            "$ ls\n" +
            "80221 pdbtbmf\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd brhvclj\n" +
            "$ ls\n" +
            "74083 qfwj\n" +
            "$ cd ..\n" +
            "$ cd nrrpsn\n" +
            "$ ls\n" +
            "58623 cdfj\n" +
            "$ cd ..\n" +
            "$ cd ttntt\n" +
            "$ ls\n" +
            "117488 ddd.sbj\n" +
            "69152 npp.vjv\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ddbcvhqr\n" +
            "$ ls\n" +
            "3037 brhvclj.ngg\n" +
            "dir flz\n" +
            "85361 hhjw.czf\n" +
            "193196 npp.vjv\n" +
            "dir svc\n" +
            "173507 tmfc\n" +
            "274216 ttntt.ddw\n" +
            "$ cd flz\n" +
            "$ ls\n" +
            "249582 pdbtbmf\n" +
            "$ cd ..\n" +
            "$ cd svc\n" +
            "$ ls\n" +
            "dir ddrthl\n" +
            "dir dptjfd\n" +
            "dir hqncdcdh\n" +
            "$ cd ddrthl\n" +
            "$ ls\n" +
            "148058 clnvqg\n" +
            "185720 svc.wch\n" +
            "$ cd ..\n" +
            "$ cd dptjfd\n" +
            "$ ls\n" +
            "101663 cdfj\n" +
            "80244 clnvqg.qzn\n" +
            "98435 jrsmdsjv.dft\n" +
            "dir nhjthr\n" +
            "$ cd nhjthr\n" +
            "$ ls\n" +
            "105069 fnvztg.pwp\n" +
            "dir pmgzdp\n" +
            "dir qgvzbclg\n" +
            "$ cd pmgzdp\n" +
            "$ ls\n" +
            "94671 pdbtbmf\n" +
            "$ cd ..\n" +
            "$ cd qgvzbclg\n" +
            "$ ls\n" +
            "183904 pdbtbmf\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd hqncdcdh\n" +
            "$ ls\n" +
            "105956 cwdsppc.hnn\n" +
            "91439 pdbtbmf\n" +
            "21314 wshwhzw.dcn\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd rlj\n" +
            "$ ls\n" +
            "173111 clnvqg\n" +
            "dir gsfzgvpz\n" +
            "dir ljwrdb\n" +
            "102231 pdbtbmf\n" +
            "$ cd gsfzgvpz\n" +
            "$ ls\n" +
            "266749 bcdrtwzd.nrz\n" +
            "$ cd ..\n" +
            "$ cd ljwrdb\n" +
            "$ ls\n" +
            "dir dlmhm\n" +
            "dir mpmtj\n" +
            "$ cd dlmhm\n" +
            "$ ls\n" +
            "50087 ttntt.rdv\n" +
            "$ cd ..\n" +
            "$ cd mpmtj\n" +
            "$ ls\n" +
            "254330 czh\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd svc\n" +
            "$ ls\n" +
            "131211 pdbtbmf\n" +
            "214730 tgpprcnb.dfv\n" +
            "$ cd ..\n" +
            "$ cd wshwhzw\n" +
            "$ ls\n" +
            "225058 cppwqrg\n" +
            "dir hrzsfhct\n" +
            "228371 tzvn.hhj\n" +
            "dir vjjgrt\n" +
            "$ cd hrzsfhct\n" +
            "$ ls\n" +
            "dir pqvlqpdt\n" +
            "139531 pvlhtz.grj\n" +
            "$ cd pqvlqpdt\n" +
            "$ ls\n" +
            "211827 hwnlsv.hhq\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd vjjgrt\n" +
            "$ ls\n" +
            "dir hdlcnfm\n" +
            "266998 npp.vjv\n" +
            "259189 qndrvvqv\n" +
            "$ cd hdlcnfm\n" +
            "$ ls\n" +
            "dir snhftjr\n" +
            "$ cd snhftjr\n" +
            "$ ls\n" +
            "198904 svc.wwb\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd zhczqq\n" +
            "$ ls\n" +
            "dir brhvclj\n" +
            "$ cd brhvclj\n" +
            "$ ls\n" +
            "123699 ttntt.cds\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd brhvclj\n" +
            "$ ls\n" +
            "dir dvqszvl\n" +
            "dir ttr\n" +
            "$ cd dvqszvl\n" +
            "$ ls\n" +
            "172068 jjfrh.ttr\n" +
            "$ cd ..\n" +
            "$ cd ttr\n" +
            "$ ls\n" +
            "dir rzsqqhn\n" +
            "$ cd rzsqqhn\n" +
            "$ ls\n" +
            "129077 cbpg\n" +
            "dir clnvqg\n" +
            "12120 jjfrh.ttr\n" +
            "211464 npp.vjv\n" +
            "12541 qgl.tvn\n" +
            "136465 snbrwg.cpg\n" +
            "$ cd clnvqg\n" +
            "$ ls\n" +
            "263592 cdfj\n" +
            "249813 pdbtbmf\n" +
            "190382 vpzfll.wqw\n" +
            "dir wshwhzw\n" +
            "$ cd wshwhzw\n" +
            "$ ls\n" +
            "57060 cdfj\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd svc\n" +
            "$ ls\n" +
            "dir clnqz\n" +
            "dir ggrwpjjg\n" +
            "dir mjvm\n" +
            "217220 ngntgnrw.brd\n" +
            "dir svc\n" +
            "146817 wshwhzw\n" +
            "dir zmchn\n" +
            "$ cd clnqz\n" +
            "$ ls\n" +
            "108229 clnvqg\n" +
            "195990 svc\n" +
            "29403 swf\n" +
            "$ cd ..\n" +
            "$ cd ggrwpjjg\n" +
            "$ ls\n" +
            "dir gdftglf\n" +
            "142336 hpdm.ctv\n" +
            "190941 npp.vjv\n" +
            "$ cd gdftglf\n" +
            "$ ls\n" +
            "209357 csfsthp.cnc\n" +
            "30622 rjs\n" +
            "dir ttntt\n" +
            "15836 wvqc.zsz\n" +
            "$ cd ttntt\n" +
            "$ ls\n" +
            "224617 rvsvs.dfh\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd mjvm\n" +
            "$ ls\n" +
            "dir ctlddnj\n" +
            "dir ddwg\n" +
            "207564 ncls.nwh\n" +
            "139671 npp.vjv\n" +
            "212692 wbqnvn.qhq\n" +
            "$ cd ctlddnj\n" +
            "$ ls\n" +
            "254493 dzr.dfv\n" +
            "123026 fmbzjww\n" +
            "79075 svc\n" +
            "43782 svc.vnw\n" +
            "dir vgqf\n" +
            "258169 vtljbndt.tvc\n" +
            "$ cd vgqf\n" +
            "$ ls\n" +
            "277076 dhqhfb\n" +
            "dir ffqg\n" +
            "dir svc\n" +
            "$ cd ffqg\n" +
            "$ ls\n" +
            "dir nrd\n" +
            "$ cd nrd\n" +
            "$ ls\n" +
            "205734 vrwph.bgp\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd svc\n" +
            "$ ls\n" +
            "dir brhvclj\n" +
            "111819 hpdm.ctv\n" +
            "68407 nglt\n" +
            "168768 ttntt\n" +
            "$ cd brhvclj\n" +
            "$ ls\n" +
            "75177 hvppncbd.sgs\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ddwg\n" +
            "$ ls\n" +
            "21210 phwqwshr\n" +
            "207062 rftdb.mcq\n" +
            "dir tthrf\n" +
            "$ cd tthrf\n" +
            "$ ls\n" +
            "dir czjnvnn\n" +
            "236764 dhhw.mbs\n" +
            "25583 ljdwgwhm.fbm\n" +
            "dir lrgtg\n" +
            "113563 srsh.fpb\n" +
            "dir vzhpqb\n" +
            "110004 zgcvsc.pmm\n" +
            "$ cd czjnvnn\n" +
            "$ ls\n" +
            "143802 cbqmvtw.zjv\n" +
            "37329 svc.rwf\n" +
            "$ cd ..\n" +
            "$ cd lrgtg\n" +
            "$ ls\n" +
            "dir gpwpc\n" +
            "$ cd gpwpc\n" +
            "$ ls\n" +
            "257389 jjfrh.ttr\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd vzhpqb\n" +
            "$ ls\n" +
            "95696 clnvqg\n" +
            "218063 clnvqg.qtd\n" +
            "dir hnqqrdf\n" +
            "dir ttntt\n" +
            "$ cd hnqqrdf\n" +
            "$ ls\n" +
            "dir brhvclj\n" +
            "$ cd brhvclj\n" +
            "$ ls\n" +
            "dir ttntt\n" +
            "$ cd ttntt\n" +
            "$ ls\n" +
            "40453 npp.vjv\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ttntt\n" +
            "$ ls\n" +
            "30351 clnvqg.fwm\n" +
            "60519 pdbtbmf\n" +
            "dir pfhrgj\n" +
            "247371 qcvs.rbj\n" +
            "155276 qdjqgqqw\n" +
            "$ cd pfhrgj\n" +
            "$ ls\n" +
            "41975 svc.fwm\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd svc\n" +
            "$ ls\n" +
            "110021 jftcvbl.lhh\n" +
            "$ cd ..\n" +
            "$ cd zmchn\n" +
            "$ ls\n" +
            "188817 brhvclj.zcq\n" +
            "dir ddzjr\n" +
            "dir fnmhc\n" +
            "dir tbhwr\n" +
            "dir vbtmfp\n" +
            "dir zrzrjm\n" +
            "$ cd ddzjr\n" +
            "$ ls\n" +
            "217591 clnvqg.css\n" +
            "dir ttntt\n" +
            "dir wshwhzw\n" +
            "$ cd ttntt\n" +
            "$ ls\n" +
            "dir bscqn\n" +
            "132748 svc.pbh\n" +
            "$ cd bscqn\n" +
            "$ ls\n" +
            "25049 tlcwbbng.spf\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd wshwhzw\n" +
            "$ ls\n" +
            "164106 brhvclj\n" +
            "193910 chnrbb\n" +
            "dir njsnwmrc\n" +
            "dir nnhcsb\n" +
            "195858 qrrt.pmp\n" +
            "43854 ttntt\n" +
            "90698 vdvfdgcl.mpr\n" +
            "$ cd njsnwmrc\n" +
            "$ ls\n" +
            "273188 hpdm.ctv\n" +
            "261368 wzpzjgw\n" +
            "$ cd ..\n" +
            "$ cd nnhcsb\n" +
            "$ ls\n" +
            "dir dmnmcgr\n" +
            "67701 pdbtbmf\n" +
            "145277 ptlqcl.sgt\n" +
            "dir pwrjt\n" +
            "13031 svc.jbb\n" +
            "263232 svc.mvh\n" +
            "91724 vggpwj\n" +
            "$ cd dmnmcgr\n" +
            "$ ls\n" +
            "43175 szbcvp\n" +
            "109544 vjqjzp\n" +
            "$ cd ..\n" +
            "$ cd pwrjt\n" +
            "$ ls\n" +
            "dir ffqfqvjv\n" +
            "dir svc\n" +
            "$ cd ffqfqvjv\n" +
            "$ ls\n" +
            "102537 bgmgwt.gmg\n" +
            "$ cd ..\n" +
            "$ cd svc\n" +
            "$ ls\n" +
            "177913 jswrfjvp.vgc\n" +
            "145714 npp.vjv\n" +
            "272487 zzsl\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd fnmhc\n" +
            "$ ls\n" +
            "dir dhhwdbb\n" +
            "dir ttntt\n" +
            "dir wshwhzw\n" +
            "$ cd dhhwdbb\n" +
            "$ ls\n" +
            "201253 zpvv\n" +
            "$ cd ..\n" +
            "$ cd ttntt\n" +
            "$ ls\n" +
            "dir brhvclj\n" +
            "40561 chb.fbh\n" +
            "159663 gzwrtwtd\n" +
            "119970 wwz.rft\n" +
            "$ cd brhvclj\n" +
            "$ ls\n" +
            "19488 gwtvbzph\n" +
            "98427 hpdm.ctv\n" +
            "8547 swncltj.sbn\n" +
            "54698 wshwhzw.fmj\n" +
            "dir ztlvdwq\n" +
            "$ cd ztlvdwq\n" +
            "$ ls\n" +
            "259702 cdfj\n" +
            "230030 mbz.ttq\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd wshwhzw\n" +
            "$ ls\n" +
            "dir clnvqg\n" +
            "dir gwcsprqv\n" +
            "259902 hmrb.njt\n" +
            "125791 pdbtbmf\n" +
            "dir spffhcnz\n" +
            "268942 srwjphc.lbp\n" +
            "dir wshwhzw\n" +
            "$ cd clnvqg\n" +
            "$ ls\n" +
            "208408 hdwf.ppm\n" +
            "163498 npp.vjv\n" +
            "$ cd ..\n" +
            "$ cd gwcsprqv\n" +
            "$ ls\n" +
            "135381 hpdm.ctv\n" +
            "150197 jjfrh.ttr\n" +
            "61236 lwjhqc\n" +
            "150026 tgwjwdwj\n" +
            "dir wshwhzw\n" +
            "$ cd wshwhzw\n" +
            "$ ls\n" +
            "51089 wshwhzw.qtb\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd spffhcnz\n" +
            "$ ls\n" +
            "79855 bmrcdm\n" +
            "dir clnvqg\n" +
            "180748 jjfrh.ttr\n" +
            "122314 pdbtbmf\n" +
            "85765 tbpsjv.tfw\n" +
            "$ cd clnvqg\n" +
            "$ ls\n" +
            "dir nvjj\n" +
            "dir tqr\n" +
            "$ cd nvjj\n" +
            "$ ls\n" +
            "dir gqhqmlhm\n" +
            "dir mbfftpbj\n" +
            "$ cd gqhqmlhm\n" +
            "$ ls\n" +
            "211887 brhvclj\n" +
            "$ cd ..\n" +
            "$ cd mbfftpbj\n" +
            "$ ls\n" +
            "60539 clnvqg.gqw\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd tqr\n" +
            "$ ls\n" +
            "dir fvdch\n" +
            "$ cd fvdch\n" +
            "$ ls\n" +
            "124864 svc\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd wshwhzw\n" +
            "$ ls\n" +
            "dir jrzmrg\n" +
            "103956 npp.vjv\n" +
            "126932 zvwpmnqh.zmh\n" +
            "$ cd jrzmrg\n" +
            "$ ls\n" +
            "dir svc\n" +
            "$ cd svc\n" +
            "$ ls\n" +
            "143992 jhcvmjp.flt\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd tbhwr\n" +
            "$ ls\n" +
            "42758 jjfrh.ttr\n" +
            "$ cd ..\n" +
            "$ cd vbtmfp\n" +
            "$ ls\n" +
            "171021 npp.vjv\n" +
            "$ cd ..\n" +
            "$ cd zrzrjm\n" +
            "$ ls\n" +
            "dir brhvclj\n" +
            "201331 cgtqdtqq.gsc\n" +
            "206771 clnvqg.zpr\n" +
            "55754 jgprc\n" +
            "dir jrww\n" +
            "dir sqtzndzg\n" +
            "$ cd brhvclj\n" +
            "$ ls\n" +
            "190144 brhvclj\n" +
            "198432 rvbqglv.gzg\n" +
            "$ cd ..\n" +
            "$ cd jrww\n" +
            "$ ls\n" +
            "110574 clnvqg\n" +
            "$ cd ..\n" +
            "$ cd sqtzndzg\n" +
            "$ ls\n" +
            "189854 clnvqg.qbc\n" +
            "260937 ldm\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd mzmqr\n" +
            "$ ls\n" +
            "117135 dfws\n" +
            "98546 jjfrh.ttr\n" +
            "dir jptq\n" +
            "dir sctfsvs\n" +
            "dir svc\n" +
            "dir swsjjr\n" +
            "dir tstct\n" +
            "86793 vhfcwbv.wfq\n" +
            "$ cd jptq\n" +
            "$ ls\n" +
            "dir brhvclj\n" +
            "52040 cnmb\n" +
            "dir fvqh\n" +
            "240539 rrdsr\n" +
            "dir tczvhsgn\n" +
            "dir zbbq\n" +
            "$ cd brhvclj\n" +
            "$ ls\n" +
            "254250 vtgsqs\n" +
            "$ cd ..\n" +
            "$ cd fvqh\n" +
            "$ ls\n" +
            "18471 hpdm.ctv\n" +
            "$ cd ..\n" +
            "$ cd tczvhsgn\n" +
            "$ ls\n" +
            "241619 wshwhzw.cmh\n" +
            "$ cd ..\n" +
            "$ cd zbbq\n" +
            "$ ls\n" +
            "82844 vtjbg.svl\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd sctfsvs\n" +
            "$ ls\n" +
            "dir nbjljt\n" +
            "dir rszwnh\n" +
            "56137 stcmw.wwr\n" +
            "$ cd nbjljt\n" +
            "$ ls\n" +
            "214471 fst.pwm\n" +
            "$ cd ..\n" +
            "$ cd rszwnh\n" +
            "$ ls\n" +
            "dir brhvclj\n" +
            "dir ldrsbj\n" +
            "280840 pzs\n" +
            "274286 vpsnwfvc.bqg\n" +
            "$ cd brhvclj\n" +
            "$ ls\n" +
            "60019 fwbgt.rmb\n" +
            "$ cd ..\n" +
            "$ cd ldrsbj\n" +
            "$ ls\n" +
            "23175 jjfrh.ttr\n" +
            "120171 lpb\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd svc\n" +
            "$ ls\n" +
            "dir rpgm\n" +
            "$ cd rpgm\n" +
            "$ ls\n" +
            "205836 ttntt\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd swsjjr\n" +
            "$ ls\n" +
            "100874 cdfj\n" +
            "229131 dcdm.jcz\n" +
            "18144 mspnwqmw.bpc\n" +
            "$ cd ..\n" +
            "$ cd tstct\n" +
            "$ ls\n" +
            "94293 clnvqg\n" +
            "110519 hpdm.ctv\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd rtmg\n" +
            "$ ls\n" +
            "dir clnvqg\n" +
            "260745 gvmlqpbs.mqm\n" +
            "dir ldcwjlm\n" +
            "192472 ttntt.gnf\n" +
            "$ cd clnvqg\n" +
            "$ ls\n" +
            "121970 zsmwvt.sbw\n" +
            "$ cd ..\n" +
            "$ cd ldcwjlm\n" +
            "$ ls\n" +
            "254060 hpdm.ctv\n" +
            "225558 svc.cmz\n" +
            "229614 wshwhzw.dzn\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd tqnmwdl\n" +
            "$ ls\n" +
            "50489 cdfj\n" +
            "dir gltsgnf\n" +
            "265020 hqnjnt.gtc\n" +
            "dir psltbtl\n" +
            "$ cd gltsgnf\n" +
            "$ ls\n" +
            "dir ttntt\n" +
            "dir wgwvd\n" +
            "$ cd ttntt\n" +
            "$ ls\n" +
            "120262 zvjh.mzl\n" +
            "$ cd ..\n" +
            "$ cd wgwvd\n" +
            "$ ls\n" +
            "172875 flt.jbn\n" +
            "173182 pdbtbmf\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd psltbtl\n" +
            "$ ls\n" +
            "dir sgqvlr\n" +
            "88647 svc.jnw\n" +
            "208354 svc.jzb\n" +
            "98962 zsld.hjs\n" +
            "$ cd sgqvlr\n" +
            "$ ls\n" +
            "151451 brhvclj.thj\n" +
            "213287 pdbtbmf\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd dtqtvvrn\n" +
            "$ ls\n" +
            "253546 ttntt.dtl\n" +
            "257990 wshwhzw.rqp\n" +
            "$ cd ..\n" +
            "$ cd lcz\n" +
            "$ ls\n" +
            "dir csqfmjz\n" +
            "dir nfgnnt\n" +
            "dir rwzmjgqz\n" +
            "dir wshwhzw\n" +
            "dir wtvtszw\n" +
            "$ cd csqfmjz\n" +
            "$ ls\n" +
            "124616 wwbvnjg\n" +
            "$ cd ..\n" +
            "$ cd nfgnnt\n" +
            "$ ls\n" +
            "dir dvslq\n" +
            "dir fbzss\n" +
            "dir ttntt\n" +
            "$ cd dvslq\n" +
            "$ ls\n" +
            "132520 cdfj\n" +
            "dir nsq\n" +
            "1447 svc.spv\n" +
            "$ cd nsq\n" +
            "$ ls\n" +
            "265807 hpdm.ctv\n" +
            "95487 wpqhvf.dqg\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd fbzss\n" +
            "$ ls\n" +
            "153744 rccwtz.tfs\n" +
            "$ cd ..\n" +
            "$ cd ttntt\n" +
            "$ ls\n" +
            "109641 wshwhzw\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd rwzmjgqz\n" +
            "$ ls\n" +
            "12039 tpggbsd\n" +
            "$ cd ..\n" +
            "$ cd wshwhzw\n" +
            "$ ls\n" +
            "57458 qqnznsvj\n" +
            "$ cd ..\n" +
            "$ cd wtvtszw\n" +
            "$ ls\n" +
            "dir dlr\n" +
            "151194 dzwmwjz\n" +
            "dir nzq\n" +
            "$ cd dlr\n" +
            "$ ls\n" +
            "142748 nchwzm\n" +
            "$ cd ..\n" +
            "$ cd nzq\n" +
            "$ ls\n" +
            "242998 wqzpw.hvh\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd pcqjncwl\n" +
            "$ ls\n" +
            "10646 wpst.sds\n" +
            "$ cd ..\n" +
            "$ cd qwvfpgl\n" +
            "$ ls\n" +
            "65156 bfmt.zcb\n" +
            "157745 hpdm.ctv\n" +
            "104612 rtbbgjr.wpv\n" +
            "$ cd ..\n" +
            "$ cd rtmj\n" +
            "$ ls\n" +
            "79449 wngz\n" +
            "$ cd ..\n" +
            "$ cd shg\n" +
            "$ ls\n" +
            "27187 srtj.qwz\n" +
            "$ cd ..\n" +
            "$ cd tcdmgwp\n" +
            "$ ls\n" +
            "277338 wshwhzw";
}
