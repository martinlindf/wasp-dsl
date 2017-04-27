package se.jam.turtlebot.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import se.jam.turtlebot.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TurtleBot'", "'{'", "'waypoint types'", "'='", "'}'", "'waypoints'", "'bot starts at'", "'area'", "','", "'missions'", "'('", "'max x'", "'max y'", "')'", "'x'", "'y'", "'&'", "'-'", "'line'", "'shortest path'", "'return to start'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleTurtleBot"
    // InternalMyDsl.g:53:1: entryRuleTurtleBot : ruleTurtleBot EOF ;
    public final void entryRuleTurtleBot() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleTurtleBot EOF )
            // InternalMyDsl.g:55:1: ruleTurtleBot EOF
            {
             before(grammarAccess.getTurtleBotRule()); 
            pushFollow(FOLLOW_1);
            ruleTurtleBot();

            state._fsp--;

             after(grammarAccess.getTurtleBotRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTurtleBot"


    // $ANTLR start "ruleTurtleBot"
    // InternalMyDsl.g:62:1: ruleTurtleBot : ( ( rule__TurtleBot__Group__0 ) ) ;
    public final void ruleTurtleBot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__TurtleBot__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__TurtleBot__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__TurtleBot__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__TurtleBot__Group__0 )
            {
             before(grammarAccess.getTurtleBotAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__TurtleBot__Group__0 )
            // InternalMyDsl.g:69:4: rule__TurtleBot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTurtleBotAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTurtleBot"


    // $ANTLR start "entryRuleTask"
    // InternalMyDsl.g:78:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleTask EOF )
            // InternalMyDsl.g:80:1: ruleTask EOF
            {
             before(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalMyDsl.g:87:1: ruleTask : ( ( rule__Task__Alternatives ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Task__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Task__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Task__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Task__Alternatives )
            {
             before(grammarAccess.getTaskAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Task__Alternatives )
            // InternalMyDsl.g:94:4: rule__Task__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Task__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleEString EOF )
            // InternalMyDsl.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleArea"
    // InternalMyDsl.g:128:1: entryRuleArea : ruleArea EOF ;
    public final void entryRuleArea() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleArea EOF )
            // InternalMyDsl.g:130:1: ruleArea EOF
            {
             before(grammarAccess.getAreaRule()); 
            pushFollow(FOLLOW_1);
            ruleArea();

            state._fsp--;

             after(grammarAccess.getAreaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArea"


    // $ANTLR start "ruleArea"
    // InternalMyDsl.g:137:1: ruleArea : ( ( rule__Area__Group__0 ) ) ;
    public final void ruleArea() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Area__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Area__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Area__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Area__Group__0 )
            {
             before(grammarAccess.getAreaAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Area__Group__0 )
            // InternalMyDsl.g:144:4: rule__Area__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Area__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAreaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArea"


    // $ANTLR start "entryRuleWaypointType"
    // InternalMyDsl.g:153:1: entryRuleWaypointType : ruleWaypointType EOF ;
    public final void entryRuleWaypointType() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleWaypointType EOF )
            // InternalMyDsl.g:155:1: ruleWaypointType EOF
            {
             before(grammarAccess.getWaypointTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleWaypointType();

            state._fsp--;

             after(grammarAccess.getWaypointTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWaypointType"


    // $ANTLR start "ruleWaypointType"
    // InternalMyDsl.g:162:1: ruleWaypointType : ( ( rule__WaypointType__Group__0 ) ) ;
    public final void ruleWaypointType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__WaypointType__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__WaypointType__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__WaypointType__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__WaypointType__Group__0 )
            {
             before(grammarAccess.getWaypointTypeAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__WaypointType__Group__0 )
            // InternalMyDsl.g:169:4: rule__WaypointType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WaypointType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWaypointTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWaypointType"


    // $ANTLR start "entryRuleWayPoint"
    // InternalMyDsl.g:178:1: entryRuleWayPoint : ruleWayPoint EOF ;
    public final void entryRuleWayPoint() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleWayPoint EOF )
            // InternalMyDsl.g:180:1: ruleWayPoint EOF
            {
             before(grammarAccess.getWayPointRule()); 
            pushFollow(FOLLOW_1);
            ruleWayPoint();

            state._fsp--;

             after(grammarAccess.getWayPointRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWayPoint"


    // $ANTLR start "ruleWayPoint"
    // InternalMyDsl.g:187:1: ruleWayPoint : ( ( rule__WayPoint__Group__0 ) ) ;
    public final void ruleWayPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__WayPoint__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__WayPoint__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__WayPoint__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__WayPoint__Group__0 )
            {
             before(grammarAccess.getWayPointAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__WayPoint__Group__0 )
            // InternalMyDsl.g:194:4: rule__WayPoint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WayPoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWayPointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWayPoint"


    // $ANTLR start "entryRuleMission"
    // InternalMyDsl.g:203:1: entryRuleMission : ruleMission EOF ;
    public final void entryRuleMission() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleMission EOF )
            // InternalMyDsl.g:205:1: ruleMission EOF
            {
             before(grammarAccess.getMissionRule()); 
            pushFollow(FOLLOW_1);
            ruleMission();

            state._fsp--;

             after(grammarAccess.getMissionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMission"


    // $ANTLR start "ruleMission"
    // InternalMyDsl.g:212:1: ruleMission : ( ( rule__Mission__Group__0 ) ) ;
    public final void ruleMission() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Mission__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Mission__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Mission__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Mission__Group__0 )
            {
             before(grammarAccess.getMissionAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Mission__Group__0 )
            // InternalMyDsl.g:219:4: rule__Mission__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMission"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:228:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleEInt EOF )
            // InternalMyDsl.g:230:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:237:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__EInt__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__EInt__Group__0 )
            // InternalMyDsl.g:244:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleLineTask"
    // InternalMyDsl.g:253:1: entryRuleLineTask : ruleLineTask EOF ;
    public final void entryRuleLineTask() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleLineTask EOF )
            // InternalMyDsl.g:255:1: ruleLineTask EOF
            {
             before(grammarAccess.getLineTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleLineTask();

            state._fsp--;

             after(grammarAccess.getLineTaskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLineTask"


    // $ANTLR start "ruleLineTask"
    // InternalMyDsl.g:262:1: ruleLineTask : ( ( rule__LineTask__Group__0 ) ) ;
    public final void ruleLineTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__LineTask__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__LineTask__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__LineTask__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__LineTask__Group__0 )
            {
             before(grammarAccess.getLineTaskAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__LineTask__Group__0 )
            // InternalMyDsl.g:269:4: rule__LineTask__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LineTask__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLineTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLineTask"


    // $ANTLR start "entryRuleShortestPathTask"
    // InternalMyDsl.g:278:1: entryRuleShortestPathTask : ruleShortestPathTask EOF ;
    public final void entryRuleShortestPathTask() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleShortestPathTask EOF )
            // InternalMyDsl.g:280:1: ruleShortestPathTask EOF
            {
             before(grammarAccess.getShortestPathTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleShortestPathTask();

            state._fsp--;

             after(grammarAccess.getShortestPathTaskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleShortestPathTask"


    // $ANTLR start "ruleShortestPathTask"
    // InternalMyDsl.g:287:1: ruleShortestPathTask : ( ( rule__ShortestPathTask__Group__0 ) ) ;
    public final void ruleShortestPathTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__ShortestPathTask__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__ShortestPathTask__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__ShortestPathTask__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__ShortestPathTask__Group__0 )
            {
             before(grammarAccess.getShortestPathTaskAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__ShortestPathTask__Group__0 )
            // InternalMyDsl.g:294:4: rule__ShortestPathTask__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ShortestPathTask__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShortestPathTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShortestPathTask"


    // $ANTLR start "entryRuleReturnToStartTask"
    // InternalMyDsl.g:303:1: entryRuleReturnToStartTask : ruleReturnToStartTask EOF ;
    public final void entryRuleReturnToStartTask() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleReturnToStartTask EOF )
            // InternalMyDsl.g:305:1: ruleReturnToStartTask EOF
            {
             before(grammarAccess.getReturnToStartTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleReturnToStartTask();

            state._fsp--;

             after(grammarAccess.getReturnToStartTaskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReturnToStartTask"


    // $ANTLR start "ruleReturnToStartTask"
    // InternalMyDsl.g:312:1: ruleReturnToStartTask : ( ( rule__ReturnToStartTask__Group__0 ) ) ;
    public final void ruleReturnToStartTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__ReturnToStartTask__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__ReturnToStartTask__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__ReturnToStartTask__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__ReturnToStartTask__Group__0 )
            {
             before(grammarAccess.getReturnToStartTaskAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__ReturnToStartTask__Group__0 )
            // InternalMyDsl.g:319:4: rule__ReturnToStartTask__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReturnToStartTask__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReturnToStartTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReturnToStartTask"


    // $ANTLR start "rule__Task__Alternatives"
    // InternalMyDsl.g:327:1: rule__Task__Alternatives : ( ( ruleLineTask ) | ( ruleShortestPathTask ) | ( ruleReturnToStartTask ) );
    public final void rule__Task__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:331:1: ( ( ruleLineTask ) | ( ruleShortestPathTask ) | ( ruleReturnToStartTask ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt1=1;
                }
                break;
            case 30:
                {
                alt1=2;
                }
                break;
            case 31:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:332:2: ( ruleLineTask )
                    {
                    // InternalMyDsl.g:332:2: ( ruleLineTask )
                    // InternalMyDsl.g:333:3: ruleLineTask
                    {
                     before(grammarAccess.getTaskAccess().getLineTaskParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLineTask();

                    state._fsp--;

                     after(grammarAccess.getTaskAccess().getLineTaskParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:338:2: ( ruleShortestPathTask )
                    {
                    // InternalMyDsl.g:338:2: ( ruleShortestPathTask )
                    // InternalMyDsl.g:339:3: ruleShortestPathTask
                    {
                     before(grammarAccess.getTaskAccess().getShortestPathTaskParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleShortestPathTask();

                    state._fsp--;

                     after(grammarAccess.getTaskAccess().getShortestPathTaskParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:344:2: ( ruleReturnToStartTask )
                    {
                    // InternalMyDsl.g:344:2: ( ruleReturnToStartTask )
                    // InternalMyDsl.g:345:3: ruleReturnToStartTask
                    {
                     before(grammarAccess.getTaskAccess().getReturnToStartTaskParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleReturnToStartTask();

                    state._fsp--;

                     after(grammarAccess.getTaskAccess().getReturnToStartTaskParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:354:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:358:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:359:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:359:2: ( RULE_STRING )
                    // InternalMyDsl.g:360:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:365:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:365:2: ( RULE_ID )
                    // InternalMyDsl.g:366:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__TurtleBot__Group__0"
    // InternalMyDsl.g:375:1: rule__TurtleBot__Group__0 : rule__TurtleBot__Group__0__Impl rule__TurtleBot__Group__1 ;
    public final void rule__TurtleBot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:379:1: ( rule__TurtleBot__Group__0__Impl rule__TurtleBot__Group__1 )
            // InternalMyDsl.g:380:2: rule__TurtleBot__Group__0__Impl rule__TurtleBot__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TurtleBot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__0"


    // $ANTLR start "rule__TurtleBot__Group__0__Impl"
    // InternalMyDsl.g:387:1: rule__TurtleBot__Group__0__Impl : ( 'TurtleBot' ) ;
    public final void rule__TurtleBot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:1: ( ( 'TurtleBot' ) )
            // InternalMyDsl.g:392:1: ( 'TurtleBot' )
            {
            // InternalMyDsl.g:392:1: ( 'TurtleBot' )
            // InternalMyDsl.g:393:2: 'TurtleBot'
            {
             before(grammarAccess.getTurtleBotAccess().getTurtleBotKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getTurtleBotKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__0__Impl"


    // $ANTLR start "rule__TurtleBot__Group__1"
    // InternalMyDsl.g:402:1: rule__TurtleBot__Group__1 : rule__TurtleBot__Group__1__Impl rule__TurtleBot__Group__2 ;
    public final void rule__TurtleBot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:406:1: ( rule__TurtleBot__Group__1__Impl rule__TurtleBot__Group__2 )
            // InternalMyDsl.g:407:2: rule__TurtleBot__Group__1__Impl rule__TurtleBot__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TurtleBot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__1"


    // $ANTLR start "rule__TurtleBot__Group__1__Impl"
    // InternalMyDsl.g:414:1: rule__TurtleBot__Group__1__Impl : ( ( rule__TurtleBot__NameAssignment_1 ) ) ;
    public final void rule__TurtleBot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:418:1: ( ( ( rule__TurtleBot__NameAssignment_1 ) ) )
            // InternalMyDsl.g:419:1: ( ( rule__TurtleBot__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:419:1: ( ( rule__TurtleBot__NameAssignment_1 ) )
            // InternalMyDsl.g:420:2: ( rule__TurtleBot__NameAssignment_1 )
            {
             before(grammarAccess.getTurtleBotAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:421:2: ( rule__TurtleBot__NameAssignment_1 )
            // InternalMyDsl.g:421:3: rule__TurtleBot__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TurtleBot__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTurtleBotAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__1__Impl"


    // $ANTLR start "rule__TurtleBot__Group__2"
    // InternalMyDsl.g:429:1: rule__TurtleBot__Group__2 : rule__TurtleBot__Group__2__Impl rule__TurtleBot__Group__3 ;
    public final void rule__TurtleBot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:433:1: ( rule__TurtleBot__Group__2__Impl rule__TurtleBot__Group__3 )
            // InternalMyDsl.g:434:2: rule__TurtleBot__Group__2__Impl rule__TurtleBot__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__TurtleBot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__2"


    // $ANTLR start "rule__TurtleBot__Group__2__Impl"
    // InternalMyDsl.g:441:1: rule__TurtleBot__Group__2__Impl : ( '{' ) ;
    public final void rule__TurtleBot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:445:1: ( ( '{' ) )
            // InternalMyDsl.g:446:1: ( '{' )
            {
            // InternalMyDsl.g:446:1: ( '{' )
            // InternalMyDsl.g:447:2: '{'
            {
             before(grammarAccess.getTurtleBotAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__2__Impl"


    // $ANTLR start "rule__TurtleBot__Group__3"
    // InternalMyDsl.g:456:1: rule__TurtleBot__Group__3 : rule__TurtleBot__Group__3__Impl rule__TurtleBot__Group__4 ;
    public final void rule__TurtleBot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:460:1: ( rule__TurtleBot__Group__3__Impl rule__TurtleBot__Group__4 )
            // InternalMyDsl.g:461:2: rule__TurtleBot__Group__3__Impl rule__TurtleBot__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__TurtleBot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__3"


    // $ANTLR start "rule__TurtleBot__Group__3__Impl"
    // InternalMyDsl.g:468:1: rule__TurtleBot__Group__3__Impl : ( ( rule__TurtleBot__Group_3__0 )? ) ;
    public final void rule__TurtleBot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:472:1: ( ( ( rule__TurtleBot__Group_3__0 )? ) )
            // InternalMyDsl.g:473:1: ( ( rule__TurtleBot__Group_3__0 )? )
            {
            // InternalMyDsl.g:473:1: ( ( rule__TurtleBot__Group_3__0 )? )
            // InternalMyDsl.g:474:2: ( rule__TurtleBot__Group_3__0 )?
            {
             before(grammarAccess.getTurtleBotAccess().getGroup_3()); 
            // InternalMyDsl.g:475:2: ( rule__TurtleBot__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:475:3: rule__TurtleBot__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TurtleBot__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTurtleBotAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__3__Impl"


    // $ANTLR start "rule__TurtleBot__Group__4"
    // InternalMyDsl.g:483:1: rule__TurtleBot__Group__4 : rule__TurtleBot__Group__4__Impl rule__TurtleBot__Group__5 ;
    public final void rule__TurtleBot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:487:1: ( rule__TurtleBot__Group__4__Impl rule__TurtleBot__Group__5 )
            // InternalMyDsl.g:488:2: rule__TurtleBot__Group__4__Impl rule__TurtleBot__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__TurtleBot__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__4"


    // $ANTLR start "rule__TurtleBot__Group__4__Impl"
    // InternalMyDsl.g:495:1: rule__TurtleBot__Group__4__Impl : ( 'waypoint types' ) ;
    public final void rule__TurtleBot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:499:1: ( ( 'waypoint types' ) )
            // InternalMyDsl.g:500:1: ( 'waypoint types' )
            {
            // InternalMyDsl.g:500:1: ( 'waypoint types' )
            // InternalMyDsl.g:501:2: 'waypoint types'
            {
             before(grammarAccess.getTurtleBotAccess().getWaypointTypesKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getWaypointTypesKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__4__Impl"


    // $ANTLR start "rule__TurtleBot__Group__5"
    // InternalMyDsl.g:510:1: rule__TurtleBot__Group__5 : rule__TurtleBot__Group__5__Impl rule__TurtleBot__Group__6 ;
    public final void rule__TurtleBot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:514:1: ( rule__TurtleBot__Group__5__Impl rule__TurtleBot__Group__6 )
            // InternalMyDsl.g:515:2: rule__TurtleBot__Group__5__Impl rule__TurtleBot__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__TurtleBot__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__5"


    // $ANTLR start "rule__TurtleBot__Group__5__Impl"
    // InternalMyDsl.g:522:1: rule__TurtleBot__Group__5__Impl : ( '=' ) ;
    public final void rule__TurtleBot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:526:1: ( ( '=' ) )
            // InternalMyDsl.g:527:1: ( '=' )
            {
            // InternalMyDsl.g:527:1: ( '=' )
            // InternalMyDsl.g:528:2: '='
            {
             before(grammarAccess.getTurtleBotAccess().getEqualsSignKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getEqualsSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__5__Impl"


    // $ANTLR start "rule__TurtleBot__Group__6"
    // InternalMyDsl.g:537:1: rule__TurtleBot__Group__6 : rule__TurtleBot__Group__6__Impl rule__TurtleBot__Group__7 ;
    public final void rule__TurtleBot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:1: ( rule__TurtleBot__Group__6__Impl rule__TurtleBot__Group__7 )
            // InternalMyDsl.g:542:2: rule__TurtleBot__Group__6__Impl rule__TurtleBot__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__TurtleBot__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__6"


    // $ANTLR start "rule__TurtleBot__Group__6__Impl"
    // InternalMyDsl.g:549:1: rule__TurtleBot__Group__6__Impl : ( '{' ) ;
    public final void rule__TurtleBot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:553:1: ( ( '{' ) )
            // InternalMyDsl.g:554:1: ( '{' )
            {
            // InternalMyDsl.g:554:1: ( '{' )
            // InternalMyDsl.g:555:2: '{'
            {
             before(grammarAccess.getTurtleBotAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__6__Impl"


    // $ANTLR start "rule__TurtleBot__Group__7"
    // InternalMyDsl.g:564:1: rule__TurtleBot__Group__7 : rule__TurtleBot__Group__7__Impl rule__TurtleBot__Group__8 ;
    public final void rule__TurtleBot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:568:1: ( rule__TurtleBot__Group__7__Impl rule__TurtleBot__Group__8 )
            // InternalMyDsl.g:569:2: rule__TurtleBot__Group__7__Impl rule__TurtleBot__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__TurtleBot__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__7"


    // $ANTLR start "rule__TurtleBot__Group__7__Impl"
    // InternalMyDsl.g:576:1: rule__TurtleBot__Group__7__Impl : ( ( rule__TurtleBot__WaypointtypesAssignment_7 ) ) ;
    public final void rule__TurtleBot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:580:1: ( ( ( rule__TurtleBot__WaypointtypesAssignment_7 ) ) )
            // InternalMyDsl.g:581:1: ( ( rule__TurtleBot__WaypointtypesAssignment_7 ) )
            {
            // InternalMyDsl.g:581:1: ( ( rule__TurtleBot__WaypointtypesAssignment_7 ) )
            // InternalMyDsl.g:582:2: ( rule__TurtleBot__WaypointtypesAssignment_7 )
            {
             before(grammarAccess.getTurtleBotAccess().getWaypointtypesAssignment_7()); 
            // InternalMyDsl.g:583:2: ( rule__TurtleBot__WaypointtypesAssignment_7 )
            // InternalMyDsl.g:583:3: rule__TurtleBot__WaypointtypesAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__TurtleBot__WaypointtypesAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTurtleBotAccess().getWaypointtypesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__7__Impl"


    // $ANTLR start "rule__TurtleBot__Group__8"
    // InternalMyDsl.g:591:1: rule__TurtleBot__Group__8 : rule__TurtleBot__Group__8__Impl rule__TurtleBot__Group__9 ;
    public final void rule__TurtleBot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:595:1: ( rule__TurtleBot__Group__8__Impl rule__TurtleBot__Group__9 )
            // InternalMyDsl.g:596:2: rule__TurtleBot__Group__8__Impl rule__TurtleBot__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__TurtleBot__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__8"


    // $ANTLR start "rule__TurtleBot__Group__8__Impl"
    // InternalMyDsl.g:603:1: rule__TurtleBot__Group__8__Impl : ( ( rule__TurtleBot__Group_8__0 )* ) ;
    public final void rule__TurtleBot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:607:1: ( ( ( rule__TurtleBot__Group_8__0 )* ) )
            // InternalMyDsl.g:608:1: ( ( rule__TurtleBot__Group_8__0 )* )
            {
            // InternalMyDsl.g:608:1: ( ( rule__TurtleBot__Group_8__0 )* )
            // InternalMyDsl.g:609:2: ( rule__TurtleBot__Group_8__0 )*
            {
             before(grammarAccess.getTurtleBotAccess().getGroup_8()); 
            // InternalMyDsl.g:610:2: ( rule__TurtleBot__Group_8__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:610:3: rule__TurtleBot__Group_8__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TurtleBot__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getTurtleBotAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__8__Impl"


    // $ANTLR start "rule__TurtleBot__Group__9"
    // InternalMyDsl.g:618:1: rule__TurtleBot__Group__9 : rule__TurtleBot__Group__9__Impl rule__TurtleBot__Group__10 ;
    public final void rule__TurtleBot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:622:1: ( rule__TurtleBot__Group__9__Impl rule__TurtleBot__Group__10 )
            // InternalMyDsl.g:623:2: rule__TurtleBot__Group__9__Impl rule__TurtleBot__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__TurtleBot__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__9"


    // $ANTLR start "rule__TurtleBot__Group__9__Impl"
    // InternalMyDsl.g:630:1: rule__TurtleBot__Group__9__Impl : ( '}' ) ;
    public final void rule__TurtleBot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:634:1: ( ( '}' ) )
            // InternalMyDsl.g:635:1: ( '}' )
            {
            // InternalMyDsl.g:635:1: ( '}' )
            // InternalMyDsl.g:636:2: '}'
            {
             before(grammarAccess.getTurtleBotAccess().getRightCurlyBracketKeyword_9()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__9__Impl"


    // $ANTLR start "rule__TurtleBot__Group__10"
    // InternalMyDsl.g:645:1: rule__TurtleBot__Group__10 : rule__TurtleBot__Group__10__Impl rule__TurtleBot__Group__11 ;
    public final void rule__TurtleBot__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:649:1: ( rule__TurtleBot__Group__10__Impl rule__TurtleBot__Group__11 )
            // InternalMyDsl.g:650:2: rule__TurtleBot__Group__10__Impl rule__TurtleBot__Group__11
            {
            pushFollow(FOLLOW_6);
            rule__TurtleBot__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__10"


    // $ANTLR start "rule__TurtleBot__Group__10__Impl"
    // InternalMyDsl.g:657:1: rule__TurtleBot__Group__10__Impl : ( 'waypoints' ) ;
    public final void rule__TurtleBot__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:661:1: ( ( 'waypoints' ) )
            // InternalMyDsl.g:662:1: ( 'waypoints' )
            {
            // InternalMyDsl.g:662:1: ( 'waypoints' )
            // InternalMyDsl.g:663:2: 'waypoints'
            {
             before(grammarAccess.getTurtleBotAccess().getWaypointsKeyword_10()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getWaypointsKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__10__Impl"


    // $ANTLR start "rule__TurtleBot__Group__11"
    // InternalMyDsl.g:672:1: rule__TurtleBot__Group__11 : rule__TurtleBot__Group__11__Impl rule__TurtleBot__Group__12 ;
    public final void rule__TurtleBot__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:676:1: ( rule__TurtleBot__Group__11__Impl rule__TurtleBot__Group__12 )
            // InternalMyDsl.g:677:2: rule__TurtleBot__Group__11__Impl rule__TurtleBot__Group__12
            {
            pushFollow(FOLLOW_4);
            rule__TurtleBot__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__11"


    // $ANTLR start "rule__TurtleBot__Group__11__Impl"
    // InternalMyDsl.g:684:1: rule__TurtleBot__Group__11__Impl : ( '=' ) ;
    public final void rule__TurtleBot__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:688:1: ( ( '=' ) )
            // InternalMyDsl.g:689:1: ( '=' )
            {
            // InternalMyDsl.g:689:1: ( '=' )
            // InternalMyDsl.g:690:2: '='
            {
             before(grammarAccess.getTurtleBotAccess().getEqualsSignKeyword_11()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getEqualsSignKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__11__Impl"


    // $ANTLR start "rule__TurtleBot__Group__12"
    // InternalMyDsl.g:699:1: rule__TurtleBot__Group__12 : rule__TurtleBot__Group__12__Impl rule__TurtleBot__Group__13 ;
    public final void rule__TurtleBot__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:703:1: ( rule__TurtleBot__Group__12__Impl rule__TurtleBot__Group__13 )
            // InternalMyDsl.g:704:2: rule__TurtleBot__Group__12__Impl rule__TurtleBot__Group__13
            {
            pushFollow(FOLLOW_3);
            rule__TurtleBot__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__12"


    // $ANTLR start "rule__TurtleBot__Group__12__Impl"
    // InternalMyDsl.g:711:1: rule__TurtleBot__Group__12__Impl : ( '{' ) ;
    public final void rule__TurtleBot__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:715:1: ( ( '{' ) )
            // InternalMyDsl.g:716:1: ( '{' )
            {
            // InternalMyDsl.g:716:1: ( '{' )
            // InternalMyDsl.g:717:2: '{'
            {
             before(grammarAccess.getTurtleBotAccess().getLeftCurlyBracketKeyword_12()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getLeftCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__12__Impl"


    // $ANTLR start "rule__TurtleBot__Group__13"
    // InternalMyDsl.g:726:1: rule__TurtleBot__Group__13 : rule__TurtleBot__Group__13__Impl rule__TurtleBot__Group__14 ;
    public final void rule__TurtleBot__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:730:1: ( rule__TurtleBot__Group__13__Impl rule__TurtleBot__Group__14 )
            // InternalMyDsl.g:731:2: rule__TurtleBot__Group__13__Impl rule__TurtleBot__Group__14
            {
            pushFollow(FOLLOW_7);
            rule__TurtleBot__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__13"


    // $ANTLR start "rule__TurtleBot__Group__13__Impl"
    // InternalMyDsl.g:738:1: rule__TurtleBot__Group__13__Impl : ( ( rule__TurtleBot__WaypointsAssignment_13 ) ) ;
    public final void rule__TurtleBot__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:742:1: ( ( ( rule__TurtleBot__WaypointsAssignment_13 ) ) )
            // InternalMyDsl.g:743:1: ( ( rule__TurtleBot__WaypointsAssignment_13 ) )
            {
            // InternalMyDsl.g:743:1: ( ( rule__TurtleBot__WaypointsAssignment_13 ) )
            // InternalMyDsl.g:744:2: ( rule__TurtleBot__WaypointsAssignment_13 )
            {
             before(grammarAccess.getTurtleBotAccess().getWaypointsAssignment_13()); 
            // InternalMyDsl.g:745:2: ( rule__TurtleBot__WaypointsAssignment_13 )
            // InternalMyDsl.g:745:3: rule__TurtleBot__WaypointsAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__TurtleBot__WaypointsAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getTurtleBotAccess().getWaypointsAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__13__Impl"


    // $ANTLR start "rule__TurtleBot__Group__14"
    // InternalMyDsl.g:753:1: rule__TurtleBot__Group__14 : rule__TurtleBot__Group__14__Impl rule__TurtleBot__Group__15 ;
    public final void rule__TurtleBot__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:757:1: ( rule__TurtleBot__Group__14__Impl rule__TurtleBot__Group__15 )
            // InternalMyDsl.g:758:2: rule__TurtleBot__Group__14__Impl rule__TurtleBot__Group__15
            {
            pushFollow(FOLLOW_7);
            rule__TurtleBot__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__14"


    // $ANTLR start "rule__TurtleBot__Group__14__Impl"
    // InternalMyDsl.g:765:1: rule__TurtleBot__Group__14__Impl : ( ( rule__TurtleBot__Group_14__0 )* ) ;
    public final void rule__TurtleBot__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:769:1: ( ( ( rule__TurtleBot__Group_14__0 )* ) )
            // InternalMyDsl.g:770:1: ( ( rule__TurtleBot__Group_14__0 )* )
            {
            // InternalMyDsl.g:770:1: ( ( rule__TurtleBot__Group_14__0 )* )
            // InternalMyDsl.g:771:2: ( rule__TurtleBot__Group_14__0 )*
            {
             before(grammarAccess.getTurtleBotAccess().getGroup_14()); 
            // InternalMyDsl.g:772:2: ( rule__TurtleBot__Group_14__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:772:3: rule__TurtleBot__Group_14__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TurtleBot__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getTurtleBotAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__14__Impl"


    // $ANTLR start "rule__TurtleBot__Group__15"
    // InternalMyDsl.g:780:1: rule__TurtleBot__Group__15 : rule__TurtleBot__Group__15__Impl rule__TurtleBot__Group__16 ;
    public final void rule__TurtleBot__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:784:1: ( rule__TurtleBot__Group__15__Impl rule__TurtleBot__Group__16 )
            // InternalMyDsl.g:785:2: rule__TurtleBot__Group__15__Impl rule__TurtleBot__Group__16
            {
            pushFollow(FOLLOW_10);
            rule__TurtleBot__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__15"


    // $ANTLR start "rule__TurtleBot__Group__15__Impl"
    // InternalMyDsl.g:792:1: rule__TurtleBot__Group__15__Impl : ( '}' ) ;
    public final void rule__TurtleBot__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:796:1: ( ( '}' ) )
            // InternalMyDsl.g:797:1: ( '}' )
            {
            // InternalMyDsl.g:797:1: ( '}' )
            // InternalMyDsl.g:798:2: '}'
            {
             before(grammarAccess.getTurtleBotAccess().getRightCurlyBracketKeyword_15()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__15__Impl"


    // $ANTLR start "rule__TurtleBot__Group__16"
    // InternalMyDsl.g:807:1: rule__TurtleBot__Group__16 : rule__TurtleBot__Group__16__Impl rule__TurtleBot__Group__17 ;
    public final void rule__TurtleBot__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:811:1: ( rule__TurtleBot__Group__16__Impl rule__TurtleBot__Group__17 )
            // InternalMyDsl.g:812:2: rule__TurtleBot__Group__16__Impl rule__TurtleBot__Group__17
            {
            pushFollow(FOLLOW_6);
            rule__TurtleBot__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__16"


    // $ANTLR start "rule__TurtleBot__Group__16__Impl"
    // InternalMyDsl.g:819:1: rule__TurtleBot__Group__16__Impl : ( 'bot starts at' ) ;
    public final void rule__TurtleBot__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:823:1: ( ( 'bot starts at' ) )
            // InternalMyDsl.g:824:1: ( 'bot starts at' )
            {
            // InternalMyDsl.g:824:1: ( 'bot starts at' )
            // InternalMyDsl.g:825:2: 'bot starts at'
            {
             before(grammarAccess.getTurtleBotAccess().getBotStartsAtKeyword_16()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getBotStartsAtKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__16__Impl"


    // $ANTLR start "rule__TurtleBot__Group__17"
    // InternalMyDsl.g:834:1: rule__TurtleBot__Group__17 : rule__TurtleBot__Group__17__Impl rule__TurtleBot__Group__18 ;
    public final void rule__TurtleBot__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:838:1: ( rule__TurtleBot__Group__17__Impl rule__TurtleBot__Group__18 )
            // InternalMyDsl.g:839:2: rule__TurtleBot__Group__17__Impl rule__TurtleBot__Group__18
            {
            pushFollow(FOLLOW_3);
            rule__TurtleBot__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__17"


    // $ANTLR start "rule__TurtleBot__Group__17__Impl"
    // InternalMyDsl.g:846:1: rule__TurtleBot__Group__17__Impl : ( '=' ) ;
    public final void rule__TurtleBot__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:850:1: ( ( '=' ) )
            // InternalMyDsl.g:851:1: ( '=' )
            {
            // InternalMyDsl.g:851:1: ( '=' )
            // InternalMyDsl.g:852:2: '='
            {
             before(grammarAccess.getTurtleBotAccess().getEqualsSignKeyword_17()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getEqualsSignKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__17__Impl"


    // $ANTLR start "rule__TurtleBot__Group__18"
    // InternalMyDsl.g:861:1: rule__TurtleBot__Group__18 : rule__TurtleBot__Group__18__Impl rule__TurtleBot__Group__19 ;
    public final void rule__TurtleBot__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:865:1: ( rule__TurtleBot__Group__18__Impl rule__TurtleBot__Group__19 )
            // InternalMyDsl.g:866:2: rule__TurtleBot__Group__18__Impl rule__TurtleBot__Group__19
            {
            pushFollow(FOLLOW_11);
            rule__TurtleBot__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__18"


    // $ANTLR start "rule__TurtleBot__Group__18__Impl"
    // InternalMyDsl.g:873:1: rule__TurtleBot__Group__18__Impl : ( ( rule__TurtleBot__Bot_startAssignment_18 ) ) ;
    public final void rule__TurtleBot__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:877:1: ( ( ( rule__TurtleBot__Bot_startAssignment_18 ) ) )
            // InternalMyDsl.g:878:1: ( ( rule__TurtleBot__Bot_startAssignment_18 ) )
            {
            // InternalMyDsl.g:878:1: ( ( rule__TurtleBot__Bot_startAssignment_18 ) )
            // InternalMyDsl.g:879:2: ( rule__TurtleBot__Bot_startAssignment_18 )
            {
             before(grammarAccess.getTurtleBotAccess().getBot_startAssignment_18()); 
            // InternalMyDsl.g:880:2: ( rule__TurtleBot__Bot_startAssignment_18 )
            // InternalMyDsl.g:880:3: rule__TurtleBot__Bot_startAssignment_18
            {
            pushFollow(FOLLOW_2);
            rule__TurtleBot__Bot_startAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getTurtleBotAccess().getBot_startAssignment_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__18__Impl"


    // $ANTLR start "rule__TurtleBot__Group__19"
    // InternalMyDsl.g:888:1: rule__TurtleBot__Group__19 : rule__TurtleBot__Group__19__Impl rule__TurtleBot__Group__20 ;
    public final void rule__TurtleBot__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:892:1: ( rule__TurtleBot__Group__19__Impl rule__TurtleBot__Group__20 )
            // InternalMyDsl.g:893:2: rule__TurtleBot__Group__19__Impl rule__TurtleBot__Group__20
            {
            pushFollow(FOLLOW_11);
            rule__TurtleBot__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__19"


    // $ANTLR start "rule__TurtleBot__Group__19__Impl"
    // InternalMyDsl.g:900:1: rule__TurtleBot__Group__19__Impl : ( ( rule__TurtleBot__Group_19__0 )? ) ;
    public final void rule__TurtleBot__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:904:1: ( ( ( rule__TurtleBot__Group_19__0 )? ) )
            // InternalMyDsl.g:905:1: ( ( rule__TurtleBot__Group_19__0 )? )
            {
            // InternalMyDsl.g:905:1: ( ( rule__TurtleBot__Group_19__0 )? )
            // InternalMyDsl.g:906:2: ( rule__TurtleBot__Group_19__0 )?
            {
             before(grammarAccess.getTurtleBotAccess().getGroup_19()); 
            // InternalMyDsl.g:907:2: ( rule__TurtleBot__Group_19__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:907:3: rule__TurtleBot__Group_19__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TurtleBot__Group_19__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTurtleBotAccess().getGroup_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__19__Impl"


    // $ANTLR start "rule__TurtleBot__Group__20"
    // InternalMyDsl.g:915:1: rule__TurtleBot__Group__20 : rule__TurtleBot__Group__20__Impl ;
    public final void rule__TurtleBot__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:919:1: ( rule__TurtleBot__Group__20__Impl )
            // InternalMyDsl.g:920:2: rule__TurtleBot__Group__20__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__20__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__20"


    // $ANTLR start "rule__TurtleBot__Group__20__Impl"
    // InternalMyDsl.g:926:1: rule__TurtleBot__Group__20__Impl : ( '}' ) ;
    public final void rule__TurtleBot__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:930:1: ( ( '}' ) )
            // InternalMyDsl.g:931:1: ( '}' )
            {
            // InternalMyDsl.g:931:1: ( '}' )
            // InternalMyDsl.g:932:2: '}'
            {
             before(grammarAccess.getTurtleBotAccess().getRightCurlyBracketKeyword_20()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getRightCurlyBracketKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__20__Impl"


    // $ANTLR start "rule__TurtleBot__Group_3__0"
    // InternalMyDsl.g:942:1: rule__TurtleBot__Group_3__0 : rule__TurtleBot__Group_3__0__Impl rule__TurtleBot__Group_3__1 ;
    public final void rule__TurtleBot__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:946:1: ( rule__TurtleBot__Group_3__0__Impl rule__TurtleBot__Group_3__1 )
            // InternalMyDsl.g:947:2: rule__TurtleBot__Group_3__0__Impl rule__TurtleBot__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__TurtleBot__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_3__0"


    // $ANTLR start "rule__TurtleBot__Group_3__0__Impl"
    // InternalMyDsl.g:954:1: rule__TurtleBot__Group_3__0__Impl : ( 'area' ) ;
    public final void rule__TurtleBot__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:958:1: ( ( 'area' ) )
            // InternalMyDsl.g:959:1: ( 'area' )
            {
            // InternalMyDsl.g:959:1: ( 'area' )
            // InternalMyDsl.g:960:2: 'area'
            {
             before(grammarAccess.getTurtleBotAccess().getAreaKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getAreaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_3__0__Impl"


    // $ANTLR start "rule__TurtleBot__Group_3__1"
    // InternalMyDsl.g:969:1: rule__TurtleBot__Group_3__1 : rule__TurtleBot__Group_3__1__Impl rule__TurtleBot__Group_3__2 ;
    public final void rule__TurtleBot__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:973:1: ( rule__TurtleBot__Group_3__1__Impl rule__TurtleBot__Group_3__2 )
            // InternalMyDsl.g:974:2: rule__TurtleBot__Group_3__1__Impl rule__TurtleBot__Group_3__2
            {
            pushFollow(FOLLOW_12);
            rule__TurtleBot__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_3__1"


    // $ANTLR start "rule__TurtleBot__Group_3__1__Impl"
    // InternalMyDsl.g:981:1: rule__TurtleBot__Group_3__1__Impl : ( '=' ) ;
    public final void rule__TurtleBot__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:985:1: ( ( '=' ) )
            // InternalMyDsl.g:986:1: ( '=' )
            {
            // InternalMyDsl.g:986:1: ( '=' )
            // InternalMyDsl.g:987:2: '='
            {
             before(grammarAccess.getTurtleBotAccess().getEqualsSignKeyword_3_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getEqualsSignKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_3__1__Impl"


    // $ANTLR start "rule__TurtleBot__Group_3__2"
    // InternalMyDsl.g:996:1: rule__TurtleBot__Group_3__2 : rule__TurtleBot__Group_3__2__Impl ;
    public final void rule__TurtleBot__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1000:1: ( rule__TurtleBot__Group_3__2__Impl )
            // InternalMyDsl.g:1001:2: rule__TurtleBot__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_3__2"


    // $ANTLR start "rule__TurtleBot__Group_3__2__Impl"
    // InternalMyDsl.g:1007:1: rule__TurtleBot__Group_3__2__Impl : ( ( rule__TurtleBot__AreaAssignment_3_2 ) ) ;
    public final void rule__TurtleBot__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1011:1: ( ( ( rule__TurtleBot__AreaAssignment_3_2 ) ) )
            // InternalMyDsl.g:1012:1: ( ( rule__TurtleBot__AreaAssignment_3_2 ) )
            {
            // InternalMyDsl.g:1012:1: ( ( rule__TurtleBot__AreaAssignment_3_2 ) )
            // InternalMyDsl.g:1013:2: ( rule__TurtleBot__AreaAssignment_3_2 )
            {
             before(grammarAccess.getTurtleBotAccess().getAreaAssignment_3_2()); 
            // InternalMyDsl.g:1014:2: ( rule__TurtleBot__AreaAssignment_3_2 )
            // InternalMyDsl.g:1014:3: rule__TurtleBot__AreaAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__TurtleBot__AreaAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getTurtleBotAccess().getAreaAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_3__2__Impl"


    // $ANTLR start "rule__TurtleBot__Group_8__0"
    // InternalMyDsl.g:1023:1: rule__TurtleBot__Group_8__0 : rule__TurtleBot__Group_8__0__Impl rule__TurtleBot__Group_8__1 ;
    public final void rule__TurtleBot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1027:1: ( rule__TurtleBot__Group_8__0__Impl rule__TurtleBot__Group_8__1 )
            // InternalMyDsl.g:1028:2: rule__TurtleBot__Group_8__0__Impl rule__TurtleBot__Group_8__1
            {
            pushFollow(FOLLOW_3);
            rule__TurtleBot__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_8__0"


    // $ANTLR start "rule__TurtleBot__Group_8__0__Impl"
    // InternalMyDsl.g:1035:1: rule__TurtleBot__Group_8__0__Impl : ( ',' ) ;
    public final void rule__TurtleBot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1039:1: ( ( ',' ) )
            // InternalMyDsl.g:1040:1: ( ',' )
            {
            // InternalMyDsl.g:1040:1: ( ',' )
            // InternalMyDsl.g:1041:2: ','
            {
             before(grammarAccess.getTurtleBotAccess().getCommaKeyword_8_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_8__0__Impl"


    // $ANTLR start "rule__TurtleBot__Group_8__1"
    // InternalMyDsl.g:1050:1: rule__TurtleBot__Group_8__1 : rule__TurtleBot__Group_8__1__Impl ;
    public final void rule__TurtleBot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1054:1: ( rule__TurtleBot__Group_8__1__Impl )
            // InternalMyDsl.g:1055:2: rule__TurtleBot__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_8__1"


    // $ANTLR start "rule__TurtleBot__Group_8__1__Impl"
    // InternalMyDsl.g:1061:1: rule__TurtleBot__Group_8__1__Impl : ( ( rule__TurtleBot__WaypointtypesAssignment_8_1 ) ) ;
    public final void rule__TurtleBot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1065:1: ( ( ( rule__TurtleBot__WaypointtypesAssignment_8_1 ) ) )
            // InternalMyDsl.g:1066:1: ( ( rule__TurtleBot__WaypointtypesAssignment_8_1 ) )
            {
            // InternalMyDsl.g:1066:1: ( ( rule__TurtleBot__WaypointtypesAssignment_8_1 ) )
            // InternalMyDsl.g:1067:2: ( rule__TurtleBot__WaypointtypesAssignment_8_1 )
            {
             before(grammarAccess.getTurtleBotAccess().getWaypointtypesAssignment_8_1()); 
            // InternalMyDsl.g:1068:2: ( rule__TurtleBot__WaypointtypesAssignment_8_1 )
            // InternalMyDsl.g:1068:3: rule__TurtleBot__WaypointtypesAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__TurtleBot__WaypointtypesAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getTurtleBotAccess().getWaypointtypesAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_8__1__Impl"


    // $ANTLR start "rule__TurtleBot__Group_14__0"
    // InternalMyDsl.g:1077:1: rule__TurtleBot__Group_14__0 : rule__TurtleBot__Group_14__0__Impl rule__TurtleBot__Group_14__1 ;
    public final void rule__TurtleBot__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1081:1: ( rule__TurtleBot__Group_14__0__Impl rule__TurtleBot__Group_14__1 )
            // InternalMyDsl.g:1082:2: rule__TurtleBot__Group_14__0__Impl rule__TurtleBot__Group_14__1
            {
            pushFollow(FOLLOW_3);
            rule__TurtleBot__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_14__0"


    // $ANTLR start "rule__TurtleBot__Group_14__0__Impl"
    // InternalMyDsl.g:1089:1: rule__TurtleBot__Group_14__0__Impl : ( ',' ) ;
    public final void rule__TurtleBot__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1093:1: ( ( ',' ) )
            // InternalMyDsl.g:1094:1: ( ',' )
            {
            // InternalMyDsl.g:1094:1: ( ',' )
            // InternalMyDsl.g:1095:2: ','
            {
             before(grammarAccess.getTurtleBotAccess().getCommaKeyword_14_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getCommaKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_14__0__Impl"


    // $ANTLR start "rule__TurtleBot__Group_14__1"
    // InternalMyDsl.g:1104:1: rule__TurtleBot__Group_14__1 : rule__TurtleBot__Group_14__1__Impl ;
    public final void rule__TurtleBot__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1108:1: ( rule__TurtleBot__Group_14__1__Impl )
            // InternalMyDsl.g:1109:2: rule__TurtleBot__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group_14__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_14__1"


    // $ANTLR start "rule__TurtleBot__Group_14__1__Impl"
    // InternalMyDsl.g:1115:1: rule__TurtleBot__Group_14__1__Impl : ( ( rule__TurtleBot__WaypointsAssignment_14_1 ) ) ;
    public final void rule__TurtleBot__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1119:1: ( ( ( rule__TurtleBot__WaypointsAssignment_14_1 ) ) )
            // InternalMyDsl.g:1120:1: ( ( rule__TurtleBot__WaypointsAssignment_14_1 ) )
            {
            // InternalMyDsl.g:1120:1: ( ( rule__TurtleBot__WaypointsAssignment_14_1 ) )
            // InternalMyDsl.g:1121:2: ( rule__TurtleBot__WaypointsAssignment_14_1 )
            {
             before(grammarAccess.getTurtleBotAccess().getWaypointsAssignment_14_1()); 
            // InternalMyDsl.g:1122:2: ( rule__TurtleBot__WaypointsAssignment_14_1 )
            // InternalMyDsl.g:1122:3: rule__TurtleBot__WaypointsAssignment_14_1
            {
            pushFollow(FOLLOW_2);
            rule__TurtleBot__WaypointsAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getTurtleBotAccess().getWaypointsAssignment_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_14__1__Impl"


    // $ANTLR start "rule__TurtleBot__Group_19__0"
    // InternalMyDsl.g:1131:1: rule__TurtleBot__Group_19__0 : rule__TurtleBot__Group_19__0__Impl rule__TurtleBot__Group_19__1 ;
    public final void rule__TurtleBot__Group_19__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1135:1: ( rule__TurtleBot__Group_19__0__Impl rule__TurtleBot__Group_19__1 )
            // InternalMyDsl.g:1136:2: rule__TurtleBot__Group_19__0__Impl rule__TurtleBot__Group_19__1
            {
            pushFollow(FOLLOW_6);
            rule__TurtleBot__Group_19__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group_19__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_19__0"


    // $ANTLR start "rule__TurtleBot__Group_19__0__Impl"
    // InternalMyDsl.g:1143:1: rule__TurtleBot__Group_19__0__Impl : ( 'missions' ) ;
    public final void rule__TurtleBot__Group_19__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1147:1: ( ( 'missions' ) )
            // InternalMyDsl.g:1148:1: ( 'missions' )
            {
            // InternalMyDsl.g:1148:1: ( 'missions' )
            // InternalMyDsl.g:1149:2: 'missions'
            {
             before(grammarAccess.getTurtleBotAccess().getMissionsKeyword_19_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getMissionsKeyword_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_19__0__Impl"


    // $ANTLR start "rule__TurtleBot__Group_19__1"
    // InternalMyDsl.g:1158:1: rule__TurtleBot__Group_19__1 : rule__TurtleBot__Group_19__1__Impl rule__TurtleBot__Group_19__2 ;
    public final void rule__TurtleBot__Group_19__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1162:1: ( rule__TurtleBot__Group_19__1__Impl rule__TurtleBot__Group_19__2 )
            // InternalMyDsl.g:1163:2: rule__TurtleBot__Group_19__1__Impl rule__TurtleBot__Group_19__2
            {
            pushFollow(FOLLOW_4);
            rule__TurtleBot__Group_19__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group_19__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_19__1"


    // $ANTLR start "rule__TurtleBot__Group_19__1__Impl"
    // InternalMyDsl.g:1170:1: rule__TurtleBot__Group_19__1__Impl : ( '=' ) ;
    public final void rule__TurtleBot__Group_19__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1174:1: ( ( '=' ) )
            // InternalMyDsl.g:1175:1: ( '=' )
            {
            // InternalMyDsl.g:1175:1: ( '=' )
            // InternalMyDsl.g:1176:2: '='
            {
             before(grammarAccess.getTurtleBotAccess().getEqualsSignKeyword_19_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getEqualsSignKeyword_19_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_19__1__Impl"


    // $ANTLR start "rule__TurtleBot__Group_19__2"
    // InternalMyDsl.g:1185:1: rule__TurtleBot__Group_19__2 : rule__TurtleBot__Group_19__2__Impl rule__TurtleBot__Group_19__3 ;
    public final void rule__TurtleBot__Group_19__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1189:1: ( rule__TurtleBot__Group_19__2__Impl rule__TurtleBot__Group_19__3 )
            // InternalMyDsl.g:1190:2: rule__TurtleBot__Group_19__2__Impl rule__TurtleBot__Group_19__3
            {
            pushFollow(FOLLOW_3);
            rule__TurtleBot__Group_19__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group_19__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_19__2"


    // $ANTLR start "rule__TurtleBot__Group_19__2__Impl"
    // InternalMyDsl.g:1197:1: rule__TurtleBot__Group_19__2__Impl : ( '{' ) ;
    public final void rule__TurtleBot__Group_19__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1201:1: ( ( '{' ) )
            // InternalMyDsl.g:1202:1: ( '{' )
            {
            // InternalMyDsl.g:1202:1: ( '{' )
            // InternalMyDsl.g:1203:2: '{'
            {
             before(grammarAccess.getTurtleBotAccess().getLeftCurlyBracketKeyword_19_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getLeftCurlyBracketKeyword_19_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_19__2__Impl"


    // $ANTLR start "rule__TurtleBot__Group_19__3"
    // InternalMyDsl.g:1212:1: rule__TurtleBot__Group_19__3 : rule__TurtleBot__Group_19__3__Impl rule__TurtleBot__Group_19__4 ;
    public final void rule__TurtleBot__Group_19__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1216:1: ( rule__TurtleBot__Group_19__3__Impl rule__TurtleBot__Group_19__4 )
            // InternalMyDsl.g:1217:2: rule__TurtleBot__Group_19__3__Impl rule__TurtleBot__Group_19__4
            {
            pushFollow(FOLLOW_7);
            rule__TurtleBot__Group_19__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group_19__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_19__3"


    // $ANTLR start "rule__TurtleBot__Group_19__3__Impl"
    // InternalMyDsl.g:1224:1: rule__TurtleBot__Group_19__3__Impl : ( ( rule__TurtleBot__MissionsAssignment_19_3 ) ) ;
    public final void rule__TurtleBot__Group_19__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1228:1: ( ( ( rule__TurtleBot__MissionsAssignment_19_3 ) ) )
            // InternalMyDsl.g:1229:1: ( ( rule__TurtleBot__MissionsAssignment_19_3 ) )
            {
            // InternalMyDsl.g:1229:1: ( ( rule__TurtleBot__MissionsAssignment_19_3 ) )
            // InternalMyDsl.g:1230:2: ( rule__TurtleBot__MissionsAssignment_19_3 )
            {
             before(grammarAccess.getTurtleBotAccess().getMissionsAssignment_19_3()); 
            // InternalMyDsl.g:1231:2: ( rule__TurtleBot__MissionsAssignment_19_3 )
            // InternalMyDsl.g:1231:3: rule__TurtleBot__MissionsAssignment_19_3
            {
            pushFollow(FOLLOW_2);
            rule__TurtleBot__MissionsAssignment_19_3();

            state._fsp--;


            }

             after(grammarAccess.getTurtleBotAccess().getMissionsAssignment_19_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_19__3__Impl"


    // $ANTLR start "rule__TurtleBot__Group_19__4"
    // InternalMyDsl.g:1239:1: rule__TurtleBot__Group_19__4 : rule__TurtleBot__Group_19__4__Impl rule__TurtleBot__Group_19__5 ;
    public final void rule__TurtleBot__Group_19__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1243:1: ( rule__TurtleBot__Group_19__4__Impl rule__TurtleBot__Group_19__5 )
            // InternalMyDsl.g:1244:2: rule__TurtleBot__Group_19__4__Impl rule__TurtleBot__Group_19__5
            {
            pushFollow(FOLLOW_7);
            rule__TurtleBot__Group_19__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group_19__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_19__4"


    // $ANTLR start "rule__TurtleBot__Group_19__4__Impl"
    // InternalMyDsl.g:1251:1: rule__TurtleBot__Group_19__4__Impl : ( ( rule__TurtleBot__Group_19_4__0 )* ) ;
    public final void rule__TurtleBot__Group_19__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1255:1: ( ( ( rule__TurtleBot__Group_19_4__0 )* ) )
            // InternalMyDsl.g:1256:1: ( ( rule__TurtleBot__Group_19_4__0 )* )
            {
            // InternalMyDsl.g:1256:1: ( ( rule__TurtleBot__Group_19_4__0 )* )
            // InternalMyDsl.g:1257:2: ( rule__TurtleBot__Group_19_4__0 )*
            {
             before(grammarAccess.getTurtleBotAccess().getGroup_19_4()); 
            // InternalMyDsl.g:1258:2: ( rule__TurtleBot__Group_19_4__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:1258:3: rule__TurtleBot__Group_19_4__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TurtleBot__Group_19_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getTurtleBotAccess().getGroup_19_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_19__4__Impl"


    // $ANTLR start "rule__TurtleBot__Group_19__5"
    // InternalMyDsl.g:1266:1: rule__TurtleBot__Group_19__5 : rule__TurtleBot__Group_19__5__Impl ;
    public final void rule__TurtleBot__Group_19__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1270:1: ( rule__TurtleBot__Group_19__5__Impl )
            // InternalMyDsl.g:1271:2: rule__TurtleBot__Group_19__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group_19__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_19__5"


    // $ANTLR start "rule__TurtleBot__Group_19__5__Impl"
    // InternalMyDsl.g:1277:1: rule__TurtleBot__Group_19__5__Impl : ( '}' ) ;
    public final void rule__TurtleBot__Group_19__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1281:1: ( ( '}' ) )
            // InternalMyDsl.g:1282:1: ( '}' )
            {
            // InternalMyDsl.g:1282:1: ( '}' )
            // InternalMyDsl.g:1283:2: '}'
            {
             before(grammarAccess.getTurtleBotAccess().getRightCurlyBracketKeyword_19_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getRightCurlyBracketKeyword_19_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_19__5__Impl"


    // $ANTLR start "rule__TurtleBot__Group_19_4__0"
    // InternalMyDsl.g:1293:1: rule__TurtleBot__Group_19_4__0 : rule__TurtleBot__Group_19_4__0__Impl rule__TurtleBot__Group_19_4__1 ;
    public final void rule__TurtleBot__Group_19_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1297:1: ( rule__TurtleBot__Group_19_4__0__Impl rule__TurtleBot__Group_19_4__1 )
            // InternalMyDsl.g:1298:2: rule__TurtleBot__Group_19_4__0__Impl rule__TurtleBot__Group_19_4__1
            {
            pushFollow(FOLLOW_3);
            rule__TurtleBot__Group_19_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group_19_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_19_4__0"


    // $ANTLR start "rule__TurtleBot__Group_19_4__0__Impl"
    // InternalMyDsl.g:1305:1: rule__TurtleBot__Group_19_4__0__Impl : ( ',' ) ;
    public final void rule__TurtleBot__Group_19_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1309:1: ( ( ',' ) )
            // InternalMyDsl.g:1310:1: ( ',' )
            {
            // InternalMyDsl.g:1310:1: ( ',' )
            // InternalMyDsl.g:1311:2: ','
            {
             before(grammarAccess.getTurtleBotAccess().getCommaKeyword_19_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getCommaKeyword_19_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_19_4__0__Impl"


    // $ANTLR start "rule__TurtleBot__Group_19_4__1"
    // InternalMyDsl.g:1320:1: rule__TurtleBot__Group_19_4__1 : rule__TurtleBot__Group_19_4__1__Impl ;
    public final void rule__TurtleBot__Group_19_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1324:1: ( rule__TurtleBot__Group_19_4__1__Impl )
            // InternalMyDsl.g:1325:2: rule__TurtleBot__Group_19_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group_19_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_19_4__1"


    // $ANTLR start "rule__TurtleBot__Group_19_4__1__Impl"
    // InternalMyDsl.g:1331:1: rule__TurtleBot__Group_19_4__1__Impl : ( ( rule__TurtleBot__MissionsAssignment_19_4_1 ) ) ;
    public final void rule__TurtleBot__Group_19_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1335:1: ( ( ( rule__TurtleBot__MissionsAssignment_19_4_1 ) ) )
            // InternalMyDsl.g:1336:1: ( ( rule__TurtleBot__MissionsAssignment_19_4_1 ) )
            {
            // InternalMyDsl.g:1336:1: ( ( rule__TurtleBot__MissionsAssignment_19_4_1 ) )
            // InternalMyDsl.g:1337:2: ( rule__TurtleBot__MissionsAssignment_19_4_1 )
            {
             before(grammarAccess.getTurtleBotAccess().getMissionsAssignment_19_4_1()); 
            // InternalMyDsl.g:1338:2: ( rule__TurtleBot__MissionsAssignment_19_4_1 )
            // InternalMyDsl.g:1338:3: rule__TurtleBot__MissionsAssignment_19_4_1
            {
            pushFollow(FOLLOW_2);
            rule__TurtleBot__MissionsAssignment_19_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTurtleBotAccess().getMissionsAssignment_19_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_19_4__1__Impl"


    // $ANTLR start "rule__Area__Group__0"
    // InternalMyDsl.g:1347:1: rule__Area__Group__0 : rule__Area__Group__0__Impl rule__Area__Group__1 ;
    public final void rule__Area__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1351:1: ( rule__Area__Group__0__Impl rule__Area__Group__1 )
            // InternalMyDsl.g:1352:2: rule__Area__Group__0__Impl rule__Area__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Area__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Area__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__0"


    // $ANTLR start "rule__Area__Group__0__Impl"
    // InternalMyDsl.g:1359:1: rule__Area__Group__0__Impl : ( () ) ;
    public final void rule__Area__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1363:1: ( ( () ) )
            // InternalMyDsl.g:1364:1: ( () )
            {
            // InternalMyDsl.g:1364:1: ( () )
            // InternalMyDsl.g:1365:2: ()
            {
             before(grammarAccess.getAreaAccess().getAreaAction_0()); 
            // InternalMyDsl.g:1366:2: ()
            // InternalMyDsl.g:1366:3: 
            {
            }

             after(grammarAccess.getAreaAccess().getAreaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__0__Impl"


    // $ANTLR start "rule__Area__Group__1"
    // InternalMyDsl.g:1374:1: rule__Area__Group__1 : rule__Area__Group__1__Impl rule__Area__Group__2 ;
    public final void rule__Area__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1378:1: ( rule__Area__Group__1__Impl rule__Area__Group__2 )
            // InternalMyDsl.g:1379:2: rule__Area__Group__1__Impl rule__Area__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Area__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Area__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__1"


    // $ANTLR start "rule__Area__Group__1__Impl"
    // InternalMyDsl.g:1386:1: rule__Area__Group__1__Impl : ( '(' ) ;
    public final void rule__Area__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1390:1: ( ( '(' ) )
            // InternalMyDsl.g:1391:1: ( '(' )
            {
            // InternalMyDsl.g:1391:1: ( '(' )
            // InternalMyDsl.g:1392:2: '('
            {
             before(grammarAccess.getAreaAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAreaAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__1__Impl"


    // $ANTLR start "rule__Area__Group__2"
    // InternalMyDsl.g:1401:1: rule__Area__Group__2 : rule__Area__Group__2__Impl rule__Area__Group__3 ;
    public final void rule__Area__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1405:1: ( rule__Area__Group__2__Impl rule__Area__Group__3 )
            // InternalMyDsl.g:1406:2: rule__Area__Group__2__Impl rule__Area__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Area__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Area__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__2"


    // $ANTLR start "rule__Area__Group__2__Impl"
    // InternalMyDsl.g:1413:1: rule__Area__Group__2__Impl : ( 'max x' ) ;
    public final void rule__Area__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1417:1: ( ( 'max x' ) )
            // InternalMyDsl.g:1418:1: ( 'max x' )
            {
            // InternalMyDsl.g:1418:1: ( 'max x' )
            // InternalMyDsl.g:1419:2: 'max x'
            {
             before(grammarAccess.getAreaAccess().getMaxXKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAreaAccess().getMaxXKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__2__Impl"


    // $ANTLR start "rule__Area__Group__3"
    // InternalMyDsl.g:1428:1: rule__Area__Group__3 : rule__Area__Group__3__Impl rule__Area__Group__4 ;
    public final void rule__Area__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1432:1: ( rule__Area__Group__3__Impl rule__Area__Group__4 )
            // InternalMyDsl.g:1433:2: rule__Area__Group__3__Impl rule__Area__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Area__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Area__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__3"


    // $ANTLR start "rule__Area__Group__3__Impl"
    // InternalMyDsl.g:1440:1: rule__Area__Group__3__Impl : ( '=' ) ;
    public final void rule__Area__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1444:1: ( ( '=' ) )
            // InternalMyDsl.g:1445:1: ( '=' )
            {
            // InternalMyDsl.g:1445:1: ( '=' )
            // InternalMyDsl.g:1446:2: '='
            {
             before(grammarAccess.getAreaAccess().getEqualsSignKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAreaAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__3__Impl"


    // $ANTLR start "rule__Area__Group__4"
    // InternalMyDsl.g:1455:1: rule__Area__Group__4 : rule__Area__Group__4__Impl rule__Area__Group__5 ;
    public final void rule__Area__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1459:1: ( rule__Area__Group__4__Impl rule__Area__Group__5 )
            // InternalMyDsl.g:1460:2: rule__Area__Group__4__Impl rule__Area__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Area__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Area__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__4"


    // $ANTLR start "rule__Area__Group__4__Impl"
    // InternalMyDsl.g:1467:1: rule__Area__Group__4__Impl : ( ( rule__Area__XmaxAssignment_4 ) ) ;
    public final void rule__Area__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1471:1: ( ( ( rule__Area__XmaxAssignment_4 ) ) )
            // InternalMyDsl.g:1472:1: ( ( rule__Area__XmaxAssignment_4 ) )
            {
            // InternalMyDsl.g:1472:1: ( ( rule__Area__XmaxAssignment_4 ) )
            // InternalMyDsl.g:1473:2: ( rule__Area__XmaxAssignment_4 )
            {
             before(grammarAccess.getAreaAccess().getXmaxAssignment_4()); 
            // InternalMyDsl.g:1474:2: ( rule__Area__XmaxAssignment_4 )
            // InternalMyDsl.g:1474:3: rule__Area__XmaxAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Area__XmaxAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAreaAccess().getXmaxAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__4__Impl"


    // $ANTLR start "rule__Area__Group__5"
    // InternalMyDsl.g:1482:1: rule__Area__Group__5 : rule__Area__Group__5__Impl rule__Area__Group__6 ;
    public final void rule__Area__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1486:1: ( rule__Area__Group__5__Impl rule__Area__Group__6 )
            // InternalMyDsl.g:1487:2: rule__Area__Group__5__Impl rule__Area__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Area__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Area__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__5"


    // $ANTLR start "rule__Area__Group__5__Impl"
    // InternalMyDsl.g:1494:1: rule__Area__Group__5__Impl : ( ',' ) ;
    public final void rule__Area__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1498:1: ( ( ',' ) )
            // InternalMyDsl.g:1499:1: ( ',' )
            {
            // InternalMyDsl.g:1499:1: ( ',' )
            // InternalMyDsl.g:1500:2: ','
            {
             before(grammarAccess.getAreaAccess().getCommaKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAreaAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__5__Impl"


    // $ANTLR start "rule__Area__Group__6"
    // InternalMyDsl.g:1509:1: rule__Area__Group__6 : rule__Area__Group__6__Impl rule__Area__Group__7 ;
    public final void rule__Area__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1513:1: ( rule__Area__Group__6__Impl rule__Area__Group__7 )
            // InternalMyDsl.g:1514:2: rule__Area__Group__6__Impl rule__Area__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Area__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Area__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__6"


    // $ANTLR start "rule__Area__Group__6__Impl"
    // InternalMyDsl.g:1521:1: rule__Area__Group__6__Impl : ( 'max y' ) ;
    public final void rule__Area__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1525:1: ( ( 'max y' ) )
            // InternalMyDsl.g:1526:1: ( 'max y' )
            {
            // InternalMyDsl.g:1526:1: ( 'max y' )
            // InternalMyDsl.g:1527:2: 'max y'
            {
             before(grammarAccess.getAreaAccess().getMaxYKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAreaAccess().getMaxYKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__6__Impl"


    // $ANTLR start "rule__Area__Group__7"
    // InternalMyDsl.g:1536:1: rule__Area__Group__7 : rule__Area__Group__7__Impl rule__Area__Group__8 ;
    public final void rule__Area__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1540:1: ( rule__Area__Group__7__Impl rule__Area__Group__8 )
            // InternalMyDsl.g:1541:2: rule__Area__Group__7__Impl rule__Area__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__Area__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Area__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__7"


    // $ANTLR start "rule__Area__Group__7__Impl"
    // InternalMyDsl.g:1548:1: rule__Area__Group__7__Impl : ( '=' ) ;
    public final void rule__Area__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1552:1: ( ( '=' ) )
            // InternalMyDsl.g:1553:1: ( '=' )
            {
            // InternalMyDsl.g:1553:1: ( '=' )
            // InternalMyDsl.g:1554:2: '='
            {
             before(grammarAccess.getAreaAccess().getEqualsSignKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAreaAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__7__Impl"


    // $ANTLR start "rule__Area__Group__8"
    // InternalMyDsl.g:1563:1: rule__Area__Group__8 : rule__Area__Group__8__Impl rule__Area__Group__9 ;
    public final void rule__Area__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1567:1: ( rule__Area__Group__8__Impl rule__Area__Group__9 )
            // InternalMyDsl.g:1568:2: rule__Area__Group__8__Impl rule__Area__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__Area__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Area__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__8"


    // $ANTLR start "rule__Area__Group__8__Impl"
    // InternalMyDsl.g:1575:1: rule__Area__Group__8__Impl : ( ( rule__Area__YmaxAssignment_8 ) ) ;
    public final void rule__Area__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1579:1: ( ( ( rule__Area__YmaxAssignment_8 ) ) )
            // InternalMyDsl.g:1580:1: ( ( rule__Area__YmaxAssignment_8 ) )
            {
            // InternalMyDsl.g:1580:1: ( ( rule__Area__YmaxAssignment_8 ) )
            // InternalMyDsl.g:1581:2: ( rule__Area__YmaxAssignment_8 )
            {
             before(grammarAccess.getAreaAccess().getYmaxAssignment_8()); 
            // InternalMyDsl.g:1582:2: ( rule__Area__YmaxAssignment_8 )
            // InternalMyDsl.g:1582:3: rule__Area__YmaxAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Area__YmaxAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getAreaAccess().getYmaxAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__8__Impl"


    // $ANTLR start "rule__Area__Group__9"
    // InternalMyDsl.g:1590:1: rule__Area__Group__9 : rule__Area__Group__9__Impl ;
    public final void rule__Area__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1594:1: ( rule__Area__Group__9__Impl )
            // InternalMyDsl.g:1595:2: rule__Area__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Area__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__9"


    // $ANTLR start "rule__Area__Group__9__Impl"
    // InternalMyDsl.g:1601:1: rule__Area__Group__9__Impl : ( ')' ) ;
    public final void rule__Area__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1605:1: ( ( ')' ) )
            // InternalMyDsl.g:1606:1: ( ')' )
            {
            // InternalMyDsl.g:1606:1: ( ')' )
            // InternalMyDsl.g:1607:2: ')'
            {
             before(grammarAccess.getAreaAccess().getRightParenthesisKeyword_9()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAreaAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__9__Impl"


    // $ANTLR start "rule__WaypointType__Group__0"
    // InternalMyDsl.g:1617:1: rule__WaypointType__Group__0 : rule__WaypointType__Group__0__Impl rule__WaypointType__Group__1 ;
    public final void rule__WaypointType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1621:1: ( rule__WaypointType__Group__0__Impl rule__WaypointType__Group__1 )
            // InternalMyDsl.g:1622:2: rule__WaypointType__Group__0__Impl rule__WaypointType__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__WaypointType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WaypointType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaypointType__Group__0"


    // $ANTLR start "rule__WaypointType__Group__0__Impl"
    // InternalMyDsl.g:1629:1: rule__WaypointType__Group__0__Impl : ( () ) ;
    public final void rule__WaypointType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1633:1: ( ( () ) )
            // InternalMyDsl.g:1634:1: ( () )
            {
            // InternalMyDsl.g:1634:1: ( () )
            // InternalMyDsl.g:1635:2: ()
            {
             before(grammarAccess.getWaypointTypeAccess().getWaypointTypeAction_0()); 
            // InternalMyDsl.g:1636:2: ()
            // InternalMyDsl.g:1636:3: 
            {
            }

             after(grammarAccess.getWaypointTypeAccess().getWaypointTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaypointType__Group__0__Impl"


    // $ANTLR start "rule__WaypointType__Group__1"
    // InternalMyDsl.g:1644:1: rule__WaypointType__Group__1 : rule__WaypointType__Group__1__Impl ;
    public final void rule__WaypointType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1648:1: ( rule__WaypointType__Group__1__Impl )
            // InternalMyDsl.g:1649:2: rule__WaypointType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WaypointType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaypointType__Group__1"


    // $ANTLR start "rule__WaypointType__Group__1__Impl"
    // InternalMyDsl.g:1655:1: rule__WaypointType__Group__1__Impl : ( ( rule__WaypointType__NameAssignment_1 ) ) ;
    public final void rule__WaypointType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1659:1: ( ( ( rule__WaypointType__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1660:1: ( ( rule__WaypointType__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1660:1: ( ( rule__WaypointType__NameAssignment_1 ) )
            // InternalMyDsl.g:1661:2: ( rule__WaypointType__NameAssignment_1 )
            {
             before(grammarAccess.getWaypointTypeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1662:2: ( rule__WaypointType__NameAssignment_1 )
            // InternalMyDsl.g:1662:3: rule__WaypointType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WaypointType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWaypointTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaypointType__Group__1__Impl"


    // $ANTLR start "rule__WayPoint__Group__0"
    // InternalMyDsl.g:1671:1: rule__WayPoint__Group__0 : rule__WayPoint__Group__0__Impl rule__WayPoint__Group__1 ;
    public final void rule__WayPoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1675:1: ( rule__WayPoint__Group__0__Impl rule__WayPoint__Group__1 )
            // InternalMyDsl.g:1676:2: rule__WayPoint__Group__0__Impl rule__WayPoint__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__WayPoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WayPoint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__0"


    // $ANTLR start "rule__WayPoint__Group__0__Impl"
    // InternalMyDsl.g:1683:1: rule__WayPoint__Group__0__Impl : ( ( rule__WayPoint__WaypointtypesAssignment_0 ) ) ;
    public final void rule__WayPoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1687:1: ( ( ( rule__WayPoint__WaypointtypesAssignment_0 ) ) )
            // InternalMyDsl.g:1688:1: ( ( rule__WayPoint__WaypointtypesAssignment_0 ) )
            {
            // InternalMyDsl.g:1688:1: ( ( rule__WayPoint__WaypointtypesAssignment_0 ) )
            // InternalMyDsl.g:1689:2: ( rule__WayPoint__WaypointtypesAssignment_0 )
            {
             before(grammarAccess.getWayPointAccess().getWaypointtypesAssignment_0()); 
            // InternalMyDsl.g:1690:2: ( rule__WayPoint__WaypointtypesAssignment_0 )
            // InternalMyDsl.g:1690:3: rule__WayPoint__WaypointtypesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__WayPoint__WaypointtypesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWayPointAccess().getWaypointtypesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__0__Impl"


    // $ANTLR start "rule__WayPoint__Group__1"
    // InternalMyDsl.g:1698:1: rule__WayPoint__Group__1 : rule__WayPoint__Group__1__Impl rule__WayPoint__Group__2 ;
    public final void rule__WayPoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1702:1: ( rule__WayPoint__Group__1__Impl rule__WayPoint__Group__2 )
            // InternalMyDsl.g:1703:2: rule__WayPoint__Group__1__Impl rule__WayPoint__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__WayPoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WayPoint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__1"


    // $ANTLR start "rule__WayPoint__Group__1__Impl"
    // InternalMyDsl.g:1710:1: rule__WayPoint__Group__1__Impl : ( ( rule__WayPoint__Group_1__0 )* ) ;
    public final void rule__WayPoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1714:1: ( ( ( rule__WayPoint__Group_1__0 )* ) )
            // InternalMyDsl.g:1715:1: ( ( rule__WayPoint__Group_1__0 )* )
            {
            // InternalMyDsl.g:1715:1: ( ( rule__WayPoint__Group_1__0 )* )
            // InternalMyDsl.g:1716:2: ( rule__WayPoint__Group_1__0 )*
            {
             before(grammarAccess.getWayPointAccess().getGroup_1()); 
            // InternalMyDsl.g:1717:2: ( rule__WayPoint__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1717:3: rule__WayPoint__Group_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__WayPoint__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getWayPointAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__1__Impl"


    // $ANTLR start "rule__WayPoint__Group__2"
    // InternalMyDsl.g:1725:1: rule__WayPoint__Group__2 : rule__WayPoint__Group__2__Impl rule__WayPoint__Group__3 ;
    public final void rule__WayPoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1729:1: ( rule__WayPoint__Group__2__Impl rule__WayPoint__Group__3 )
            // InternalMyDsl.g:1730:2: rule__WayPoint__Group__2__Impl rule__WayPoint__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__WayPoint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WayPoint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__2"


    // $ANTLR start "rule__WayPoint__Group__2__Impl"
    // InternalMyDsl.g:1737:1: rule__WayPoint__Group__2__Impl : ( ( rule__WayPoint__NameAssignment_2 ) ) ;
    public final void rule__WayPoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1741:1: ( ( ( rule__WayPoint__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1742:1: ( ( rule__WayPoint__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1742:1: ( ( rule__WayPoint__NameAssignment_2 ) )
            // InternalMyDsl.g:1743:2: ( rule__WayPoint__NameAssignment_2 )
            {
             before(grammarAccess.getWayPointAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1744:2: ( rule__WayPoint__NameAssignment_2 )
            // InternalMyDsl.g:1744:3: rule__WayPoint__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WayPoint__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWayPointAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__2__Impl"


    // $ANTLR start "rule__WayPoint__Group__3"
    // InternalMyDsl.g:1752:1: rule__WayPoint__Group__3 : rule__WayPoint__Group__3__Impl rule__WayPoint__Group__4 ;
    public final void rule__WayPoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1756:1: ( rule__WayPoint__Group__3__Impl rule__WayPoint__Group__4 )
            // InternalMyDsl.g:1757:2: rule__WayPoint__Group__3__Impl rule__WayPoint__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__WayPoint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WayPoint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__3"


    // $ANTLR start "rule__WayPoint__Group__3__Impl"
    // InternalMyDsl.g:1764:1: rule__WayPoint__Group__3__Impl : ( '(' ) ;
    public final void rule__WayPoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1768:1: ( ( '(' ) )
            // InternalMyDsl.g:1769:1: ( '(' )
            {
            // InternalMyDsl.g:1769:1: ( '(' )
            // InternalMyDsl.g:1770:2: '('
            {
             before(grammarAccess.getWayPointAccess().getLeftParenthesisKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getWayPointAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__3__Impl"


    // $ANTLR start "rule__WayPoint__Group__4"
    // InternalMyDsl.g:1779:1: rule__WayPoint__Group__4 : rule__WayPoint__Group__4__Impl rule__WayPoint__Group__5 ;
    public final void rule__WayPoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1783:1: ( rule__WayPoint__Group__4__Impl rule__WayPoint__Group__5 )
            // InternalMyDsl.g:1784:2: rule__WayPoint__Group__4__Impl rule__WayPoint__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__WayPoint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WayPoint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__4"


    // $ANTLR start "rule__WayPoint__Group__4__Impl"
    // InternalMyDsl.g:1791:1: rule__WayPoint__Group__4__Impl : ( 'x' ) ;
    public final void rule__WayPoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1795:1: ( ( 'x' ) )
            // InternalMyDsl.g:1796:1: ( 'x' )
            {
            // InternalMyDsl.g:1796:1: ( 'x' )
            // InternalMyDsl.g:1797:2: 'x'
            {
             before(grammarAccess.getWayPointAccess().getXKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getWayPointAccess().getXKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__4__Impl"


    // $ANTLR start "rule__WayPoint__Group__5"
    // InternalMyDsl.g:1806:1: rule__WayPoint__Group__5 : rule__WayPoint__Group__5__Impl rule__WayPoint__Group__6 ;
    public final void rule__WayPoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1810:1: ( rule__WayPoint__Group__5__Impl rule__WayPoint__Group__6 )
            // InternalMyDsl.g:1811:2: rule__WayPoint__Group__5__Impl rule__WayPoint__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__WayPoint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WayPoint__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__5"


    // $ANTLR start "rule__WayPoint__Group__5__Impl"
    // InternalMyDsl.g:1818:1: rule__WayPoint__Group__5__Impl : ( '=' ) ;
    public final void rule__WayPoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1822:1: ( ( '=' ) )
            // InternalMyDsl.g:1823:1: ( '=' )
            {
            // InternalMyDsl.g:1823:1: ( '=' )
            // InternalMyDsl.g:1824:2: '='
            {
             before(grammarAccess.getWayPointAccess().getEqualsSignKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getWayPointAccess().getEqualsSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__5__Impl"


    // $ANTLR start "rule__WayPoint__Group__6"
    // InternalMyDsl.g:1833:1: rule__WayPoint__Group__6 : rule__WayPoint__Group__6__Impl rule__WayPoint__Group__7 ;
    public final void rule__WayPoint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1837:1: ( rule__WayPoint__Group__6__Impl rule__WayPoint__Group__7 )
            // InternalMyDsl.g:1838:2: rule__WayPoint__Group__6__Impl rule__WayPoint__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__WayPoint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WayPoint__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__6"


    // $ANTLR start "rule__WayPoint__Group__6__Impl"
    // InternalMyDsl.g:1845:1: rule__WayPoint__Group__6__Impl : ( ( rule__WayPoint__Coord_xAssignment_6 ) ) ;
    public final void rule__WayPoint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1849:1: ( ( ( rule__WayPoint__Coord_xAssignment_6 ) ) )
            // InternalMyDsl.g:1850:1: ( ( rule__WayPoint__Coord_xAssignment_6 ) )
            {
            // InternalMyDsl.g:1850:1: ( ( rule__WayPoint__Coord_xAssignment_6 ) )
            // InternalMyDsl.g:1851:2: ( rule__WayPoint__Coord_xAssignment_6 )
            {
             before(grammarAccess.getWayPointAccess().getCoord_xAssignment_6()); 
            // InternalMyDsl.g:1852:2: ( rule__WayPoint__Coord_xAssignment_6 )
            // InternalMyDsl.g:1852:3: rule__WayPoint__Coord_xAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__WayPoint__Coord_xAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getWayPointAccess().getCoord_xAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__6__Impl"


    // $ANTLR start "rule__WayPoint__Group__7"
    // InternalMyDsl.g:1860:1: rule__WayPoint__Group__7 : rule__WayPoint__Group__7__Impl rule__WayPoint__Group__8 ;
    public final void rule__WayPoint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1864:1: ( rule__WayPoint__Group__7__Impl rule__WayPoint__Group__8 )
            // InternalMyDsl.g:1865:2: rule__WayPoint__Group__7__Impl rule__WayPoint__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__WayPoint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WayPoint__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__7"


    // $ANTLR start "rule__WayPoint__Group__7__Impl"
    // InternalMyDsl.g:1872:1: rule__WayPoint__Group__7__Impl : ( ',' ) ;
    public final void rule__WayPoint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1876:1: ( ( ',' ) )
            // InternalMyDsl.g:1877:1: ( ',' )
            {
            // InternalMyDsl.g:1877:1: ( ',' )
            // InternalMyDsl.g:1878:2: ','
            {
             before(grammarAccess.getWayPointAccess().getCommaKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWayPointAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__7__Impl"


    // $ANTLR start "rule__WayPoint__Group__8"
    // InternalMyDsl.g:1887:1: rule__WayPoint__Group__8 : rule__WayPoint__Group__8__Impl rule__WayPoint__Group__9 ;
    public final void rule__WayPoint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1891:1: ( rule__WayPoint__Group__8__Impl rule__WayPoint__Group__9 )
            // InternalMyDsl.g:1892:2: rule__WayPoint__Group__8__Impl rule__WayPoint__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__WayPoint__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WayPoint__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__8"


    // $ANTLR start "rule__WayPoint__Group__8__Impl"
    // InternalMyDsl.g:1899:1: rule__WayPoint__Group__8__Impl : ( 'y' ) ;
    public final void rule__WayPoint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1903:1: ( ( 'y' ) )
            // InternalMyDsl.g:1904:1: ( 'y' )
            {
            // InternalMyDsl.g:1904:1: ( 'y' )
            // InternalMyDsl.g:1905:2: 'y'
            {
             before(grammarAccess.getWayPointAccess().getYKeyword_8()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getWayPointAccess().getYKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__8__Impl"


    // $ANTLR start "rule__WayPoint__Group__9"
    // InternalMyDsl.g:1914:1: rule__WayPoint__Group__9 : rule__WayPoint__Group__9__Impl rule__WayPoint__Group__10 ;
    public final void rule__WayPoint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1918:1: ( rule__WayPoint__Group__9__Impl rule__WayPoint__Group__10 )
            // InternalMyDsl.g:1919:2: rule__WayPoint__Group__9__Impl rule__WayPoint__Group__10
            {
            pushFollow(FOLLOW_14);
            rule__WayPoint__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WayPoint__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__9"


    // $ANTLR start "rule__WayPoint__Group__9__Impl"
    // InternalMyDsl.g:1926:1: rule__WayPoint__Group__9__Impl : ( '=' ) ;
    public final void rule__WayPoint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1930:1: ( ( '=' ) )
            // InternalMyDsl.g:1931:1: ( '=' )
            {
            // InternalMyDsl.g:1931:1: ( '=' )
            // InternalMyDsl.g:1932:2: '='
            {
             before(grammarAccess.getWayPointAccess().getEqualsSignKeyword_9()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getWayPointAccess().getEqualsSignKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__9__Impl"


    // $ANTLR start "rule__WayPoint__Group__10"
    // InternalMyDsl.g:1941:1: rule__WayPoint__Group__10 : rule__WayPoint__Group__10__Impl rule__WayPoint__Group__11 ;
    public final void rule__WayPoint__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1945:1: ( rule__WayPoint__Group__10__Impl rule__WayPoint__Group__11 )
            // InternalMyDsl.g:1946:2: rule__WayPoint__Group__10__Impl rule__WayPoint__Group__11
            {
            pushFollow(FOLLOW_17);
            rule__WayPoint__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WayPoint__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__10"


    // $ANTLR start "rule__WayPoint__Group__10__Impl"
    // InternalMyDsl.g:1953:1: rule__WayPoint__Group__10__Impl : ( ( rule__WayPoint__Coord_yAssignment_10 ) ) ;
    public final void rule__WayPoint__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1957:1: ( ( ( rule__WayPoint__Coord_yAssignment_10 ) ) )
            // InternalMyDsl.g:1958:1: ( ( rule__WayPoint__Coord_yAssignment_10 ) )
            {
            // InternalMyDsl.g:1958:1: ( ( rule__WayPoint__Coord_yAssignment_10 ) )
            // InternalMyDsl.g:1959:2: ( rule__WayPoint__Coord_yAssignment_10 )
            {
             before(grammarAccess.getWayPointAccess().getCoord_yAssignment_10()); 
            // InternalMyDsl.g:1960:2: ( rule__WayPoint__Coord_yAssignment_10 )
            // InternalMyDsl.g:1960:3: rule__WayPoint__Coord_yAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__WayPoint__Coord_yAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getWayPointAccess().getCoord_yAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__10__Impl"


    // $ANTLR start "rule__WayPoint__Group__11"
    // InternalMyDsl.g:1968:1: rule__WayPoint__Group__11 : rule__WayPoint__Group__11__Impl ;
    public final void rule__WayPoint__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1972:1: ( rule__WayPoint__Group__11__Impl )
            // InternalMyDsl.g:1973:2: rule__WayPoint__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WayPoint__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__11"


    // $ANTLR start "rule__WayPoint__Group__11__Impl"
    // InternalMyDsl.g:1979:1: rule__WayPoint__Group__11__Impl : ( ')' ) ;
    public final void rule__WayPoint__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1983:1: ( ( ')' ) )
            // InternalMyDsl.g:1984:1: ( ')' )
            {
            // InternalMyDsl.g:1984:1: ( ')' )
            // InternalMyDsl.g:1985:2: ')'
            {
             before(grammarAccess.getWayPointAccess().getRightParenthesisKeyword_11()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getWayPointAccess().getRightParenthesisKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__11__Impl"


    // $ANTLR start "rule__WayPoint__Group_1__0"
    // InternalMyDsl.g:1995:1: rule__WayPoint__Group_1__0 : rule__WayPoint__Group_1__0__Impl rule__WayPoint__Group_1__1 ;
    public final void rule__WayPoint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1999:1: ( rule__WayPoint__Group_1__0__Impl rule__WayPoint__Group_1__1 )
            // InternalMyDsl.g:2000:2: rule__WayPoint__Group_1__0__Impl rule__WayPoint__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__WayPoint__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WayPoint__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group_1__0"


    // $ANTLR start "rule__WayPoint__Group_1__0__Impl"
    // InternalMyDsl.g:2007:1: rule__WayPoint__Group_1__0__Impl : ( '&' ) ;
    public final void rule__WayPoint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2011:1: ( ( '&' ) )
            // InternalMyDsl.g:2012:1: ( '&' )
            {
            // InternalMyDsl.g:2012:1: ( '&' )
            // InternalMyDsl.g:2013:2: '&'
            {
             before(grammarAccess.getWayPointAccess().getAmpersandKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getWayPointAccess().getAmpersandKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group_1__0__Impl"


    // $ANTLR start "rule__WayPoint__Group_1__1"
    // InternalMyDsl.g:2022:1: rule__WayPoint__Group_1__1 : rule__WayPoint__Group_1__1__Impl ;
    public final void rule__WayPoint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2026:1: ( rule__WayPoint__Group_1__1__Impl )
            // InternalMyDsl.g:2027:2: rule__WayPoint__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WayPoint__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group_1__1"


    // $ANTLR start "rule__WayPoint__Group_1__1__Impl"
    // InternalMyDsl.g:2033:1: rule__WayPoint__Group_1__1__Impl : ( ( rule__WayPoint__WaypointtypesAssignment_1_1 ) ) ;
    public final void rule__WayPoint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2037:1: ( ( ( rule__WayPoint__WaypointtypesAssignment_1_1 ) ) )
            // InternalMyDsl.g:2038:1: ( ( rule__WayPoint__WaypointtypesAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2038:1: ( ( rule__WayPoint__WaypointtypesAssignment_1_1 ) )
            // InternalMyDsl.g:2039:2: ( rule__WayPoint__WaypointtypesAssignment_1_1 )
            {
             before(grammarAccess.getWayPointAccess().getWaypointtypesAssignment_1_1()); 
            // InternalMyDsl.g:2040:2: ( rule__WayPoint__WaypointtypesAssignment_1_1 )
            // InternalMyDsl.g:2040:3: rule__WayPoint__WaypointtypesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__WayPoint__WaypointtypesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getWayPointAccess().getWaypointtypesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group_1__1__Impl"


    // $ANTLR start "rule__Mission__Group__0"
    // InternalMyDsl.g:2049:1: rule__Mission__Group__0 : rule__Mission__Group__0__Impl rule__Mission__Group__1 ;
    public final void rule__Mission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2053:1: ( rule__Mission__Group__0__Impl rule__Mission__Group__1 )
            // InternalMyDsl.g:2054:2: rule__Mission__Group__0__Impl rule__Mission__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Mission__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__0"


    // $ANTLR start "rule__Mission__Group__0__Impl"
    // InternalMyDsl.g:2061:1: rule__Mission__Group__0__Impl : ( ( rule__Mission__NameAssignment_0 ) ) ;
    public final void rule__Mission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2065:1: ( ( ( rule__Mission__NameAssignment_0 ) ) )
            // InternalMyDsl.g:2066:1: ( ( rule__Mission__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:2066:1: ( ( rule__Mission__NameAssignment_0 ) )
            // InternalMyDsl.g:2067:2: ( rule__Mission__NameAssignment_0 )
            {
             before(grammarAccess.getMissionAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:2068:2: ( rule__Mission__NameAssignment_0 )
            // InternalMyDsl.g:2068:3: rule__Mission__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Mission__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__0__Impl"


    // $ANTLR start "rule__Mission__Group__1"
    // InternalMyDsl.g:2076:1: rule__Mission__Group__1 : rule__Mission__Group__1__Impl rule__Mission__Group__2 ;
    public final void rule__Mission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2080:1: ( rule__Mission__Group__1__Impl rule__Mission__Group__2 )
            // InternalMyDsl.g:2081:2: rule__Mission__Group__1__Impl rule__Mission__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Mission__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__1"


    // $ANTLR start "rule__Mission__Group__1__Impl"
    // InternalMyDsl.g:2088:1: rule__Mission__Group__1__Impl : ( '{' ) ;
    public final void rule__Mission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2092:1: ( ( '{' ) )
            // InternalMyDsl.g:2093:1: ( '{' )
            {
            // InternalMyDsl.g:2093:1: ( '{' )
            // InternalMyDsl.g:2094:2: '{'
            {
             before(grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__1__Impl"


    // $ANTLR start "rule__Mission__Group__2"
    // InternalMyDsl.g:2103:1: rule__Mission__Group__2 : rule__Mission__Group__2__Impl rule__Mission__Group__3 ;
    public final void rule__Mission__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2107:1: ( rule__Mission__Group__2__Impl rule__Mission__Group__3 )
            // InternalMyDsl.g:2108:2: rule__Mission__Group__2__Impl rule__Mission__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Mission__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__2"


    // $ANTLR start "rule__Mission__Group__2__Impl"
    // InternalMyDsl.g:2115:1: rule__Mission__Group__2__Impl : ( ( rule__Mission__TaskAssignment_2 ) ) ;
    public final void rule__Mission__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2119:1: ( ( ( rule__Mission__TaskAssignment_2 ) ) )
            // InternalMyDsl.g:2120:1: ( ( rule__Mission__TaskAssignment_2 ) )
            {
            // InternalMyDsl.g:2120:1: ( ( rule__Mission__TaskAssignment_2 ) )
            // InternalMyDsl.g:2121:2: ( rule__Mission__TaskAssignment_2 )
            {
             before(grammarAccess.getMissionAccess().getTaskAssignment_2()); 
            // InternalMyDsl.g:2122:2: ( rule__Mission__TaskAssignment_2 )
            // InternalMyDsl.g:2122:3: rule__Mission__TaskAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Mission__TaskAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getTaskAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__2__Impl"


    // $ANTLR start "rule__Mission__Group__3"
    // InternalMyDsl.g:2130:1: rule__Mission__Group__3 : rule__Mission__Group__3__Impl rule__Mission__Group__4 ;
    public final void rule__Mission__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2134:1: ( rule__Mission__Group__3__Impl rule__Mission__Group__4 )
            // InternalMyDsl.g:2135:2: rule__Mission__Group__3__Impl rule__Mission__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Mission__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__3"


    // $ANTLR start "rule__Mission__Group__3__Impl"
    // InternalMyDsl.g:2142:1: rule__Mission__Group__3__Impl : ( ( rule__Mission__Group_3__0 )* ) ;
    public final void rule__Mission__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2146:1: ( ( ( rule__Mission__Group_3__0 )* ) )
            // InternalMyDsl.g:2147:1: ( ( rule__Mission__Group_3__0 )* )
            {
            // InternalMyDsl.g:2147:1: ( ( rule__Mission__Group_3__0 )* )
            // InternalMyDsl.g:2148:2: ( rule__Mission__Group_3__0 )*
            {
             before(grammarAccess.getMissionAccess().getGroup_3()); 
            // InternalMyDsl.g:2149:2: ( rule__Mission__Group_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:2149:3: rule__Mission__Group_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Mission__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getMissionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__3__Impl"


    // $ANTLR start "rule__Mission__Group__4"
    // InternalMyDsl.g:2157:1: rule__Mission__Group__4 : rule__Mission__Group__4__Impl ;
    public final void rule__Mission__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2161:1: ( rule__Mission__Group__4__Impl )
            // InternalMyDsl.g:2162:2: rule__Mission__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__4"


    // $ANTLR start "rule__Mission__Group__4__Impl"
    // InternalMyDsl.g:2168:1: rule__Mission__Group__4__Impl : ( '}' ) ;
    public final void rule__Mission__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2172:1: ( ( '}' ) )
            // InternalMyDsl.g:2173:1: ( '}' )
            {
            // InternalMyDsl.g:2173:1: ( '}' )
            // InternalMyDsl.g:2174:2: '}'
            {
             before(grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__4__Impl"


    // $ANTLR start "rule__Mission__Group_3__0"
    // InternalMyDsl.g:2184:1: rule__Mission__Group_3__0 : rule__Mission__Group_3__0__Impl rule__Mission__Group_3__1 ;
    public final void rule__Mission__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2188:1: ( rule__Mission__Group_3__0__Impl rule__Mission__Group_3__1 )
            // InternalMyDsl.g:2189:2: rule__Mission__Group_3__0__Impl rule__Mission__Group_3__1
            {
            pushFollow(FOLLOW_22);
            rule__Mission__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_3__0"


    // $ANTLR start "rule__Mission__Group_3__0__Impl"
    // InternalMyDsl.g:2196:1: rule__Mission__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Mission__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2200:1: ( ( ',' ) )
            // InternalMyDsl.g:2201:1: ( ',' )
            {
            // InternalMyDsl.g:2201:1: ( ',' )
            // InternalMyDsl.g:2202:2: ','
            {
             before(grammarAccess.getMissionAccess().getCommaKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_3__0__Impl"


    // $ANTLR start "rule__Mission__Group_3__1"
    // InternalMyDsl.g:2211:1: rule__Mission__Group_3__1 : rule__Mission__Group_3__1__Impl ;
    public final void rule__Mission__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2215:1: ( rule__Mission__Group_3__1__Impl )
            // InternalMyDsl.g:2216:2: rule__Mission__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_3__1"


    // $ANTLR start "rule__Mission__Group_3__1__Impl"
    // InternalMyDsl.g:2222:1: rule__Mission__Group_3__1__Impl : ( ( rule__Mission__TaskAssignment_3_1 ) ) ;
    public final void rule__Mission__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2226:1: ( ( ( rule__Mission__TaskAssignment_3_1 ) ) )
            // InternalMyDsl.g:2227:1: ( ( rule__Mission__TaskAssignment_3_1 ) )
            {
            // InternalMyDsl.g:2227:1: ( ( rule__Mission__TaskAssignment_3_1 ) )
            // InternalMyDsl.g:2228:2: ( rule__Mission__TaskAssignment_3_1 )
            {
             before(grammarAccess.getMissionAccess().getTaskAssignment_3_1()); 
            // InternalMyDsl.g:2229:2: ( rule__Mission__TaskAssignment_3_1 )
            // InternalMyDsl.g:2229:3: rule__Mission__TaskAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__TaskAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getTaskAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_3__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalMyDsl.g:2238:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2242:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMyDsl.g:2243:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalMyDsl.g:2250:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2254:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:2255:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:2255:1: ( ( '-' )? )
            // InternalMyDsl.g:2256:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:2257:2: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:2257:3: '-'
                    {
                    match(input,28,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalMyDsl.g:2265:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2269:1: ( rule__EInt__Group__1__Impl )
            // InternalMyDsl.g:2270:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalMyDsl.g:2276:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2280:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2281:1: ( RULE_INT )
            {
            // InternalMyDsl.g:2281:1: ( RULE_INT )
            // InternalMyDsl.g:2282:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__LineTask__Group__0"
    // InternalMyDsl.g:2292:1: rule__LineTask__Group__0 : rule__LineTask__Group__0__Impl rule__LineTask__Group__1 ;
    public final void rule__LineTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2296:1: ( rule__LineTask__Group__0__Impl rule__LineTask__Group__1 )
            // InternalMyDsl.g:2297:2: rule__LineTask__Group__0__Impl rule__LineTask__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__LineTask__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineTask__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__Group__0"


    // $ANTLR start "rule__LineTask__Group__0__Impl"
    // InternalMyDsl.g:2304:1: rule__LineTask__Group__0__Impl : ( 'line' ) ;
    public final void rule__LineTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2308:1: ( ( 'line' ) )
            // InternalMyDsl.g:2309:1: ( 'line' )
            {
            // InternalMyDsl.g:2309:1: ( 'line' )
            // InternalMyDsl.g:2310:2: 'line'
            {
             before(grammarAccess.getLineTaskAccess().getLineKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLineTaskAccess().getLineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__Group__0__Impl"


    // $ANTLR start "rule__LineTask__Group__1"
    // InternalMyDsl.g:2319:1: rule__LineTask__Group__1 : rule__LineTask__Group__1__Impl rule__LineTask__Group__2 ;
    public final void rule__LineTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2323:1: ( rule__LineTask__Group__1__Impl rule__LineTask__Group__2 )
            // InternalMyDsl.g:2324:2: rule__LineTask__Group__1__Impl rule__LineTask__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__LineTask__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineTask__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__Group__1"


    // $ANTLR start "rule__LineTask__Group__1__Impl"
    // InternalMyDsl.g:2331:1: rule__LineTask__Group__1__Impl : ( '(' ) ;
    public final void rule__LineTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2335:1: ( ( '(' ) )
            // InternalMyDsl.g:2336:1: ( '(' )
            {
            // InternalMyDsl.g:2336:1: ( '(' )
            // InternalMyDsl.g:2337:2: '('
            {
             before(grammarAccess.getLineTaskAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLineTaskAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__Group__1__Impl"


    // $ANTLR start "rule__LineTask__Group__2"
    // InternalMyDsl.g:2346:1: rule__LineTask__Group__2 : rule__LineTask__Group__2__Impl rule__LineTask__Group__3 ;
    public final void rule__LineTask__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2350:1: ( rule__LineTask__Group__2__Impl rule__LineTask__Group__3 )
            // InternalMyDsl.g:2351:2: rule__LineTask__Group__2__Impl rule__LineTask__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__LineTask__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineTask__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__Group__2"


    // $ANTLR start "rule__LineTask__Group__2__Impl"
    // InternalMyDsl.g:2358:1: rule__LineTask__Group__2__Impl : ( ( rule__LineTask__WaypointsAssignment_2 ) ) ;
    public final void rule__LineTask__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2362:1: ( ( ( rule__LineTask__WaypointsAssignment_2 ) ) )
            // InternalMyDsl.g:2363:1: ( ( rule__LineTask__WaypointsAssignment_2 ) )
            {
            // InternalMyDsl.g:2363:1: ( ( rule__LineTask__WaypointsAssignment_2 ) )
            // InternalMyDsl.g:2364:2: ( rule__LineTask__WaypointsAssignment_2 )
            {
             before(grammarAccess.getLineTaskAccess().getWaypointsAssignment_2()); 
            // InternalMyDsl.g:2365:2: ( rule__LineTask__WaypointsAssignment_2 )
            // InternalMyDsl.g:2365:3: rule__LineTask__WaypointsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LineTask__WaypointsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLineTaskAccess().getWaypointsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__Group__2__Impl"


    // $ANTLR start "rule__LineTask__Group__3"
    // InternalMyDsl.g:2373:1: rule__LineTask__Group__3 : rule__LineTask__Group__3__Impl rule__LineTask__Group__4 ;
    public final void rule__LineTask__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2377:1: ( rule__LineTask__Group__3__Impl rule__LineTask__Group__4 )
            // InternalMyDsl.g:2378:2: rule__LineTask__Group__3__Impl rule__LineTask__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__LineTask__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineTask__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__Group__3"


    // $ANTLR start "rule__LineTask__Group__3__Impl"
    // InternalMyDsl.g:2385:1: rule__LineTask__Group__3__Impl : ( ( rule__LineTask__Group_3__0 )* ) ;
    public final void rule__LineTask__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2389:1: ( ( ( rule__LineTask__Group_3__0 )* ) )
            // InternalMyDsl.g:2390:1: ( ( rule__LineTask__Group_3__0 )* )
            {
            // InternalMyDsl.g:2390:1: ( ( rule__LineTask__Group_3__0 )* )
            // InternalMyDsl.g:2391:2: ( rule__LineTask__Group_3__0 )*
            {
             before(grammarAccess.getLineTaskAccess().getGroup_3()); 
            // InternalMyDsl.g:2392:2: ( rule__LineTask__Group_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:2392:3: rule__LineTask__Group_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__LineTask__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getLineTaskAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__Group__3__Impl"


    // $ANTLR start "rule__LineTask__Group__4"
    // InternalMyDsl.g:2400:1: rule__LineTask__Group__4 : rule__LineTask__Group__4__Impl ;
    public final void rule__LineTask__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2404:1: ( rule__LineTask__Group__4__Impl )
            // InternalMyDsl.g:2405:2: rule__LineTask__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineTask__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__Group__4"


    // $ANTLR start "rule__LineTask__Group__4__Impl"
    // InternalMyDsl.g:2411:1: rule__LineTask__Group__4__Impl : ( ')' ) ;
    public final void rule__LineTask__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2415:1: ( ( ')' ) )
            // InternalMyDsl.g:2416:1: ( ')' )
            {
            // InternalMyDsl.g:2416:1: ( ')' )
            // InternalMyDsl.g:2417:2: ')'
            {
             before(grammarAccess.getLineTaskAccess().getRightParenthesisKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLineTaskAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__Group__4__Impl"


    // $ANTLR start "rule__LineTask__Group_3__0"
    // InternalMyDsl.g:2427:1: rule__LineTask__Group_3__0 : rule__LineTask__Group_3__0__Impl rule__LineTask__Group_3__1 ;
    public final void rule__LineTask__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2431:1: ( rule__LineTask__Group_3__0__Impl rule__LineTask__Group_3__1 )
            // InternalMyDsl.g:2432:2: rule__LineTask__Group_3__0__Impl rule__LineTask__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__LineTask__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineTask__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__Group_3__0"


    // $ANTLR start "rule__LineTask__Group_3__0__Impl"
    // InternalMyDsl.g:2439:1: rule__LineTask__Group_3__0__Impl : ( ',' ) ;
    public final void rule__LineTask__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2443:1: ( ( ',' ) )
            // InternalMyDsl.g:2444:1: ( ',' )
            {
            // InternalMyDsl.g:2444:1: ( ',' )
            // InternalMyDsl.g:2445:2: ','
            {
             before(grammarAccess.getLineTaskAccess().getCommaKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLineTaskAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__Group_3__0__Impl"


    // $ANTLR start "rule__LineTask__Group_3__1"
    // InternalMyDsl.g:2454:1: rule__LineTask__Group_3__1 : rule__LineTask__Group_3__1__Impl ;
    public final void rule__LineTask__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2458:1: ( rule__LineTask__Group_3__1__Impl )
            // InternalMyDsl.g:2459:2: rule__LineTask__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineTask__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__Group_3__1"


    // $ANTLR start "rule__LineTask__Group_3__1__Impl"
    // InternalMyDsl.g:2465:1: rule__LineTask__Group_3__1__Impl : ( ( rule__LineTask__WaypointsAssignment_3_1 ) ) ;
    public final void rule__LineTask__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2469:1: ( ( ( rule__LineTask__WaypointsAssignment_3_1 ) ) )
            // InternalMyDsl.g:2470:1: ( ( rule__LineTask__WaypointsAssignment_3_1 ) )
            {
            // InternalMyDsl.g:2470:1: ( ( rule__LineTask__WaypointsAssignment_3_1 ) )
            // InternalMyDsl.g:2471:2: ( rule__LineTask__WaypointsAssignment_3_1 )
            {
             before(grammarAccess.getLineTaskAccess().getWaypointsAssignment_3_1()); 
            // InternalMyDsl.g:2472:2: ( rule__LineTask__WaypointsAssignment_3_1 )
            // InternalMyDsl.g:2472:3: rule__LineTask__WaypointsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__LineTask__WaypointsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLineTaskAccess().getWaypointsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__Group_3__1__Impl"


    // $ANTLR start "rule__ShortestPathTask__Group__0"
    // InternalMyDsl.g:2481:1: rule__ShortestPathTask__Group__0 : rule__ShortestPathTask__Group__0__Impl rule__ShortestPathTask__Group__1 ;
    public final void rule__ShortestPathTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2485:1: ( rule__ShortestPathTask__Group__0__Impl rule__ShortestPathTask__Group__1 )
            // InternalMyDsl.g:2486:2: rule__ShortestPathTask__Group__0__Impl rule__ShortestPathTask__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ShortestPathTask__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShortestPathTask__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__Group__0"


    // $ANTLR start "rule__ShortestPathTask__Group__0__Impl"
    // InternalMyDsl.g:2493:1: rule__ShortestPathTask__Group__0__Impl : ( 'shortest path' ) ;
    public final void rule__ShortestPathTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2497:1: ( ( 'shortest path' ) )
            // InternalMyDsl.g:2498:1: ( 'shortest path' )
            {
            // InternalMyDsl.g:2498:1: ( 'shortest path' )
            // InternalMyDsl.g:2499:2: 'shortest path'
            {
             before(grammarAccess.getShortestPathTaskAccess().getShortestPathKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getShortestPathTaskAccess().getShortestPathKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__Group__0__Impl"


    // $ANTLR start "rule__ShortestPathTask__Group__1"
    // InternalMyDsl.g:2508:1: rule__ShortestPathTask__Group__1 : rule__ShortestPathTask__Group__1__Impl rule__ShortestPathTask__Group__2 ;
    public final void rule__ShortestPathTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2512:1: ( rule__ShortestPathTask__Group__1__Impl rule__ShortestPathTask__Group__2 )
            // InternalMyDsl.g:2513:2: rule__ShortestPathTask__Group__1__Impl rule__ShortestPathTask__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ShortestPathTask__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShortestPathTask__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__Group__1"


    // $ANTLR start "rule__ShortestPathTask__Group__1__Impl"
    // InternalMyDsl.g:2520:1: rule__ShortestPathTask__Group__1__Impl : ( '(' ) ;
    public final void rule__ShortestPathTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2524:1: ( ( '(' ) )
            // InternalMyDsl.g:2525:1: ( '(' )
            {
            // InternalMyDsl.g:2525:1: ( '(' )
            // InternalMyDsl.g:2526:2: '('
            {
             before(grammarAccess.getShortestPathTaskAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getShortestPathTaskAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__Group__1__Impl"


    // $ANTLR start "rule__ShortestPathTask__Group__2"
    // InternalMyDsl.g:2535:1: rule__ShortestPathTask__Group__2 : rule__ShortestPathTask__Group__2__Impl rule__ShortestPathTask__Group__3 ;
    public final void rule__ShortestPathTask__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2539:1: ( rule__ShortestPathTask__Group__2__Impl rule__ShortestPathTask__Group__3 )
            // InternalMyDsl.g:2540:2: rule__ShortestPathTask__Group__2__Impl rule__ShortestPathTask__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__ShortestPathTask__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShortestPathTask__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__Group__2"


    // $ANTLR start "rule__ShortestPathTask__Group__2__Impl"
    // InternalMyDsl.g:2547:1: rule__ShortestPathTask__Group__2__Impl : ( ( rule__ShortestPathTask__WaypointsAssignment_2 ) ) ;
    public final void rule__ShortestPathTask__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2551:1: ( ( ( rule__ShortestPathTask__WaypointsAssignment_2 ) ) )
            // InternalMyDsl.g:2552:1: ( ( rule__ShortestPathTask__WaypointsAssignment_2 ) )
            {
            // InternalMyDsl.g:2552:1: ( ( rule__ShortestPathTask__WaypointsAssignment_2 ) )
            // InternalMyDsl.g:2553:2: ( rule__ShortestPathTask__WaypointsAssignment_2 )
            {
             before(grammarAccess.getShortestPathTaskAccess().getWaypointsAssignment_2()); 
            // InternalMyDsl.g:2554:2: ( rule__ShortestPathTask__WaypointsAssignment_2 )
            // InternalMyDsl.g:2554:3: rule__ShortestPathTask__WaypointsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ShortestPathTask__WaypointsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getShortestPathTaskAccess().getWaypointsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__Group__2__Impl"


    // $ANTLR start "rule__ShortestPathTask__Group__3"
    // InternalMyDsl.g:2562:1: rule__ShortestPathTask__Group__3 : rule__ShortestPathTask__Group__3__Impl rule__ShortestPathTask__Group__4 ;
    public final void rule__ShortestPathTask__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2566:1: ( rule__ShortestPathTask__Group__3__Impl rule__ShortestPathTask__Group__4 )
            // InternalMyDsl.g:2567:2: rule__ShortestPathTask__Group__3__Impl rule__ShortestPathTask__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__ShortestPathTask__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShortestPathTask__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__Group__3"


    // $ANTLR start "rule__ShortestPathTask__Group__3__Impl"
    // InternalMyDsl.g:2574:1: rule__ShortestPathTask__Group__3__Impl : ( ( rule__ShortestPathTask__Group_3__0 )* ) ;
    public final void rule__ShortestPathTask__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2578:1: ( ( ( rule__ShortestPathTask__Group_3__0 )* ) )
            // InternalMyDsl.g:2579:1: ( ( rule__ShortestPathTask__Group_3__0 )* )
            {
            // InternalMyDsl.g:2579:1: ( ( rule__ShortestPathTask__Group_3__0 )* )
            // InternalMyDsl.g:2580:2: ( rule__ShortestPathTask__Group_3__0 )*
            {
             before(grammarAccess.getShortestPathTaskAccess().getGroup_3()); 
            // InternalMyDsl.g:2581:2: ( rule__ShortestPathTask__Group_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:2581:3: rule__ShortestPathTask__Group_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ShortestPathTask__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getShortestPathTaskAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__Group__3__Impl"


    // $ANTLR start "rule__ShortestPathTask__Group__4"
    // InternalMyDsl.g:2589:1: rule__ShortestPathTask__Group__4 : rule__ShortestPathTask__Group__4__Impl ;
    public final void rule__ShortestPathTask__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2593:1: ( rule__ShortestPathTask__Group__4__Impl )
            // InternalMyDsl.g:2594:2: rule__ShortestPathTask__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShortestPathTask__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__Group__4"


    // $ANTLR start "rule__ShortestPathTask__Group__4__Impl"
    // InternalMyDsl.g:2600:1: rule__ShortestPathTask__Group__4__Impl : ( ')' ) ;
    public final void rule__ShortestPathTask__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2604:1: ( ( ')' ) )
            // InternalMyDsl.g:2605:1: ( ')' )
            {
            // InternalMyDsl.g:2605:1: ( ')' )
            // InternalMyDsl.g:2606:2: ')'
            {
             before(grammarAccess.getShortestPathTaskAccess().getRightParenthesisKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getShortestPathTaskAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__Group__4__Impl"


    // $ANTLR start "rule__ShortestPathTask__Group_3__0"
    // InternalMyDsl.g:2616:1: rule__ShortestPathTask__Group_3__0 : rule__ShortestPathTask__Group_3__0__Impl rule__ShortestPathTask__Group_3__1 ;
    public final void rule__ShortestPathTask__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2620:1: ( rule__ShortestPathTask__Group_3__0__Impl rule__ShortestPathTask__Group_3__1 )
            // InternalMyDsl.g:2621:2: rule__ShortestPathTask__Group_3__0__Impl rule__ShortestPathTask__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__ShortestPathTask__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShortestPathTask__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__Group_3__0"


    // $ANTLR start "rule__ShortestPathTask__Group_3__0__Impl"
    // InternalMyDsl.g:2628:1: rule__ShortestPathTask__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ShortestPathTask__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2632:1: ( ( ',' ) )
            // InternalMyDsl.g:2633:1: ( ',' )
            {
            // InternalMyDsl.g:2633:1: ( ',' )
            // InternalMyDsl.g:2634:2: ','
            {
             before(grammarAccess.getShortestPathTaskAccess().getCommaKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getShortestPathTaskAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__Group_3__0__Impl"


    // $ANTLR start "rule__ShortestPathTask__Group_3__1"
    // InternalMyDsl.g:2643:1: rule__ShortestPathTask__Group_3__1 : rule__ShortestPathTask__Group_3__1__Impl ;
    public final void rule__ShortestPathTask__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2647:1: ( rule__ShortestPathTask__Group_3__1__Impl )
            // InternalMyDsl.g:2648:2: rule__ShortestPathTask__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShortestPathTask__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__Group_3__1"


    // $ANTLR start "rule__ShortestPathTask__Group_3__1__Impl"
    // InternalMyDsl.g:2654:1: rule__ShortestPathTask__Group_3__1__Impl : ( ( rule__ShortestPathTask__WaypointsAssignment_3_1 ) ) ;
    public final void rule__ShortestPathTask__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2658:1: ( ( ( rule__ShortestPathTask__WaypointsAssignment_3_1 ) ) )
            // InternalMyDsl.g:2659:1: ( ( rule__ShortestPathTask__WaypointsAssignment_3_1 ) )
            {
            // InternalMyDsl.g:2659:1: ( ( rule__ShortestPathTask__WaypointsAssignment_3_1 ) )
            // InternalMyDsl.g:2660:2: ( rule__ShortestPathTask__WaypointsAssignment_3_1 )
            {
             before(grammarAccess.getShortestPathTaskAccess().getWaypointsAssignment_3_1()); 
            // InternalMyDsl.g:2661:2: ( rule__ShortestPathTask__WaypointsAssignment_3_1 )
            // InternalMyDsl.g:2661:3: rule__ShortestPathTask__WaypointsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ShortestPathTask__WaypointsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getShortestPathTaskAccess().getWaypointsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__Group_3__1__Impl"


    // $ANTLR start "rule__ReturnToStartTask__Group__0"
    // InternalMyDsl.g:2670:1: rule__ReturnToStartTask__Group__0 : rule__ReturnToStartTask__Group__0__Impl rule__ReturnToStartTask__Group__1 ;
    public final void rule__ReturnToStartTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2674:1: ( rule__ReturnToStartTask__Group__0__Impl rule__ReturnToStartTask__Group__1 )
            // InternalMyDsl.g:2675:2: rule__ReturnToStartTask__Group__0__Impl rule__ReturnToStartTask__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__ReturnToStartTask__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReturnToStartTask__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnToStartTask__Group__0"


    // $ANTLR start "rule__ReturnToStartTask__Group__0__Impl"
    // InternalMyDsl.g:2682:1: rule__ReturnToStartTask__Group__0__Impl : ( () ) ;
    public final void rule__ReturnToStartTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2686:1: ( ( () ) )
            // InternalMyDsl.g:2687:1: ( () )
            {
            // InternalMyDsl.g:2687:1: ( () )
            // InternalMyDsl.g:2688:2: ()
            {
             before(grammarAccess.getReturnToStartTaskAccess().getReturnToStartTaskAction_0()); 
            // InternalMyDsl.g:2689:2: ()
            // InternalMyDsl.g:2689:3: 
            {
            }

             after(grammarAccess.getReturnToStartTaskAccess().getReturnToStartTaskAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnToStartTask__Group__0__Impl"


    // $ANTLR start "rule__ReturnToStartTask__Group__1"
    // InternalMyDsl.g:2697:1: rule__ReturnToStartTask__Group__1 : rule__ReturnToStartTask__Group__1__Impl ;
    public final void rule__ReturnToStartTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2701:1: ( rule__ReturnToStartTask__Group__1__Impl )
            // InternalMyDsl.g:2702:2: rule__ReturnToStartTask__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReturnToStartTask__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnToStartTask__Group__1"


    // $ANTLR start "rule__ReturnToStartTask__Group__1__Impl"
    // InternalMyDsl.g:2708:1: rule__ReturnToStartTask__Group__1__Impl : ( 'return to start' ) ;
    public final void rule__ReturnToStartTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2712:1: ( ( 'return to start' ) )
            // InternalMyDsl.g:2713:1: ( 'return to start' )
            {
            // InternalMyDsl.g:2713:1: ( 'return to start' )
            // InternalMyDsl.g:2714:2: 'return to start'
            {
             before(grammarAccess.getReturnToStartTaskAccess().getReturnToStartKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getReturnToStartTaskAccess().getReturnToStartKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnToStartTask__Group__1__Impl"


    // $ANTLR start "rule__TurtleBot__NameAssignment_1"
    // InternalMyDsl.g:2724:1: rule__TurtleBot__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TurtleBot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2728:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2729:2: ( ruleEString )
            {
            // InternalMyDsl.g:2729:2: ( ruleEString )
            // InternalMyDsl.g:2730:3: ruleEString
            {
             before(grammarAccess.getTurtleBotAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTurtleBotAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__NameAssignment_1"


    // $ANTLR start "rule__TurtleBot__AreaAssignment_3_2"
    // InternalMyDsl.g:2739:1: rule__TurtleBot__AreaAssignment_3_2 : ( ruleArea ) ;
    public final void rule__TurtleBot__AreaAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2743:1: ( ( ruleArea ) )
            // InternalMyDsl.g:2744:2: ( ruleArea )
            {
            // InternalMyDsl.g:2744:2: ( ruleArea )
            // InternalMyDsl.g:2745:3: ruleArea
            {
             before(grammarAccess.getTurtleBotAccess().getAreaAreaParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArea();

            state._fsp--;

             after(grammarAccess.getTurtleBotAccess().getAreaAreaParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__AreaAssignment_3_2"


    // $ANTLR start "rule__TurtleBot__WaypointtypesAssignment_7"
    // InternalMyDsl.g:2754:1: rule__TurtleBot__WaypointtypesAssignment_7 : ( ruleWaypointType ) ;
    public final void rule__TurtleBot__WaypointtypesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2758:1: ( ( ruleWaypointType ) )
            // InternalMyDsl.g:2759:2: ( ruleWaypointType )
            {
            // InternalMyDsl.g:2759:2: ( ruleWaypointType )
            // InternalMyDsl.g:2760:3: ruleWaypointType
            {
             before(grammarAccess.getTurtleBotAccess().getWaypointtypesWaypointTypeParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleWaypointType();

            state._fsp--;

             after(grammarAccess.getTurtleBotAccess().getWaypointtypesWaypointTypeParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__WaypointtypesAssignment_7"


    // $ANTLR start "rule__TurtleBot__WaypointtypesAssignment_8_1"
    // InternalMyDsl.g:2769:1: rule__TurtleBot__WaypointtypesAssignment_8_1 : ( ruleWaypointType ) ;
    public final void rule__TurtleBot__WaypointtypesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2773:1: ( ( ruleWaypointType ) )
            // InternalMyDsl.g:2774:2: ( ruleWaypointType )
            {
            // InternalMyDsl.g:2774:2: ( ruleWaypointType )
            // InternalMyDsl.g:2775:3: ruleWaypointType
            {
             before(grammarAccess.getTurtleBotAccess().getWaypointtypesWaypointTypeParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWaypointType();

            state._fsp--;

             after(grammarAccess.getTurtleBotAccess().getWaypointtypesWaypointTypeParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__WaypointtypesAssignment_8_1"


    // $ANTLR start "rule__TurtleBot__WaypointsAssignment_13"
    // InternalMyDsl.g:2784:1: rule__TurtleBot__WaypointsAssignment_13 : ( ruleWayPoint ) ;
    public final void rule__TurtleBot__WaypointsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2788:1: ( ( ruleWayPoint ) )
            // InternalMyDsl.g:2789:2: ( ruleWayPoint )
            {
            // InternalMyDsl.g:2789:2: ( ruleWayPoint )
            // InternalMyDsl.g:2790:3: ruleWayPoint
            {
             before(grammarAccess.getTurtleBotAccess().getWaypointsWayPointParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleWayPoint();

            state._fsp--;

             after(grammarAccess.getTurtleBotAccess().getWaypointsWayPointParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__WaypointsAssignment_13"


    // $ANTLR start "rule__TurtleBot__WaypointsAssignment_14_1"
    // InternalMyDsl.g:2799:1: rule__TurtleBot__WaypointsAssignment_14_1 : ( ruleWayPoint ) ;
    public final void rule__TurtleBot__WaypointsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2803:1: ( ( ruleWayPoint ) )
            // InternalMyDsl.g:2804:2: ( ruleWayPoint )
            {
            // InternalMyDsl.g:2804:2: ( ruleWayPoint )
            // InternalMyDsl.g:2805:3: ruleWayPoint
            {
             before(grammarAccess.getTurtleBotAccess().getWaypointsWayPointParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWayPoint();

            state._fsp--;

             after(grammarAccess.getTurtleBotAccess().getWaypointsWayPointParserRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__WaypointsAssignment_14_1"


    // $ANTLR start "rule__TurtleBot__Bot_startAssignment_18"
    // InternalMyDsl.g:2814:1: rule__TurtleBot__Bot_startAssignment_18 : ( ( ruleEString ) ) ;
    public final void rule__TurtleBot__Bot_startAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2818:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:2819:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2819:2: ( ( ruleEString ) )
            // InternalMyDsl.g:2820:3: ( ruleEString )
            {
             before(grammarAccess.getTurtleBotAccess().getBot_startWayPointCrossReference_18_0()); 
            // InternalMyDsl.g:2821:3: ( ruleEString )
            // InternalMyDsl.g:2822:4: ruleEString
            {
             before(grammarAccess.getTurtleBotAccess().getBot_startWayPointEStringParserRuleCall_18_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTurtleBotAccess().getBot_startWayPointEStringParserRuleCall_18_0_1()); 

            }

             after(grammarAccess.getTurtleBotAccess().getBot_startWayPointCrossReference_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Bot_startAssignment_18"


    // $ANTLR start "rule__TurtleBot__MissionsAssignment_19_3"
    // InternalMyDsl.g:2833:1: rule__TurtleBot__MissionsAssignment_19_3 : ( ruleMission ) ;
    public final void rule__TurtleBot__MissionsAssignment_19_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2837:1: ( ( ruleMission ) )
            // InternalMyDsl.g:2838:2: ( ruleMission )
            {
            // InternalMyDsl.g:2838:2: ( ruleMission )
            // InternalMyDsl.g:2839:3: ruleMission
            {
             before(grammarAccess.getTurtleBotAccess().getMissionsMissionParserRuleCall_19_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMission();

            state._fsp--;

             after(grammarAccess.getTurtleBotAccess().getMissionsMissionParserRuleCall_19_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__MissionsAssignment_19_3"


    // $ANTLR start "rule__TurtleBot__MissionsAssignment_19_4_1"
    // InternalMyDsl.g:2848:1: rule__TurtleBot__MissionsAssignment_19_4_1 : ( ruleMission ) ;
    public final void rule__TurtleBot__MissionsAssignment_19_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2852:1: ( ( ruleMission ) )
            // InternalMyDsl.g:2853:2: ( ruleMission )
            {
            // InternalMyDsl.g:2853:2: ( ruleMission )
            // InternalMyDsl.g:2854:3: ruleMission
            {
             before(grammarAccess.getTurtleBotAccess().getMissionsMissionParserRuleCall_19_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMission();

            state._fsp--;

             after(grammarAccess.getTurtleBotAccess().getMissionsMissionParserRuleCall_19_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__MissionsAssignment_19_4_1"


    // $ANTLR start "rule__Area__XmaxAssignment_4"
    // InternalMyDsl.g:2863:1: rule__Area__XmaxAssignment_4 : ( ruleEInt ) ;
    public final void rule__Area__XmaxAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2867:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:2868:2: ( ruleEInt )
            {
            // InternalMyDsl.g:2868:2: ( ruleEInt )
            // InternalMyDsl.g:2869:3: ruleEInt
            {
             before(grammarAccess.getAreaAccess().getXmaxEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAreaAccess().getXmaxEIntParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__XmaxAssignment_4"


    // $ANTLR start "rule__Area__YmaxAssignment_8"
    // InternalMyDsl.g:2878:1: rule__Area__YmaxAssignment_8 : ( ruleEInt ) ;
    public final void rule__Area__YmaxAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2882:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:2883:2: ( ruleEInt )
            {
            // InternalMyDsl.g:2883:2: ( ruleEInt )
            // InternalMyDsl.g:2884:3: ruleEInt
            {
             before(grammarAccess.getAreaAccess().getYmaxEIntParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAreaAccess().getYmaxEIntParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__YmaxAssignment_8"


    // $ANTLR start "rule__WaypointType__NameAssignment_1"
    // InternalMyDsl.g:2893:1: rule__WaypointType__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__WaypointType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2897:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2898:2: ( ruleEString )
            {
            // InternalMyDsl.g:2898:2: ( ruleEString )
            // InternalMyDsl.g:2899:3: ruleEString
            {
             before(grammarAccess.getWaypointTypeAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWaypointTypeAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaypointType__NameAssignment_1"


    // $ANTLR start "rule__WayPoint__WaypointtypesAssignment_0"
    // InternalMyDsl.g:2908:1: rule__WayPoint__WaypointtypesAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__WayPoint__WaypointtypesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2912:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:2913:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2913:2: ( ( ruleEString ) )
            // InternalMyDsl.g:2914:3: ( ruleEString )
            {
             before(grammarAccess.getWayPointAccess().getWaypointtypesWaypointTypeCrossReference_0_0()); 
            // InternalMyDsl.g:2915:3: ( ruleEString )
            // InternalMyDsl.g:2916:4: ruleEString
            {
             before(grammarAccess.getWayPointAccess().getWaypointtypesWaypointTypeEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWayPointAccess().getWaypointtypesWaypointTypeEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getWayPointAccess().getWaypointtypesWaypointTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__WaypointtypesAssignment_0"


    // $ANTLR start "rule__WayPoint__WaypointtypesAssignment_1_1"
    // InternalMyDsl.g:2927:1: rule__WayPoint__WaypointtypesAssignment_1_1 : ( ( ruleEString ) ) ;
    public final void rule__WayPoint__WaypointtypesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2931:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:2932:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2932:2: ( ( ruleEString ) )
            // InternalMyDsl.g:2933:3: ( ruleEString )
            {
             before(grammarAccess.getWayPointAccess().getWaypointtypesWaypointTypeCrossReference_1_1_0()); 
            // InternalMyDsl.g:2934:3: ( ruleEString )
            // InternalMyDsl.g:2935:4: ruleEString
            {
             before(grammarAccess.getWayPointAccess().getWaypointtypesWaypointTypeEStringParserRuleCall_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWayPointAccess().getWaypointtypesWaypointTypeEStringParserRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getWayPointAccess().getWaypointtypesWaypointTypeCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__WaypointtypesAssignment_1_1"


    // $ANTLR start "rule__WayPoint__NameAssignment_2"
    // InternalMyDsl.g:2946:1: rule__WayPoint__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__WayPoint__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2950:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2951:2: ( ruleEString )
            {
            // InternalMyDsl.g:2951:2: ( ruleEString )
            // InternalMyDsl.g:2952:3: ruleEString
            {
             before(grammarAccess.getWayPointAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWayPointAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__NameAssignment_2"


    // $ANTLR start "rule__WayPoint__Coord_xAssignment_6"
    // InternalMyDsl.g:2961:1: rule__WayPoint__Coord_xAssignment_6 : ( ruleEInt ) ;
    public final void rule__WayPoint__Coord_xAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2965:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:2966:2: ( ruleEInt )
            {
            // InternalMyDsl.g:2966:2: ( ruleEInt )
            // InternalMyDsl.g:2967:3: ruleEInt
            {
             before(grammarAccess.getWayPointAccess().getCoord_xEIntParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getWayPointAccess().getCoord_xEIntParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Coord_xAssignment_6"


    // $ANTLR start "rule__WayPoint__Coord_yAssignment_10"
    // InternalMyDsl.g:2976:1: rule__WayPoint__Coord_yAssignment_10 : ( ruleEInt ) ;
    public final void rule__WayPoint__Coord_yAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2980:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:2981:2: ( ruleEInt )
            {
            // InternalMyDsl.g:2981:2: ( ruleEInt )
            // InternalMyDsl.g:2982:3: ruleEInt
            {
             before(grammarAccess.getWayPointAccess().getCoord_yEIntParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getWayPointAccess().getCoord_yEIntParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Coord_yAssignment_10"


    // $ANTLR start "rule__Mission__NameAssignment_0"
    // InternalMyDsl.g:2991:1: rule__Mission__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Mission__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2995:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2996:2: ( ruleEString )
            {
            // InternalMyDsl.g:2996:2: ( ruleEString )
            // InternalMyDsl.g:2997:3: ruleEString
            {
             before(grammarAccess.getMissionAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__NameAssignment_0"


    // $ANTLR start "rule__Mission__TaskAssignment_2"
    // InternalMyDsl.g:3006:1: rule__Mission__TaskAssignment_2 : ( ruleTask ) ;
    public final void rule__Mission__TaskAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3010:1: ( ( ruleTask ) )
            // InternalMyDsl.g:3011:2: ( ruleTask )
            {
            // InternalMyDsl.g:3011:2: ( ruleTask )
            // InternalMyDsl.g:3012:3: ruleTask
            {
             before(grammarAccess.getMissionAccess().getTaskTaskParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getTaskTaskParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__TaskAssignment_2"


    // $ANTLR start "rule__Mission__TaskAssignment_3_1"
    // InternalMyDsl.g:3021:1: rule__Mission__TaskAssignment_3_1 : ( ruleTask ) ;
    public final void rule__Mission__TaskAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3025:1: ( ( ruleTask ) )
            // InternalMyDsl.g:3026:2: ( ruleTask )
            {
            // InternalMyDsl.g:3026:2: ( ruleTask )
            // InternalMyDsl.g:3027:3: ruleTask
            {
             before(grammarAccess.getMissionAccess().getTaskTaskParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getTaskTaskParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__TaskAssignment_3_1"


    // $ANTLR start "rule__LineTask__WaypointsAssignment_2"
    // InternalMyDsl.g:3036:1: rule__LineTask__WaypointsAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__LineTask__WaypointsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3040:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:3041:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:3041:2: ( ( ruleEString ) )
            // InternalMyDsl.g:3042:3: ( ruleEString )
            {
             before(grammarAccess.getLineTaskAccess().getWaypointsWayPointCrossReference_2_0()); 
            // InternalMyDsl.g:3043:3: ( ruleEString )
            // InternalMyDsl.g:3044:4: ruleEString
            {
             before(grammarAccess.getLineTaskAccess().getWaypointsWayPointEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLineTaskAccess().getWaypointsWayPointEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getLineTaskAccess().getWaypointsWayPointCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__WaypointsAssignment_2"


    // $ANTLR start "rule__LineTask__WaypointsAssignment_3_1"
    // InternalMyDsl.g:3055:1: rule__LineTask__WaypointsAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__LineTask__WaypointsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3059:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:3060:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:3060:2: ( ( ruleEString ) )
            // InternalMyDsl.g:3061:3: ( ruleEString )
            {
             before(grammarAccess.getLineTaskAccess().getWaypointsWayPointCrossReference_3_1_0()); 
            // InternalMyDsl.g:3062:3: ( ruleEString )
            // InternalMyDsl.g:3063:4: ruleEString
            {
             before(grammarAccess.getLineTaskAccess().getWaypointsWayPointEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLineTaskAccess().getWaypointsWayPointEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getLineTaskAccess().getWaypointsWayPointCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__WaypointsAssignment_3_1"


    // $ANTLR start "rule__ShortestPathTask__WaypointsAssignment_2"
    // InternalMyDsl.g:3074:1: rule__ShortestPathTask__WaypointsAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__ShortestPathTask__WaypointsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3078:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:3079:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:3079:2: ( ( ruleEString ) )
            // InternalMyDsl.g:3080:3: ( ruleEString )
            {
             before(grammarAccess.getShortestPathTaskAccess().getWaypointsWayPointCrossReference_2_0()); 
            // InternalMyDsl.g:3081:3: ( ruleEString )
            // InternalMyDsl.g:3082:4: ruleEString
            {
             before(grammarAccess.getShortestPathTaskAccess().getWaypointsWayPointEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getShortestPathTaskAccess().getWaypointsWayPointEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getShortestPathTaskAccess().getWaypointsWayPointCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__WaypointsAssignment_2"


    // $ANTLR start "rule__ShortestPathTask__WaypointsAssignment_3_1"
    // InternalMyDsl.g:3093:1: rule__ShortestPathTask__WaypointsAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ShortestPathTask__WaypointsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3097:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:3098:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:3098:2: ( ( ruleEString ) )
            // InternalMyDsl.g:3099:3: ( ruleEString )
            {
             before(grammarAccess.getShortestPathTaskAccess().getWaypointsWayPointCrossReference_3_1_0()); 
            // InternalMyDsl.g:3100:3: ( ruleEString )
            // InternalMyDsl.g:3101:4: ruleEString
            {
             before(grammarAccess.getShortestPathTaskAccess().getWaypointsWayPointEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getShortestPathTaskAccess().getWaypointsWayPointEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getShortestPathTaskAccess().getWaypointsWayPointCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__WaypointsAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001080000L});

}