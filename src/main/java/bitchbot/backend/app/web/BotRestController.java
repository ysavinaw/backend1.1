package bitchbot.backend.app.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import bitchbot.backend.app.domain.JsonViews;
import bitchbot.backend.app.domain.Input;
import rita.RiLexicon;
import rita.RiMarkov;
import rita.RiString;
import rita.RiTa;

@RestController
@RequestMapping("/")
public class BotRestController {
	
	@JsonView(JsonViews.Public.class)
	@PostMapping
	public String createPoem(@RequestBody Input json) {
		
		String corpus = "This blackness that surrounds me. The evil this has lain on me.  You piece of demon work. You piece of slime. My heart stirs and sinks. My heart sinks with disappointment, and ire. This disappointment unbears my heart. The disappointment sinks my heart. There is no way out. The pranking doesnt stop. Am I the victim or the victor. Is happy so abstract.  Abstraction of happiness. Totally splintering beside the fire that burns.  The fire that burns within me. The fun is vanishing.  I see failure everywhere.  Totally rabid on the earth.  I find dull inspiration and inspiration dull.  Flickering restless. Unreliable bullshit. and my heart untethers. Invoke the gods of consumerism. Invoke the gods of bullshit. Invoke the gods of let this piece of shit work. I violate the wanting rats. Poison within its scope. Invoke invisible meaning. Tighten up your wig. Tighten up your standards. Dismayed I was. Dismayed I was to discover.  Dismayed I was to uncover. Only to find that it disintegrates. Only to find that it breaks.  Only to find that I am not the first. I fiddled and tried to no avail. I fiddled and tried and failed.   Exploding trees branch into me. Maybe travel the seven seas and discover \"good\".  Maybe ought to give up and leave. To find another issue as bad as this.  To find another one as bad as this. To find another anything to up my hopes. In case you were wondering why. In case you were wondering.  Infuriating to the core. Infuriating and unyielding. Super crappyfragilisticexpeatrocious. Super crappyfragilisticexpeatrocious. What a burning ring of fire. Throw it away. Throw it all away.  Postmodernism in its grasp.  Postmodernism in my own grasp. Fifty shades of pissed off. Fifty shades of broken hearted. Fifty shades of irritated and on the brink. Fifty shades infuriating. Put it where the sun don’t shine.  Fifty shades of never again. Fifty shades of I should have known better. The course of love never did run smooth. But either it was different in blood.  War, death, or sickness. Swift as a shadow, short as any dream.  The jaws of darkness do devour me up.  So quick bright things come to confusion.  Of me you shall not win renown.  I saw the snare, and I retired. You are not one to be desired  I know you are proud to bear your name.   Your pride is yet no mate for mine.  Too proud to care from whence I came. Some meekly dumbass you must find.  And my disdain is my reply. You put strange memories in my head. But there was that slit across my throat. Which you had hardly cared to see. Indeed I heard one bitter word said meekly. The guilt of blood is at your door.  You changed a wholesome heart to gall. You held your course without remorse. To make me trust my modest worth. And slew me with your noble birth. But sickening of a vague disease. You know so ill to deal with time. You needs must play such pranks as these. If Time be heavy on your hands. Are there no beggars at your gate.  And let this foolish human go.  So long had we in silence stood.  Where not a pulse should beat but ours. And I might live, love, die alone.  Far from the cruel and the cold. A paradise so pure and lonely. Would this be world enough for me.  And, bursting into heartfelt tears. My dreams, have boded all too right. We part, forever part, tonight.  I've seen my fondest hopes decay. Love not, love not. Things that are made to fade and fall away.  You have but blossomed for a few short hours. Love not! Love not! the thing you love may change. The rosy lip may cease to smile on you. The heart still warmly beats, yet never true. Love not! Love not! the thing you love may die. Love not! And you've robbed my world of rest. It would have been a beauteous dream--if it had been no more. But I was sad, and felt no mirth. Do you call virtue your ungratefulness. How the dear waiting eyes. Watch me and love me yet. Sad home of broken memories. Return, though all the pain too much. Of all once loved, long lost. Come back again. Too late I cry. We are two ghosts that had their chance to live. And death is sin as well. I shall be unhappy anywhere. My soul lies out like a basking hound, disappointed. Along my life the length I lay, . You fill tomorrow and yesterday’s problems.   I am warm with the summers that will never be.  Two worlds are whispering over me. From the backward shore to the shore before, a life before you. From the shore before to the backward shore, before you. And like two clouds that meet and pour, each through each, till core in core. A single self reposes, frowns. The nevermore with the evermore, stride in stride. And wherever you lie seems unhappy ground. And when, awakened by some putrid sound. A dreamy eye uncloses, jarred awake. To feel I may dream and to know you deem yourself unfit. Your failing  work is done forever. My palpitating fever dissolves as you do. That gain and loss, loses and gains. And beats the hurrying blood on the brunt of a thousand pains. All the tedious tasked toil of the difficult long endeavor. Solved and quit by no more fine than these limbs of mine. Bought up at so light a cost as one bloody fall. And three days on the ruined wall among the failed dead. And live the joy of an embodied soul. Free as a liberated ghost, as death. I was emptied out to kneel before you, but no. That fire of pain burned so brief awhile. That fire from which I come, as the dead come. Forth from the irreparable tomb of the masses. Or as a martyr on his funeral pyre. Heap up the burdens other men do bear. Through years of segregated care, we had peace. And takes the total load upon my shoulders broad. A breathing sigh. A sigh for answer. A sigh of short lived relief. A little talking of outward things. The careless fuck is nary a dancer. Keeping sour time to the air you sing. A little pain when the fuck grows wider.  \"I may not cross\" and the voice beside me. Then cries of pain, and arms outreaching. The beck grows wider and swift and deep. Passionate words as of one beseeching. The loud beck drowns them: we walk and weep. A yellow moon in splendor drooping. A tired queen with her state oppressed. Low by rushes and sword-grass stooping. With the moon's own sadness in our faces. Where joy is withered, blossom and bud.  As I walk desolate day by day.  And yet I know past all doubting, truly. A knowledge greater than grief can dim. Adieu, bright lights, that were my heaven. Adieu, fair form, earth's pattern given Your rays have fallen but coldly on me. One far less fond, perchance, had won me. Bound in those icy chains by thee. I loved thee once, I'll love no more. Thine be the grief as is the blame. Thou art not what thou was before. What reason I should be the same. He that can love unloved again. Hath better store of love than brain. While unthrifts fool their love away. Nothing could have my love overthrown. If thou had still continued mine. I might perchance have yet been yours. But thou thy freedom didst recall. And then how could I but you disdain. Am I your captive to remain.  When new desires had conquered me. And changed the object of my will. It had been lethargy in me. Not constancy, to love you still. And prostitute affection so. Our life is twofold; sleep hath its own world. A boundary between the things misnamed.  Death and existence. Sleep hath its own world. And dreams in their development have breath. And tears, and tortures, and the touch of joy. They leave a weight upon our waking thoughts. They take a weight from off our waking toils. A portion of ourselves as of our time. And failures the heralds of eternity. The tyranny of pleasure and of pain. Darkened with your shadow that you are wretched. A tablet of unutterable thoughts. Was traced, and then it faded, as it came. The boy was sprung to manhood; in the wilds. Of fiery climes he made himself a home. And his soul drank their sunbeams. With strange and dusky aspects. Himself like what he had been. And on the shore I am a wanderer. There was a mass of many images. A part of all. and in the last you lay.  Couched among fallen columns. Of ruined walls that had survived the names.  So cloudless, clear, and purely beautiful. That God alone was to be seen in heaven. My dream was past. it had no further change. It was of a strange order, that the doom. Almost like a reality, the one to end in madness, both in misery. Alas! how light a cause may move dissension between hearts that love. Hearts that the world in vain has tried. And sorrow but more closely tied.  That stood the storm when waves were rough. Yet in a sunny hour fall off. Like ships that have gone down at sea. When heaven was all tranquility. To spread the breach that words begin. And eyes forget the gentle ray. Till fast declining, one by one. The sweetness of love are gone. And hearts, so lately mingled, seem like broken clouds,--or like the stream. Look in my face; my name is Might-have-been.  I am also called No-more, Too-late, Farewell. Unto thine ear I hold the dead-sea shell. Cast up thy Life's foam-fretted feet between. Unto thine eyes the glass where that is seen. Is now a shaken shadow intolerable. Of ultimate things unuttered the frail screen. Mark me, how still I am. But should there dart. One moment through my soul the soft surprise. Of that winged Peace which lulls the breath of sighs. Then shalt thou see me smile, and turn apart. Sleepless with cold commemorative eyes.  If it were less bitter. Maybe I could weep. To be thus cheated, like a child asleep. Were not my anguish far too dry and deep. Yet faithlessness in the humblest part. Is better at last than proud success. And patience and love in a chastened heart. Are pearls more precious than happiness.  To the spring-time freshness of being right again. All trouble will seem but a flying flake. And lifelong sorrow a breath on the pane. Better trust all and be deceived. And weep that trust and that deceiving. Than doubt one heart that, if believed. O, in this mocking world too fast. The doubting fiend overtakes our youth. Better be cheated to the last. Than lose the blessed hope of truth. Farewell! farewell! is often heard From the lips of those who part. But it springs not from the heart. But given to me the lips that say The honest words, Good-bye! Adieu! adieu! may greet the ear, But when we leave the kind and dear. To meet with cares and strife. No cold adieu, no farewell, lives. But the deepest sob of anguish gives. Go, watch the pale and dying one. When the glance hast lost its beam. When the brow is cold as the marble stone. And the world a passing dream. And the latest pressure of the hand. The look of the closing eye. Yield what the heart must understand. A long, a last Good-bye. I may not, dare not, fancy now. The grief that clouds my lovely brow. I dare not think upon thy vow. My heart must be like bended bow. A time will come with feeling naught. For, if I fall in battle, fought. Thy hapless lover's dying thought. And if returned from conquered foes. How blithely will the evening close. How sweet the linnet sing repose. Nothing is harder for a man. To conceive of an object impersonally. I mean to see in it an object and not a person. One may even ask whether it is possible for him to dispense, for a single moment, with the machinery of his instinct to construct a personality. After all, you associate with your thoughts. However abstract you may be, as with individuals. Against whom you must fight or to whom you must attach yourself, whom you must protect, support and nourish. Let us watch or listen to ourselves at the moment when we hear or discover a new idea. Perhaps it displeases us because it is so defiant and so autocratic. And we unconsciously ask ourselves whether we cannot place a contradiction of it by its side as an enemy.  Give me a feeling of satisfaction, for it shatters the oppressive tyranny of the unconditional. If the new idea enters in gentle shape, sweetly patient and humble. And falling at once into the arms of contradiction, we put our autocracy to the test. Can we not come to the aid of this weak creature, stroke it and feed it, give it strength and fullness, and truth. Is it possible for us to show ourselves parental or chivalrous or compassionate towards our idea. Then again, I see here a judgment and there a judgment. Sundered from each other, never looking at or making any movement towards each other. So I  am tickled by the thought, whether it be not here feasible,to draw a conclusion, with the anticipation. That if a consequence follows this conclusion it is not only the two judgments united.  Laugh, and the world laughs with you. Weep, and you weep alone. For the sad old earth must borrow its mirth. But has trouble enough of its own. Sing, and the hills will answer. Sigh, it is lost on the air. The echoes bound to a joyful sound. But shrink from voicing care. Rejoice, and men will seek you. Grieve, and they turn and go. They want full measure of all your pleasure. But they do not need your woe. Be glad, and your friends are many. Be sad, and you lose them all. There are none to decline your nectared wine. But alone you must drink life's gall. Feast, and your halls are crowded. Fast, and the world goes by. Succeed and give, and it helps you live. But no man can help you die. There is room in the halls of pleasure. For a large and lordly train. But one by one we must all file on. Through the narrow aisles of pain. Through the narrow isles of pain.";
		RiLexicon rl = new RiLexicon();
		RiMarkov rm = new RiMarkov(3);
		rm.loadText(corpus);

		String input = json.getText();
		
		 String sentence1 = rm.generateSentence();
		 String fsentence1 = "";
			if (!(sentence1 == null)) {
				RiString rs1 = new RiString(sentence1);
				String[] rs1words = rs1.words();
				String[] pos = RiTa.getPosTags(rs1words);
				 for (int i = 0; i < rs1words.length; i++) {
//					    if (RiTa.isVerb(rs1words[i])) {
//					      fsentence1 += rl.randomWord(pos[i].toString());
//					    }
					    if (RiTa.isNoun(pos[i])) {
					    		String similarWords =  rl.randomWord(pos[i]);
					    		//fsentence1 += similarWords[(int) Math.floor(Math.random()*similarWords.length)];
//					    }
//					     if (RiTa.isVerb(rs1words[i])) {
//					    	String[] rhymes = rl.alliterations(rs1words[i]);
//					    		fsentence1 +=  rhymes[0];
//					    }
//					    else {
//					    		fsentence1 += rs1words[i];
					    }  fsentence1 += " ";    
				 } 
			} //ends if statement			
		String sentence2 = rm.generateSentence();
		String sentence3 = rm.generateSentence();
		String sentence4 = rm.generateSentence();
		String sentence5 = rm.generateSentence();
		String sentence6 = rm.generateSentence();
		String sentence7 = rm.generateSentence();
		
		String ftitle = "";
		if (!(input == null)) {
			RiString rstitle = new RiString(input);
			String[] inputwords = rstitle.words();
			for (int i = 0; i < inputwords.length; i++) {
				if (RiTa.isAdjective(inputwords[i])) {
					String[] similarTitles = rl.alliterations(inputwords[i]);
			
					 ftitle += similarTitles[(int) Math.floor(Math.random()*similarTitles.length)];
				}
				 else {
					ftitle += inputwords[i];
				} ftitle += " " ;
			}
		}
			
		
			
		
		
		String poem = (sentence1 + 
				System.lineSeparator() + input + System.lineSeparator() + 
				ftitle + "." + System.lineSeparator() + sentence2 + 
				System.lineSeparator() + sentence3 +  System.lineSeparator() + 
				fsentence1 + System.lineSeparator() + sentence4 +  System.lineSeparator() + 
				sentence5 + System.lineSeparator() + sentence6 );
		
//		Input newInput = new Input(poem);
//		System.out.println(newInput.toString());
		 return poem;
		}
		}
	
	
	

