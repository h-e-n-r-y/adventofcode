package de.henry.adventofcode.y2022;

import java.util.HashSet;
import java.util.Set;

public class Day06 {

    public static void main(String[] args) {
        System.out.println("Packet Marker after: " + countCharsTillMarker(INPUT, 4));
        System.out.println("Message Marker after: " + countCharsTillMarker(INPUT, 14));
    }

    static int countCharsTillMarker(String pInput, int markerLength) {
        int i = 0;
        Set<Character> chars;
        do {
            chars = new HashSet<>();
            for (int j = 0; j < markerLength; j++) {
                chars.add(pInput.charAt(i+j));
            }
            i++;
        } while (chars.size() < markerLength);
        return i + markerLength - 1;
    }
    private static final String INPUT = "bhzhtzzsczszsjjjzddfzdfzfjfzfbbnntnzznwzzvfvrrqmrmmdzzfqfhqhsqqpwpgwpppbtbnnstthmhrrsmmvsmmhjmjfmfsfjfnfnjjvcjjszjszjsszbznzbnzndzzmlldsdgdcddmqmfqqlcllbvllztzctzczdzttlmtlthtmhtmhmmszsllvzvdzzzsqzqbqccvfvcffzsfslfsllcglclwlvwvzzdsslggtzzgzdzmzddjljvvztttsgscsstztjztjztzvzwwthtftppnmpmmcpmmjlmjjjsfjsjppgcgwcggzffzwzbbmbrbprpqqpccfncfnffvcffsqqtzqzqwzwvzwwwbjbfbcbfblltnlnhhcthtvvzzfcfgfddlggbbshsggplglqqbrbggsvvzdvvlfvlvpvhhmggbrrnppjfjhffttfpffbdfbfvfqvvtcvvbvnnhbhhglgjgzzghhwrrtntrtwwfdfdmmcmtctftpptllzqllzflfrrgqgvgdvdfdbddprrrgccqvqnnmtmvmffpzzqggfbfnfwwqdqldqqlnqnttnbttrffnmmzwzjjtrjtrtmmqsmqmffqmfqfhhbthbhdhvdhvdvmvdmdhdshsqslldzztvvmzzdcccmbbhfhshrrrpsrrqqmdmmgdmmwdmdjdqqmcmttpgtgwgpwpprbrprhrsrllhsllprlplhppfzpffbhbccwdwbbrpbpvpqqmsspjssmbbmfmrmnrnwwgbwwbpwpjwwhqqgcqcvqccgffzpfftcffqlqjjznnlflhhlcczhzvhzhmzhmhfhnnqznntstwtggqjgjhggsvslltjlttfjjgffjzjwzzqzrrhlhzhbhphmhlmlzmzsmzmccvllgrrpbrbfbjfjttqjttdrdhhggqgddppqgpqgpgtptjptpllwccmwcmcpmcppdrrtstqqczqzvvlsltlddnvdvggcqqblqqsjqjttzhtzzszllqsqfqddqdbqddwqddfzzlczcscfsfpfdpdrpddsggcqchcfcpcssstwstwtggghvhqhzzqssjddwjwbjjsnjnfnwwglwwfnfhnnscsggzgjzzhzmmqfqsqwqrwqqqdtdcttzvvnbngbbcdbdggddnmddgzghhzgghwwbjbttlwlcctlccwwdhhrqrvrjjlglssgttpllwclwwtptwptwtvthtbhbzhbzhhrsrwwwnrwrfwfnwnhhnqqdjqjpqqwdwttzhttcdttvztzltzlzmzddrsdsfdsfftdfffmwffrjrffqrfqfsfqqqgqjggwzzrnnqfnqffdbfbtbbrpbrpbptpwttjmjjzrrhhqppdzdtdjttqwwtddjdzzmgzzhwwwdsdgssprsrgsgbbphhdpdwppnfppdqqwzzpbzzqwqpqsqhqdhqqtwwjnnmvmwvmmwwgjgzjjvcjcvcjcnjcncmmphmmvmwmwpwbbtbffhnhshgssgvgvrrbwbtbddqmqfqvvfqvqdvvdbvdbdcdfdlflmffrwwgmmttrztrrfrqrpqrrzjrjpjdpjprrnhhbhcbbcwwqlwwcssbddfrfjrfjfrjfjvvdmdtdzzlvzlzhzmhmhphchnnfqnffvccfpfbfpfqpprrmttzrzzjzmjmzjmmfvmmrzrqqdllgjlglcchssgllsbllrbrlrjlrrhhfwwsqwsstpssznzcznzqzssvtvtrrqwqvvtssgfsfhssljjnwjnjddjdggclcrrfsfhsstgtdtctfttvvsbvvbtbttcgcssjlslhlpljpppwzwnwdnngmgjjbzznwwdllrrfppshhvdhhldhdbbdbjbdjjrnjjzhzfhhsqqbqgmsbvnjsptlrsszlqfmgprvscphmqztbgtlrqvcgdzcptcqjncrdtfqnghnbmwwmcjgtjlbvqqzslgbbntrdfnvfjvfgcgngndjcspgwmpnsrqzzvzljbzlzzrwflrqqqmhsvqwbmdftnhwwzgqrlhddbbtwvbphljmstcjzvpjqwcnhlvpqvqdgvntgqzqwrlwbwvngwtqgrhznlzcvbwqmwncccjctrdzrmzjsvrmcfpjjcczhbvdfwhqvczggfmrspvprvvthvtqnsphpcsdmbrtbdqljvssdrhwjsrrlzprstpgqcbpmnpdgzgjttwcfrgjnsghmszlclgvmlsjrqfvflbnhwwphtvrnrbhdvdglcvgpzfsjpwwhtlvvdzthsrldfzhnlrblzsjjnwclqsqzgdbflhvpwcrtfbfbjcjttbjpvfgvfcswnqqwshbmqlscdzzwshfqwsvwnwzltbnrmzzhzvtwpzqcgwshpvzgtcmwrtrwctnpzbznnwqphnrgwljtrcwlqmvlndwrdrctztnmswslqmbjcmtlrmcpjvzccqszrnflqnqzttbhqlrhbmqdpscqvfgtdbnwjdcljwcbgbgjfzgrgpwqzqgbnrtpntfthhdbqmswvhnmwmszpghgjjzrbnbbfjblpstdfslmmmqfdcrhblqjqfphnldrvvfpnfrcvprjnqbzbspfpjtgqhnjbhnrwzcjvdbshhqpgrmzqpmjfmqwqvvdbddbsldwzzsrhnhsjjnvljrbwcnjrnjpmrrvfthftgptgtlpbgqffthflgftwcrqcqwqwrmrcmfrcqgmrnqjbscdcgrqlhjzthvzdgjbvpswflqcgsnlmgmvcsttsgmnqdtvwdvrndvfdcvrcwmqlmlhtrvthsndsrmnsfmdmfnpfmfhzjqmtcjzcrnsjdztztvgdtlrmbdmmstbfgpmmzthcslpvgrpgfljfgqlqhldfwvvvdvbzjtdtppbtrnqwsqztjrsjhtfrgmvsdngvsdzjgpwrldqpzdpvhljzpjvttwltdwcrhcbrgrvdrmpwvdwjchqsjfprbgtjtzggvgrgmlvvwqrjfprbbgjjqrtdfnrdffwbswbvqtqtfsrhsgrjhftqldhmcnmsnfflmdrzqdjmbqqgqsttdmtrrvfsjnccnhcpcvqtrzdjzrpwswmjvvgsgwvnmdgqwlctrlhqnsmczbwsjhmtgvdcgsndzlstcwchcztqqbtdwfvlljdvdlzljslgnzpmqvzfcvqhdzvgchffqgfwrnmwqzwgbzblpmvddlvnhglrhdnwzqwztzgjczjpwcjwmpnrnrhncfjfggrbphrjztwtfqmfjlwfhnqfftfghbnvtwgtmdzzrdrtmfrwhrrbhzmcllsgqzwzzqtgdggvzptvtdcpzmtmsfcfbjtzlbdrwhdbtdhhrgggmddnzsvjwgcdcqfppqwphfvlhmgqsznlhmgpnjvcvrwwppnphchgsrhjwjcpjggsrcwrvnllfgrmjltfzwhmbqwpwwzmrtlqcprrqztcgnghcbvzrbfptjmhtdcfhhffdbrswqpnpppnpqwtflrrmqgjzctmmvvvwzllbsfdvpqjtmvpjcpmjztscsgbdznfgcmtjzdqzwqrsvstnnvddcstzqjtnbsnlptpmbmfqmhppgnjrffqrtchgptbmwlwbwbcqqfngpbwtwdmlmdstmqwcwjtbwbbbhghgptmvhfmvqfvpwqzwnbjdhpwlgjgvprdjbnlzhnllssbpvzfzspwsscfpqtpdvtzvqncfrfrgddsdglqvpblmpcczlqfdmwzmgvrljhqtcglcvfhbdwhbttqqrjbqwhsrhrbjwmtqwqddvdggdwfsmnpbpvvgsqnvvrqntwmbzdnqpmmqtbnlsbmslpfmqjtgvbddhwvlvjtlrhqdpfnjwtbhwjwdrpgctbbrdqvbbnvgqwngrhqfvwzmlqtmhfqphnmczlbdpnbmpvwrsjbcnjnvcfgnsvlhpzdgdzgvfbgwdcrswznrggnghzssdwqvvlwftqhbnwdvghhvjlqqmcnqmvbwhrrnsswlwmwbsmpcpdzzgmcmqnzpvjpzqbwcsgdhqtqhcpbtqftvscmntsbdcbrndvlfhprpblzbjcpqhfljtvnvtgvrcgqbsgl";
}