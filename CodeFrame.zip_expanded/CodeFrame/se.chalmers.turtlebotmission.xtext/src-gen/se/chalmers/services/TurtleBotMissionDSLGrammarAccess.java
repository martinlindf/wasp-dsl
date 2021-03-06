/*
 * generated by Xtext 2.10.0
 */
package se.chalmers.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class TurtleBotMissionDSLGrammarAccess extends AbstractGrammarElementFinder {
	
	public class TurtleBotElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "se.chalmers.TurtleBotMissionDSL.TurtleBot");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTurtleBotKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cBot_startKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBot_startAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cBot_startWayPointCrossReference_4_0 = (CrossReference)cBot_startAssignment_4.eContents().get(0);
		private final RuleCall cBot_startWayPointEStringParserRuleCall_4_0_1 = (RuleCall)cBot_startWayPointCrossReference_4_0.eContents().get(1);
		private final Keyword cAreaKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cAreaAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cAreaAreaParserRuleCall_6_0 = (RuleCall)cAreaAssignment_6.eContents().get(0);
		private final Keyword cWaypointtypesKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cLeftCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cWaypointtypesAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cWaypointtypesWaypointTypeParserRuleCall_9_0 = (RuleCall)cWaypointtypesAssignment_9.eContents().get(0);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cCommaKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Assignment cWaypointtypesAssignment_10_1 = (Assignment)cGroup_10.eContents().get(1);
		private final RuleCall cWaypointtypesWaypointTypeParserRuleCall_10_1_0 = (RuleCall)cWaypointtypesAssignment_10_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Keyword cWaypointsKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Keyword cLeftCurlyBracketKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Assignment cWaypointsAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cWaypointsWayPointParserRuleCall_14_0 = (RuleCall)cWaypointsAssignment_14.eContents().get(0);
		private final Group cGroup_15 = (Group)cGroup.eContents().get(15);
		private final Keyword cCommaKeyword_15_0 = (Keyword)cGroup_15.eContents().get(0);
		private final Assignment cWaypointsAssignment_15_1 = (Assignment)cGroup_15.eContents().get(1);
		private final RuleCall cWaypointsWayPointParserRuleCall_15_1_0 = (RuleCall)cWaypointsAssignment_15_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Group cGroup_17 = (Group)cGroup.eContents().get(17);
		private final Keyword cMissionsKeyword_17_0 = (Keyword)cGroup_17.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_17_1 = (Keyword)cGroup_17.eContents().get(1);
		private final Assignment cMissionsAssignment_17_2 = (Assignment)cGroup_17.eContents().get(2);
		private final RuleCall cMissionsMissionParserRuleCall_17_2_0 = (RuleCall)cMissionsAssignment_17_2.eContents().get(0);
		private final Group cGroup_17_3 = (Group)cGroup_17.eContents().get(3);
		private final Keyword cCommaKeyword_17_3_0 = (Keyword)cGroup_17_3.eContents().get(0);
		private final Assignment cMissionsAssignment_17_3_1 = (Assignment)cGroup_17_3.eContents().get(1);
		private final RuleCall cMissionsMissionParserRuleCall_17_3_1_0 = (RuleCall)cMissionsAssignment_17_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_17_4 = (Keyword)cGroup_17.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_18 = (Keyword)cGroup.eContents().get(18);
		
		//TurtleBot:
		//	'TurtleBot'
		//	name=EString
		//	'{'
		//	'bot_start' bot_start=[WayPoint|EString]
		//	'area' area=Area
		//	'waypointtypes' '{' waypointtypes+=WaypointType ("," waypointtypes+=WaypointType)* '}'
		//	'waypoints' '{' waypoints+=WayPoint ("," waypoints+=WayPoint)* '}' ('missions' '{' missions+=Mission (","
		//	missions+=Mission)* '}')?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'TurtleBot' name=EString '{' 'bot_start' bot_start=[WayPoint|EString] 'area' area=Area 'waypointtypes' '{'
		//waypointtypes+=WaypointType ("," waypointtypes+=WaypointType)* '}' 'waypoints' '{' waypoints+=WayPoint (","
		//waypoints+=WayPoint)* '}' ('missions' '{' missions+=Mission ("," missions+=Mission)* '}')? '}'
		public Group getGroup() { return cGroup; }
		
		//'TurtleBot'
		public Keyword getTurtleBotKeyword_0() { return cTurtleBotKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'bot_start'
		public Keyword getBot_startKeyword_3() { return cBot_startKeyword_3; }
		
		//bot_start=[WayPoint|EString]
		public Assignment getBot_startAssignment_4() { return cBot_startAssignment_4; }
		
		//[WayPoint|EString]
		public CrossReference getBot_startWayPointCrossReference_4_0() { return cBot_startWayPointCrossReference_4_0; }
		
		//EString
		public RuleCall getBot_startWayPointEStringParserRuleCall_4_0_1() { return cBot_startWayPointEStringParserRuleCall_4_0_1; }
		
		//'area'
		public Keyword getAreaKeyword_5() { return cAreaKeyword_5; }
		
		//area=Area
		public Assignment getAreaAssignment_6() { return cAreaAssignment_6; }
		
		//Area
		public RuleCall getAreaAreaParserRuleCall_6_0() { return cAreaAreaParserRuleCall_6_0; }
		
		//'waypointtypes'
		public Keyword getWaypointtypesKeyword_7() { return cWaypointtypesKeyword_7; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_8() { return cLeftCurlyBracketKeyword_8; }
		
		//waypointtypes+=WaypointType
		public Assignment getWaypointtypesAssignment_9() { return cWaypointtypesAssignment_9; }
		
		//WaypointType
		public RuleCall getWaypointtypesWaypointTypeParserRuleCall_9_0() { return cWaypointtypesWaypointTypeParserRuleCall_9_0; }
		
		//("," waypointtypes+=WaypointType)*
		public Group getGroup_10() { return cGroup_10; }
		
		//","
		public Keyword getCommaKeyword_10_0() { return cCommaKeyword_10_0; }
		
		//waypointtypes+=WaypointType
		public Assignment getWaypointtypesAssignment_10_1() { return cWaypointtypesAssignment_10_1; }
		
		//WaypointType
		public RuleCall getWaypointtypesWaypointTypeParserRuleCall_10_1_0() { return cWaypointtypesWaypointTypeParserRuleCall_10_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_11() { return cRightCurlyBracketKeyword_11; }
		
		//'waypoints'
		public Keyword getWaypointsKeyword_12() { return cWaypointsKeyword_12; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_13() { return cLeftCurlyBracketKeyword_13; }
		
		//waypoints+=WayPoint
		public Assignment getWaypointsAssignment_14() { return cWaypointsAssignment_14; }
		
		//WayPoint
		public RuleCall getWaypointsWayPointParserRuleCall_14_0() { return cWaypointsWayPointParserRuleCall_14_0; }
		
		//("," waypoints+=WayPoint)*
		public Group getGroup_15() { return cGroup_15; }
		
		//","
		public Keyword getCommaKeyword_15_0() { return cCommaKeyword_15_0; }
		
		//waypoints+=WayPoint
		public Assignment getWaypointsAssignment_15_1() { return cWaypointsAssignment_15_1; }
		
		//WayPoint
		public RuleCall getWaypointsWayPointParserRuleCall_15_1_0() { return cWaypointsWayPointParserRuleCall_15_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_16() { return cRightCurlyBracketKeyword_16; }
		
		//('missions' '{' missions+=Mission ("," missions+=Mission)* '}')?
		public Group getGroup_17() { return cGroup_17; }
		
		//'missions'
		public Keyword getMissionsKeyword_17_0() { return cMissionsKeyword_17_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_17_1() { return cLeftCurlyBracketKeyword_17_1; }
		
		//missions+=Mission
		public Assignment getMissionsAssignment_17_2() { return cMissionsAssignment_17_2; }
		
		//Mission
		public RuleCall getMissionsMissionParserRuleCall_17_2_0() { return cMissionsMissionParserRuleCall_17_2_0; }
		
		//("," missions+=Mission)*
		public Group getGroup_17_3() { return cGroup_17_3; }
		
		//","
		public Keyword getCommaKeyword_17_3_0() { return cCommaKeyword_17_3_0; }
		
		//missions+=Mission
		public Assignment getMissionsAssignment_17_3_1() { return cMissionsAssignment_17_3_1; }
		
		//Mission
		public RuleCall getMissionsMissionParserRuleCall_17_3_1_0() { return cMissionsMissionParserRuleCall_17_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_17_4() { return cRightCurlyBracketKeyword_17_4; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_18() { return cRightCurlyBracketKeyword_18; }
	}
	public class TaskElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "se.chalmers.TurtleBotMissionDSL.Task");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cLineTaskParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cShortestPathTaskParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cReturnToStartTaskParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Task:
		//	LineTask | ShortestPathTask | ReturnToStartTask;
		@Override public ParserRule getRule() { return rule; }
		
		//LineTask | ShortestPathTask | ReturnToStartTask
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//LineTask
		public RuleCall getLineTaskParserRuleCall_0() { return cLineTaskParserRuleCall_0; }
		
		//ShortestPathTask
		public RuleCall getShortestPathTaskParserRuleCall_1() { return cShortestPathTaskParserRuleCall_1; }
		
		//ReturnToStartTask
		public RuleCall getReturnToStartTaskParserRuleCall_2() { return cReturnToStartTaskParserRuleCall_2; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "se.chalmers.TurtleBotMissionDSL.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class AreaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "se.chalmers.TurtleBotMissionDSL.Area");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cAreaAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cAreaKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cXmaxKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cXmaxAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cXmaxEIntParserRuleCall_3_1_0 = (RuleCall)cXmaxAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cYmaxKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cYmaxAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cYmaxEIntParserRuleCall_4_1_0 = (RuleCall)cYmaxAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Area:
		//	{Area}
		//	'Area'
		//	'{' ('xmax' xmax=EInt)? ('ymax' ymax=EInt)?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Area} 'Area' '{' ('xmax' xmax=EInt)? ('ymax' ymax=EInt)? '}'
		public Group getGroup() { return cGroup; }
		
		//{Area}
		public Action getAreaAction_0() { return cAreaAction_0; }
		
		//'Area'
		public Keyword getAreaKeyword_1() { return cAreaKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('xmax' xmax=EInt)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'xmax'
		public Keyword getXmaxKeyword_3_0() { return cXmaxKeyword_3_0; }
		
		//xmax=EInt
		public Assignment getXmaxAssignment_3_1() { return cXmaxAssignment_3_1; }
		
		//EInt
		public RuleCall getXmaxEIntParserRuleCall_3_1_0() { return cXmaxEIntParserRuleCall_3_1_0; }
		
		//('ymax' ymax=EInt)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'ymax'
		public Keyword getYmaxKeyword_4_0() { return cYmaxKeyword_4_0; }
		
		//ymax=EInt
		public Assignment getYmaxAssignment_4_1() { return cYmaxAssignment_4_1; }
		
		//EInt
		public RuleCall getYmaxEIntParserRuleCall_4_1_0() { return cYmaxEIntParserRuleCall_4_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class WaypointTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "se.chalmers.TurtleBotMissionDSL.WaypointType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cWaypointTypeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cWaypointTypeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//WaypointType:
		//	{WaypointType}
		//	'WaypointType'
		//	name=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//{WaypointType} 'WaypointType' name=EString
		public Group getGroup() { return cGroup; }
		
		//{WaypointType}
		public Action getWaypointTypeAction_0() { return cWaypointTypeAction_0; }
		
		//'WaypointType'
		public Keyword getWaypointTypeKeyword_1() { return cWaypointTypeKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
	}
	public class WayPointElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "se.chalmers.TurtleBotMissionDSL.WayPoint");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWayPointKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCoord_xKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cCoord_xAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cCoord_xEIntParserRuleCall_3_1_0 = (RuleCall)cCoord_xAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCoord_yKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cCoord_yAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cCoord_yEIntParserRuleCall_4_1_0 = (RuleCall)cCoord_yAssignment_4_1.eContents().get(0);
		private final Keyword cWaypointtypesKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cLeftParenthesisKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cWaypointtypesAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final CrossReference cWaypointtypesWaypointTypeCrossReference_7_0 = (CrossReference)cWaypointtypesAssignment_7.eContents().get(0);
		private final RuleCall cWaypointtypesWaypointTypeEStringParserRuleCall_7_0_1 = (RuleCall)cWaypointtypesWaypointTypeCrossReference_7_0.eContents().get(1);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cCommaKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cWaypointtypesAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final CrossReference cWaypointtypesWaypointTypeCrossReference_8_1_0 = (CrossReference)cWaypointtypesAssignment_8_1.eContents().get(0);
		private final RuleCall cWaypointtypesWaypointTypeEStringParserRuleCall_8_1_0_1 = (RuleCall)cWaypointtypesWaypointTypeCrossReference_8_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//WayPoint:
		//	'WayPoint'
		//	name=EString
		//	'{' ('coord_x' coord_x=EInt)? ('coord_y' coord_y=EInt)?
		//	'waypointtypes' '(' waypointtypes+=[WaypointType|EString] ("," waypointtypes+=[WaypointType|EString])* ')'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'WayPoint' name=EString '{' ('coord_x' coord_x=EInt)? ('coord_y' coord_y=EInt)? 'waypointtypes' '('
		//waypointtypes+=[WaypointType|EString] ("," waypointtypes+=[WaypointType|EString])* ')' '}'
		public Group getGroup() { return cGroup; }
		
		//'WayPoint'
		public Keyword getWayPointKeyword_0() { return cWayPointKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('coord_x' coord_x=EInt)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'coord_x'
		public Keyword getCoord_xKeyword_3_0() { return cCoord_xKeyword_3_0; }
		
		//coord_x=EInt
		public Assignment getCoord_xAssignment_3_1() { return cCoord_xAssignment_3_1; }
		
		//EInt
		public RuleCall getCoord_xEIntParserRuleCall_3_1_0() { return cCoord_xEIntParserRuleCall_3_1_0; }
		
		//('coord_y' coord_y=EInt)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'coord_y'
		public Keyword getCoord_yKeyword_4_0() { return cCoord_yKeyword_4_0; }
		
		//coord_y=EInt
		public Assignment getCoord_yAssignment_4_1() { return cCoord_yAssignment_4_1; }
		
		//EInt
		public RuleCall getCoord_yEIntParserRuleCall_4_1_0() { return cCoord_yEIntParserRuleCall_4_1_0; }
		
		//'waypointtypes'
		public Keyword getWaypointtypesKeyword_5() { return cWaypointtypesKeyword_5; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_6() { return cLeftParenthesisKeyword_6; }
		
		//waypointtypes+=[WaypointType|EString]
		public Assignment getWaypointtypesAssignment_7() { return cWaypointtypesAssignment_7; }
		
		//[WaypointType|EString]
		public CrossReference getWaypointtypesWaypointTypeCrossReference_7_0() { return cWaypointtypesWaypointTypeCrossReference_7_0; }
		
		//EString
		public RuleCall getWaypointtypesWaypointTypeEStringParserRuleCall_7_0_1() { return cWaypointtypesWaypointTypeEStringParserRuleCall_7_0_1; }
		
		//("," waypointtypes+=[WaypointType|EString])*
		public Group getGroup_8() { return cGroup_8; }
		
		//","
		public Keyword getCommaKeyword_8_0() { return cCommaKeyword_8_0; }
		
		//waypointtypes+=[WaypointType|EString]
		public Assignment getWaypointtypesAssignment_8_1() { return cWaypointtypesAssignment_8_1; }
		
		//[WaypointType|EString]
		public CrossReference getWaypointtypesWaypointTypeCrossReference_8_1_0() { return cWaypointtypesWaypointTypeCrossReference_8_1_0; }
		
		//EString
		public RuleCall getWaypointtypesWaypointTypeEStringParserRuleCall_8_1_0_1() { return cWaypointtypesWaypointTypeEStringParserRuleCall_8_1_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_9() { return cRightParenthesisKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
	}
	public class MissionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "se.chalmers.TurtleBotMissionDSL.Mission");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMissionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cTaskKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cTaskAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cTaskTaskParserRuleCall_5_0 = (RuleCall)cTaskAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cCommaKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cTaskAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cTaskTaskParserRuleCall_6_1_0 = (RuleCall)cTaskAssignment_6_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Mission:
		//	'Mission'
		//	name=EString
		//	'{'
		//	'task' '{' task+=Task ("," task+=Task)* '}'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Mission' name=EString '{' 'task' '{' task+=Task ("," task+=Task)* '}' '}'
		public Group getGroup() { return cGroup; }
		
		//'Mission'
		public Keyword getMissionKeyword_0() { return cMissionKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'task'
		public Keyword getTaskKeyword_3() { return cTaskKeyword_3; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//task+=Task
		public Assignment getTaskAssignment_5() { return cTaskAssignment_5; }
		
		//Task
		public RuleCall getTaskTaskParserRuleCall_5_0() { return cTaskTaskParserRuleCall_5_0; }
		
		//("," task+=Task)*
		public Group getGroup_6() { return cGroup_6; }
		
		//","
		public Keyword getCommaKeyword_6_0() { return cCommaKeyword_6_0; }
		
		//task+=Task
		public Assignment getTaskAssignment_6_1() { return cTaskAssignment_6_1; }
		
		//Task
		public RuleCall getTaskTaskParserRuleCall_6_1_0() { return cTaskTaskParserRuleCall_6_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}
	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "se.chalmers.TurtleBotMissionDSL.EInt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//EInt ecore::EInt:
		//	'-'? INT
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}
	public class LineTaskElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "se.chalmers.TurtleBotMissionDSL.LineTask");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLineTaskKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cWaypointsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cWaypointsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cWaypointsWayPointCrossReference_4_0 = (CrossReference)cWaypointsAssignment_4.eContents().get(0);
		private final RuleCall cWaypointsWayPointEStringParserRuleCall_4_0_1 = (RuleCall)cWaypointsWayPointCrossReference_4_0.eContents().get(1);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cWaypointsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final CrossReference cWaypointsWayPointCrossReference_5_1_0 = (CrossReference)cWaypointsAssignment_5_1.eContents().get(0);
		private final RuleCall cWaypointsWayPointEStringParserRuleCall_5_1_0_1 = (RuleCall)cWaypointsWayPointCrossReference_5_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//LineTask:
		//	'LineTask'
		//	'{'
		//	'waypoints' '(' waypoints+=[WayPoint|EString] ("," waypoints+=[WayPoint|EString])* ')'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'LineTask' '{' 'waypoints' '(' waypoints+=[WayPoint|EString] ("," waypoints+=[WayPoint|EString])* ')' '}'
		public Group getGroup() { return cGroup; }
		
		//'LineTask'
		public Keyword getLineTaskKeyword_0() { return cLineTaskKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'waypoints'
		public Keyword getWaypointsKeyword_2() { return cWaypointsKeyword_2; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_3() { return cLeftParenthesisKeyword_3; }
		
		//waypoints+=[WayPoint|EString]
		public Assignment getWaypointsAssignment_4() { return cWaypointsAssignment_4; }
		
		//[WayPoint|EString]
		public CrossReference getWaypointsWayPointCrossReference_4_0() { return cWaypointsWayPointCrossReference_4_0; }
		
		//EString
		public RuleCall getWaypointsWayPointEStringParserRuleCall_4_0_1() { return cWaypointsWayPointEStringParserRuleCall_4_0_1; }
		
		//("," waypoints+=[WayPoint|EString])*
		public Group getGroup_5() { return cGroup_5; }
		
		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//waypoints+=[WayPoint|EString]
		public Assignment getWaypointsAssignment_5_1() { return cWaypointsAssignment_5_1; }
		
		//[WayPoint|EString]
		public CrossReference getWaypointsWayPointCrossReference_5_1_0() { return cWaypointsWayPointCrossReference_5_1_0; }
		
		//EString
		public RuleCall getWaypointsWayPointEStringParserRuleCall_5_1_0_1() { return cWaypointsWayPointEStringParserRuleCall_5_1_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_6() { return cRightParenthesisKeyword_6; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class ShortestPathTaskElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "se.chalmers.TurtleBotMissionDSL.ShortestPathTask");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cShortestPathTaskKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cWaypointsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cWaypointsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cWaypointsWayPointCrossReference_4_0 = (CrossReference)cWaypointsAssignment_4.eContents().get(0);
		private final RuleCall cWaypointsWayPointEStringParserRuleCall_4_0_1 = (RuleCall)cWaypointsWayPointCrossReference_4_0.eContents().get(1);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cWaypointsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final CrossReference cWaypointsWayPointCrossReference_5_1_0 = (CrossReference)cWaypointsAssignment_5_1.eContents().get(0);
		private final RuleCall cWaypointsWayPointEStringParserRuleCall_5_1_0_1 = (RuleCall)cWaypointsWayPointCrossReference_5_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//ShortestPathTask:
		//	'ShortestPathTask'
		//	'{'
		//	'waypoints' '(' waypoints+=[WayPoint|EString] ("," waypoints+=[WayPoint|EString])* ')'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'ShortestPathTask' '{' 'waypoints' '(' waypoints+=[WayPoint|EString] ("," waypoints+=[WayPoint|EString])* ')' '}'
		public Group getGroup() { return cGroup; }
		
		//'ShortestPathTask'
		public Keyword getShortestPathTaskKeyword_0() { return cShortestPathTaskKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'waypoints'
		public Keyword getWaypointsKeyword_2() { return cWaypointsKeyword_2; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_3() { return cLeftParenthesisKeyword_3; }
		
		//waypoints+=[WayPoint|EString]
		public Assignment getWaypointsAssignment_4() { return cWaypointsAssignment_4; }
		
		//[WayPoint|EString]
		public CrossReference getWaypointsWayPointCrossReference_4_0() { return cWaypointsWayPointCrossReference_4_0; }
		
		//EString
		public RuleCall getWaypointsWayPointEStringParserRuleCall_4_0_1() { return cWaypointsWayPointEStringParserRuleCall_4_0_1; }
		
		//("," waypoints+=[WayPoint|EString])*
		public Group getGroup_5() { return cGroup_5; }
		
		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//waypoints+=[WayPoint|EString]
		public Assignment getWaypointsAssignment_5_1() { return cWaypointsAssignment_5_1; }
		
		//[WayPoint|EString]
		public CrossReference getWaypointsWayPointCrossReference_5_1_0() { return cWaypointsWayPointCrossReference_5_1_0; }
		
		//EString
		public RuleCall getWaypointsWayPointEStringParserRuleCall_5_1_0_1() { return cWaypointsWayPointEStringParserRuleCall_5_1_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_6() { return cRightParenthesisKeyword_6; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class ReturnToStartTaskElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "se.chalmers.TurtleBotMissionDSL.ReturnToStartTask");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cReturnToStartTaskAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cReturnToStartTaskKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//ReturnToStartTask:
		//	{ReturnToStartTask}
		//	'ReturnToStartTask';
		@Override public ParserRule getRule() { return rule; }
		
		//{ReturnToStartTask} 'ReturnToStartTask'
		public Group getGroup() { return cGroup; }
		
		//{ReturnToStartTask}
		public Action getReturnToStartTaskAction_0() { return cReturnToStartTaskAction_0; }
		
		//'ReturnToStartTask'
		public Keyword getReturnToStartTaskKeyword_1() { return cReturnToStartTaskKeyword_1; }
	}
	
	
	private final TurtleBotElements pTurtleBot;
	private final TaskElements pTask;
	private final EStringElements pEString;
	private final AreaElements pArea;
	private final WaypointTypeElements pWaypointType;
	private final WayPointElements pWayPoint;
	private final MissionElements pMission;
	private final EIntElements pEInt;
	private final LineTaskElements pLineTask;
	private final ShortestPathTaskElements pShortestPathTask;
	private final ReturnToStartTaskElements pReturnToStartTask;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public TurtleBotMissionDSLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pTurtleBot = new TurtleBotElements();
		this.pTask = new TaskElements();
		this.pEString = new EStringElements();
		this.pArea = new AreaElements();
		this.pWaypointType = new WaypointTypeElements();
		this.pWayPoint = new WayPointElements();
		this.pMission = new MissionElements();
		this.pEInt = new EIntElements();
		this.pLineTask = new LineTaskElements();
		this.pShortestPathTask = new ShortestPathTaskElements();
		this.pReturnToStartTask = new ReturnToStartTaskElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("se.chalmers.TurtleBotMissionDSL".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//TurtleBot:
	//	'TurtleBot'
	//	name=EString
	//	'{'
	//	'bot_start' bot_start=[WayPoint|EString]
	//	'area' area=Area
	//	'waypointtypes' '{' waypointtypes+=WaypointType ("," waypointtypes+=WaypointType)* '}'
	//	'waypoints' '{' waypoints+=WayPoint ("," waypoints+=WayPoint)* '}' ('missions' '{' missions+=Mission (","
	//	missions+=Mission)* '}')?
	//	'}';
	public TurtleBotElements getTurtleBotAccess() {
		return pTurtleBot;
	}
	
	public ParserRule getTurtleBotRule() {
		return getTurtleBotAccess().getRule();
	}
	
	//Task:
	//	LineTask | ShortestPathTask | ReturnToStartTask;
	public TaskElements getTaskAccess() {
		return pTask;
	}
	
	public ParserRule getTaskRule() {
		return getTaskAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//Area:
	//	{Area}
	//	'Area'
	//	'{' ('xmax' xmax=EInt)? ('ymax' ymax=EInt)?
	//	'}';
	public AreaElements getAreaAccess() {
		return pArea;
	}
	
	public ParserRule getAreaRule() {
		return getAreaAccess().getRule();
	}
	
	//WaypointType:
	//	{WaypointType}
	//	'WaypointType'
	//	name=EString;
	public WaypointTypeElements getWaypointTypeAccess() {
		return pWaypointType;
	}
	
	public ParserRule getWaypointTypeRule() {
		return getWaypointTypeAccess().getRule();
	}
	
	//WayPoint:
	//	'WayPoint'
	//	name=EString
	//	'{' ('coord_x' coord_x=EInt)? ('coord_y' coord_y=EInt)?
	//	'waypointtypes' '(' waypointtypes+=[WaypointType|EString] ("," waypointtypes+=[WaypointType|EString])* ')'
	//	'}';
	public WayPointElements getWayPointAccess() {
		return pWayPoint;
	}
	
	public ParserRule getWayPointRule() {
		return getWayPointAccess().getRule();
	}
	
	//Mission:
	//	'Mission'
	//	name=EString
	//	'{'
	//	'task' '{' task+=Task ("," task+=Task)* '}'
	//	'}';
	public MissionElements getMissionAccess() {
		return pMission;
	}
	
	public ParserRule getMissionRule() {
		return getMissionAccess().getRule();
	}
	
	//EInt ecore::EInt:
	//	'-'? INT
	public EIntElements getEIntAccess() {
		return pEInt;
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}
	
	//LineTask:
	//	'LineTask'
	//	'{'
	//	'waypoints' '(' waypoints+=[WayPoint|EString] ("," waypoints+=[WayPoint|EString])* ')'
	//	'}';
	public LineTaskElements getLineTaskAccess() {
		return pLineTask;
	}
	
	public ParserRule getLineTaskRule() {
		return getLineTaskAccess().getRule();
	}
	
	//ShortestPathTask:
	//	'ShortestPathTask'
	//	'{'
	//	'waypoints' '(' waypoints+=[WayPoint|EString] ("," waypoints+=[WayPoint|EString])* ')'
	//	'}';
	public ShortestPathTaskElements getShortestPathTaskAccess() {
		return pShortestPathTask;
	}
	
	public ParserRule getShortestPathTaskRule() {
		return getShortestPathTaskAccess().getRule();
	}
	
	//ReturnToStartTask:
	//	{ReturnToStartTask}
	//	'ReturnToStartTask';
	public ReturnToStartTaskElements getReturnToStartTaskAccess() {
		return pReturnToStartTask;
	}
	
	public ParserRule getReturnToStartTaskRule() {
		return getReturnToStartTaskAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
