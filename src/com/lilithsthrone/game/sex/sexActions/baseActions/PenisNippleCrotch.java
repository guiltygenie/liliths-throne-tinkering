package com.lilithsthrone.game.sex.sexActions.baseActions;

import com.lilithsthrone.game.character.GameCharacter;
import com.lilithsthrone.game.character.attributes.CorruptionLevel;
import com.lilithsthrone.game.character.body.valueEnums.BreastShape;
import com.lilithsthrone.game.character.body.valueEnums.OrificeModifier;
import com.lilithsthrone.game.dialogue.utils.UtilText;
import com.lilithsthrone.game.sex.ArousalIncrease;
import com.lilithsthrone.game.sex.SexAreaOrifice;
import com.lilithsthrone.game.sex.SexAreaPenetration;
import com.lilithsthrone.game.sex.SexPace;
import com.lilithsthrone.game.sex.SexParticipantType;
import com.lilithsthrone.game.sex.sexActions.SexAction;
import com.lilithsthrone.game.sex.sexActions.SexActionType;
import com.lilithsthrone.main.Main;
import com.lilithsthrone.utils.Util;
import com.lilithsthrone.utils.Util.Value;

/**
 * @since 0.3.1
 * @version 0.3.1
 * @author Innoxia
 */
public class PenisNippleCrotch {

	private static String getNippleTitle(GameCharacter character) {
		if(character.getBreastCrotchShape()==BreastShape.UDDERS) {
			return "udder-nipple";
		} else {
			return "crotch-nipple";
		}
	}
	
	public static final SexAction TEASE_PENIS_OVER_NIPPLE_CROTCH = new SexAction(
			SexActionType.REQUIRES_NO_PENETRATION_AND_EXPOSED,
			ArousalIncrease.THREE_NORMAL,
			ArousalIncrease.THREE_NORMAL,
			CorruptionLevel.ONE_VANILLA,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.PENIS, SexAreaOrifice.NIPPLE_CROTCH)),
			SexParticipantType.NORMAL) {
		
		@Override
		public String getActionTitle() {
			return "Cock-tease "+getNippleTitle(Main.sex.getCharacterTargetedForSexAction(this));
		}

		@Override
		public String getActionDescription() {
			return "Tease [npc2.name] by sliding the [npc.cockHead] of your [npc.cock] over [npc2.her] [npc2.crotchNipple+].";
		}

		@Override
		public boolean isBaseRequirementsMet() {
			return Main.sex.getSexPace(Main.sex.getCharacterPerformingAction())!=SexPace.SUB_RESISTING
					&& Main.game.isNipplePenEnabled()
					&& Main.sex.getCharacterTargetedForSexAction(this).hasBreastsCrotch()
					&& Main.sex.getCharacterTargetedForSexAction(this).isBreastCrotchFuckableNipplePenetration()
					&& !this.isForbiddenArea(SexAreaPenetration.PENIS, SexAreaOrifice.NIPPLE_CROTCH);
		}

		@Override
		public String getDescription() {
			UtilText.nodeContentSB.setLength(0);
			
			switch(Main.sex.getSexPace(Main.sex.getCharacterPerformingAction())) {
				case DOM_GENTLE:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"Guiding [npc.her] [npc.cock+] up to [npc2.namePos] [npc2.crotchBoobs+],"
									+ " [npc.name] [npc.verb(start)] slowly teasing the [npc.cockTip+] up and down over ones of [npc2.her] [npc2.crotchNipples+], ready to penetrate [npc2.herHim] at any moment.",

							"With a soft [npc.moan], [npc.name] [npc.verb(guide)] [npc.her] [npc.cock+] up to [npc2.namePos] [npc2.crotchBoobs+],"
									+ " before starting to gently slide the [npc.cockTip] up and down over one of [npc2.her] [npc2.crotchNipples+].",

							"Gently sliding the [npc.cockTip+] of [npc.her] [npc.cock] up and down over [npc2.namePos] [npc2.crotchNipple+],"
									+ " [npc.name] [npc.verb(let)] out a soft [npc.moan] at the thought of being able to penetrate [npc2.herHim] whenever [npc.she] [npc.verb(feel)] like it."));
					break;
				case DOM_NORMAL:
				case SUB_EAGER:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"Guiding [npc.her] [npc.cock+] up to [npc2.namePos] [npc2.crotchBoobs+],"
									+ " [npc.name] [npc.verb(start)] eagerly sliding the [npc.cockTip+] up and down over one of [npc2.her] [npc2.crotchNipples+], ready to penetrate [npc2.herHim] at any moment.",

							"With [npc.a_moan+], [npc.name] [npc.verb(guide)] [npc.her] [npc.cock+] up to [npc2.namePos] [npc2.crotchBoobs+],"
									+ " before starting to eagerly slide the [npc.cockTip] up and down over one of [npc2.her] [npc2.crotchNipples+].",

							"Eagerly sliding the [npc.cockTip+] of [npc.her] [npc.cock] up and down over [npc2.namePos] [npc2.crotchNipple+],"
									+ " [npc.name] [npc.verb(let)] out [npc.a_moan+] at the thought of being able to penetrate [npc2.herHim] whenever [npc.she] [npc.verb(feel)] like it."));
					break;
				case DOM_ROUGH:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"Grinding [npc.her] [npc.cock+] up against [npc2.namePos] [npc2.crotchBoobs+],"
									+ " [npc.name] [npc.verb(pull)] back a little before starting to slide the [npc.cockTip+] up and down over one of [npc2.her] [npc2.crotchNipples+], ready to start fucking [npc2.herHim] at any moment.",

							"With [npc.a_moan+], [npc.name] [npc.verb(line)] [npc.her] [npc.cock+] up to [npc2.namePos] [npc2.crotchBoobs+],"
									+ " before starting to roughly [npc2.verb(grind)] the [npc.cockTip] up and down over one of [npc2.her] [npc2.crotchNipples+].",

							"Roughly grinding the [npc.cockTip+] of [npc.her] [npc.cock] up and down over [npc2.namePos] [npc2.crotchNipple+],"
									+ " [npc.name] [npc.verb(let)] out [npc.a_moan+] at the thought of being able to start fucking [npc2.herHim] whenever [npc.she] [npc.verb(feel)] like it."));
					break;
				case SUB_NORMAL:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"Guiding [npc.her] [npc.cock+] up to [npc2.namePos] [npc2.crotchBoobs+],"
									+ " [npc.name] [npc.verb(start)] sliding the [npc.cockTip+] up and down over one of [npc2.her] [npc2.crotchNipples+], ready to penetrate [npc2.herHim] at any moment.",

							"With [npc.a_moan+], [npc.name] [npc.verb(guide)] [npc.her] [npc.cock+] up to [npc2.namePos] [npc2.crotchBoobs+], before starting to slide the [npc.cockTip] up and down over one of [npc2.her] [npc2.crotchNipples+].",

							"Sliding the [npc.cockTip+] of [npc.her] [npc.cock] up and down over [npc2.namePos] [npc2.crotchNipple+],"
									+ " [npc.name] [npc.verb(let)] out [npc.a_moan+] at the thought of being able to penetrate [npc2.herHim] whenever [npc.she] [npc.verb(feel)] like it."));
					break;
				default:
					break;
			}

			if(!isTargetedCharacterInanimate()) {
				switch(Main.sex.getSexPace(Main.sex.getCharacterTargetedForSexAction(this))) {
					case DOM_GENTLE:
						UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
								" A soft [npc2.moan] drifts out from between [npc2.namePos] [npc2.lips+] as [npc2.she] feels [npc2.her] [npc2.crotchNipple+] being stimulated,"
										+ " and [npc2.she] gently [npc2.verb(push)] [npc2.her] stomach out against [npc.namePos] [npc.cock].",
	
								" [npc2.Name] [npc2.verb(let)] out a soft [npc2.moan], before gently pushing [npc2.her] [npc2.crotchNipple+] out against [npc.namePos] [npc.cock].",
	
								" [npc2.Name] [npc2.moanVerb] in delight as [npc2.she] [npc2.verb(feel)] [npc.namePos] [npc.cock] stimulating [npc2.her] [npc2.crotchNipple+], and gently [npc2.verb(push)] [npc.her] stomach out in response."));
						break;
					case DOM_NORMAL:
					case SUB_EAGER:
						UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
								" [npc2.A_moan+] bursts out from between [npc2.namePos] [npc2.lips+] as [npc2.she] feels [npc2.her] [npc2.crotchNipple+] being stimulated,"
										+ " and [npc2.she] eagerly [npc2.verb(push)] [npc2.her] stomach out against [npc.namePos] [npc.cock].",
	
								" [npc2.Name] [npc2.verb(let)] out a desperate [npc2.moan], before eagerly thrusting [npc2.her] stomach out against [npc.namePos] [npc.cock].",
	
								" [npc2.Name] [npc2.moanVerb] in delight as [npc2.she] [npc2.verb(feel)] [npc.namePos] [npc.cock] stimulating [npc2.her] [npc2.crotchNipple+], and desperately [npc2.verb(thrust)] [npc.her] stomach out in response."));
						break;
					case DOM_ROUGH:
						UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
								" [npc2.A_moan+] bursts out from between [npc2.namePos] [npc2.lips+] as [npc2.she] feels [npc2.her] [npc2.crotchNipple+] being stimulated,"
										+ " and [npc2.she] forcefully [npc2.verb(thrust)] [npc2.her] stomach out against [npc.namePos] [npc.cock].",
	
								" [npc2.Name] [npc2.verb(let)] out a desperate [npc2.moan], before roughly thrusting [npc2.her] stomach out against [npc.namePos] [npc.cock].",
	
								" [npc2.Name] [npc2.moanVerb] in delight as [npc2.she] [npc2.verb(feel)] [npc.namePos] [npc.cock] stimulating [npc2.her] [npc2.crotchNipple+], and violently [npc2.verb(thrust)] [npc.her] stomach out in response."));
						break;
					case SUB_NORMAL:
						UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
								" [npc2.A_moan+] bursts out from between [npc2.namePos] [npc2.lips+] as [npc2.she] feels [npc2.her] [npc2.crotchNipple+] being stimulated,"
										+ " and [npc2.she] [npc2.verb(push)] [npc2.her] stomach out against [npc.namePos] [npc.cock].",
	
								" [npc2.Name] [npc2.verb(let)] out a [npc2.moan], before thrusting [npc2.her] stomach out against [npc.namePos] [npc.cock].",
	
								" [npc2.Name] [npc2.moanVerb] in delight as [npc2.she] [npc2.verb(feel)] [npc.namePos] [npc.cock] stimulating [npc2.her] [npc2.crotchNipple+], and [npc2.verb(thrust)] [npc.her] stomach out in response."));
						break;
					case SUB_RESISTING:
						if(Main.sex.getCharacterTargetedForSexAction(this).isNippleCrotchVirgin()) {
							if(Main.sex.getCharacterTargetedForSexAction(this).isMute()) {
								UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
										" [npc2.A_sob+] bursts out from between [npc2.namePos] [npc2.lips+] at the thought of being about to lose [npc2.her] nipple virginity.",
										" [npc2.Name] [npc2.verb(let)] out a desperate [npc2.sob] as [npc2.she] [npc2.verb(realise)] that [npc2.she] might be about to lose [npc2.her] nipple virginity.",
										" [npc2.Name] [npc2.sobVerb] in distress at the thought of losing [npc2.her] nipple virginity to [npc.namePos] [npc.cock+]."));
								
							} else {
								UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
										" [npc2.A_sob+] bursts out from between [npc2.namePos] [npc2.lips+] at the thought of what's about to happen, [npc2.speech(No! Stop! I've never had my nipples fucked before!)]",
										" [npc2.Name] [npc2.verb(let)] out a desperate [npc2.sob], before pleading, [npc2.speech(Please! Don't do this! My nipples haven't been fucked before!)]",
										" [npc2.Name] [npc2.sobsVerb] in distress at the thought of what's about to happen, before desperately begging, [npc2.speech(No! Stop! I don't want to lose my nipple virginity!)]"));
							}
							
						} else {
							if(Main.sex.getCharacterTargetedForSexAction(this).isMute()) {
								UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
										" [npc2.A_sob+] bursts out from between [npc2.namePos] [npc2.lips+] as [npc2.she] [npc2.verb(try)] to pull [npc2.her] [npc2.crotchNipple(true)] away from [npc.namePos] [npc.cock].",
										" [npc2.Name] [npc2.verb(let)] out a desperate [npc2.sob] as [npc2.she] [npc2.verb(struggle)] against [npc.name].",
										" [npc2.Name] [npc2.sobVerb] in distress as [npc2.she] [npc2.verb(try)] to pull away from [npc.namePos] [npc.cock+]."));
								
							} else {
								UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
										" [npc2.A_sob+] bursts out from between [npc2.namePos] [npc2.lips+] as [npc2.she] [npc2.verb(try)] to pull [npc2.her] [npc2.crotchNipple] away from [npc.namePos] [npc.cock],"
												+ " [npc2.speech(No! Don't! Please, get away from me!)]",
										" [npc2.Name] [npc2.verb(let)] out a desperate [npc2.sob], before pleading, [npc2.speech(Please! Don't do this! Leave me alone!)]",
										" [npc2.Name] [npc2.sobsVerb] in distress as [npc2.she] [npc2.verb(beg)], [npc2.speech(No! Stop! Get away from there!)]"));
							}
						}
						break;
					default:
						break;
				}
			}
			
			return UtilText.nodeContentSB.toString();
				
		}
		
		@Override
		public void applyEffects() {
			Main.sex.transferLubrication(Main.sex.getCharacterPerformingAction(), SexAreaPenetration.PENIS, Main.sex.getCharacterTargetedForSexAction(this), SexAreaOrifice.NIPPLE_CROTCH);
		}
	};
	
	public static final SexAction FORCE_PENIS_OVER_NIPPLE_CROTCH = new SexAction(
			SexActionType.REQUIRES_NO_PENETRATION_AND_EXPOSED,
			ArousalIncrease.THREE_NORMAL,
			ArousalIncrease.THREE_NORMAL,
			CorruptionLevel.ONE_VANILLA,
			Util.newHashMapOfValues(new Value<>(SexAreaOrifice.NIPPLE_CROTCH, SexAreaPenetration.PENIS)),
			SexParticipantType.NORMAL) {
		
		@Override
		public String getActionTitle() {
			return Util.capitaliseSentence(getNippleTitle(Main.sex.getCharacterTargetedForSexAction(this)))+" tease";
		}

		@Override
		public String getActionDescription() {
			return "Tease [npc2.name] by sliding the [npc2.cockTip] of [npc2.her] [npc2.cock] over your [npc.crotchNipple+].";
		}

		@Override
		public boolean isBaseRequirementsMet() {
			return Main.sex.getSexPace(Main.sex.getCharacterPerformingAction()) != SexPace.SUB_RESISTING
					&& Main.game.isNipplePenEnabled()
					&& Main.sex.getCharacterPerformingAction().hasBreastsCrotch()
					&& Main.sex.getCharacterPerformingAction().isBreastCrotchFuckableNipplePenetration()
					&& !this.isForbiddenArea(SexAreaOrifice.NIPPLE_CROTCH, SexAreaPenetration.PENIS);
		}

		@Override
		public String getDescription() {
			UtilText.nodeContentSB.setLength(0);
			
			switch(Main.sex.getSexPace(Main.sex.getCharacterPerformingAction())) {
				case DOM_GENTLE:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"[npc.Name] [npc.verb(grab)] [npc2.namePos] [npc2.cock+], before guiding it up to [npc.her] [npc.crotchBoobs+]."
									+ " Slowly pushing the [npc2.cockTip+] up and down over [npc.her] [npc.crotchNipple+], [npc.she] [npc.verb(tease)] [npc2.name] with the promise of penetration at any moment.",

							"With a soft [npc.moan], [npc.name] [npc.verb(grab)] [npc2.namePos] [npc2.cock+] and [npc.verb(guide)] it up to [npc.her] [npc.crotchBoobs+],"
									+ " before starting to gently slide the [npc2.cockTip] up and down over [npc.her] [npc.crotchNipple+].",

							"Grabbing [npc2.namePos] [npc2.cock+], [npc.name] gently [npc.verb(slide)] the [npc2.cockTip+] over [npc.her] [npc.crotchNipple+],"
									+ " letting out a soft [npc.moan] as [npc.she] [npc.verb(tease)] [npc2.herHim] with the promise of penetration."));
					break;
				case DOM_NORMAL:
				case SUB_EAGER:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"[npc.Name] [npc.verb(grab)] [npc2.namePos] [npc2.cock+], before guiding it up to [npc.her] [npc.crotchBoobs+]."
									+ " Eagerly pushing the [npc2.cockTip+] up and down over [npc.her] [npc.crotchNipple+], [npc.she] [npc.verb(tease)] [npc2.name] with the promise of penetration at any moment.",

							"With [npc.a_moan+], [npc.name] [npc.verb(grab)] [npc2.namePos] [npc2.cock+] and [npc.verb(guide)] it up to [npc.her] [npc.crotchBoobs+],"
									+ " before starting to eagerly slide the [npc2.cockTip] up and down over [npc.her] [npc.crotchNipple+].",

							"Grabbing [npc2.namePos] [npc2.cock+], [npc.name] eagerly [npc.verb(slide)] the [npc2.cockTip+] over [npc.her] [npc.crotchNipple+],"
									+ " letting out [npc.a_moan+] as [npc.she] [npc.verb(tease)] [npc2.herHim] with the promise of penetration."));
					break;
				case DOM_ROUGH:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"[npc.Name] [npc.verb(grab)] [npc2.namePos] [npc2.cock+], before yanking it up to [npc.her] [npc.crotchBoobs+]."
									+ " Roughly forcing the [npc2.cockTip+] up and down over [npc.her] [npc.crotchNipple+], [npc.she] [npc.verb(tease)] [npc2.name] with the promise of penetration at any moment.",

							"With [npc.a_moan+], [npc.name] [npc.verb(grab)] [npc2.namePos] [npc2.cock+] and yank it up to [npc.her] [npc.crotchBoobs+],"
									+ " before starting to roughly [npc.verb(force)] the [npc2.cockTip] up and down over [npc.her] [npc.crotchNipple+].",

							"Grabbing [npc2.namePos] [npc2.cock+], [npc.name] roughly [npc.verb(grind)] the [npc2.cockTip+] over [npc.her] [npc.crotchNipple+],"
									+ " letting out [npc.a_moan+] as [npc.she] [npc.verb(tease)] [npc2.herHim] with the promise of penetration."));
					break;
				case SUB_NORMAL:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"[npc.Name] [npc.verb(grab)] [npc2.namePos] [npc2.cock+], before guiding it up to [npc.her] [npc.crotchBoobs+]."
									+ " Pushing the [npc2.cockTip+] up and down over [npc.her] [npc.crotchNipple+], [npc.she] [npc.verb(tease)] [npc2.name] with the promise of penetration at any moment.",

							"With [npc.a_moan+], [npc.name] [npc.verb(grab)] [npc2.namePos] [npc2.cock+] and [npc.verb(guide)] it up to [npc.her] [npc.crotchBoobs+],"
									+ " before starting to slide the [npc2.cockTip] up and down over [npc.her] [npc.crotchNipple+].",

							"Grabbing [npc2.namePos] [npc2.cock+], [npc.name] [npc.verb(slide)] the [npc2.cockTip+] over [npc.her] [npc.crotchNipple+],"
									+ " letting out [npc.a_moan+] as [npc.she] [npc.verb(tease)] [npc2.herHim] with the promise of penetration."));
					break;
				default:
					break;
			}

			if(!isTargetedCharacterInanimate()) {
				switch(Main.sex.getSexPace(Main.sex.getCharacterTargetedForSexAction(this))) {
					case DOM_GENTLE:
						UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
								" A soft [npc2.moan] drifts out from between [npc2.namePos] [npc2.lips+], and [npc2.she] [npc2.verb(start)] gently rubbing [npc2.her] [npc2.her] [npc2.cock] up and down over [npc.namePos] [npc.crotchNipple+].",
	
								" [npc2.Name] [npc2.verb(let)] out a soft [npc2.moan], before gently sliding [npc2.her] [npc2.cock] back and forth over [npc.namePos] [npc.crotchNipple+].",
	
								" [npc2.Name] [npc2.moansVerb] in delight as [npc2.she] [npc2.verb(feel)] [npc2.her] [npc2.cock] being stimulated, and, needing no further encouragement,"
										+ " [npc2.she] [npc2.verb(start)] gently sliding [npc2.her] [npc2.her] [npc2.cock] up and down over [npc.namePos] [npc.crotchNipple+]."));
						break;
					case DOM_ROUGH:
						UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
								" [npc2.A_moan+] bursts out from between [npc2.namePos] [npc2.lips+], and [npc2.she] [npc2.verb(start)] roughly grinding [npc2.her] [npc2.her] [npc2.cock] up and down over [npc.namePos] [npc.crotchNipple+].",
	
								" [npc2.Name] [npc2.verb(let)] out [npc2.a_moan+], before forcefully grinding [npc2.her] [npc2.cock] back and forth over [npc.namePos] [npc.crotchNipple+].",
	
								" [npc2.Name] [npc2.moansVerb] in delight as [npc2.she] [npc2.verb(feel)] [npc2.her] [npc2.cock] being stimulated, and, seeking to remind [npc.name] who's in charge,"
										+ " [npc2.she] [npc2.verb(start)] roughly grinding [npc2.her] [npc2.her] [npc2.cock] up and down over [npc.her] [npc.crotchNipple+]."));
						break;
					case SUB_EAGER:
					case DOM_NORMAL:
						UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
								" [npc2.A_moan+] bursts out from between [npc2.namePos] [npc2.lips+], and [npc2.she] [npc2.verb(start)] enthusiastically rubbing [npc2.her] [npc2.her] [npc2.cock] up and down over [npc.namePos] [npc.crotchNipple+].",
	
								" [npc2.Name] [npc2.verb(let)] out a desperate [npc2.moan], before eagerly sliding [npc2.her] [npc2.cock] back and forth over [npc.namePos] [npc.crotchNipple+].",
	
								" [npc2.Name] [npc2.moansVerb] in delight as [npc2.she] [npc2.verb(feel)] [npc2.her] [npc2.cock] being stimulated, and, needing no further encouragement,"
										+ " [npc2.she] [npc2.verb(start)] eagerly sliding [npc2.her] [npc2.her] [npc2.cock] up and down over [npc.namePos] [npc.crotchNipple+]."));
						break;
					case SUB_NORMAL:
						UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
								" [npc2.A_moan+] bursts out from between [npc2.namePos] [npc2.lips+], and [npc2.she] [npc2.verb(start)] rubbing [npc2.her] [npc2.her] [npc2.cock] up and down over [npc.namePos] [npc.crotchNipple+].",
	
								" [npc2.Name] [npc2.verb(let)] out a desperate [npc2.moan], before sliding [npc2.her] [npc2.cock] back and forth over [npc.namePos] [npc.crotchNipple+].",
	
								" [npc2.Name] [npc2.moansVerb] in delight as [npc2.she] [npc2.verb(feel)] [npc2.her] [npc2.cock] being stimulated, and, needing no further encouragement,"
										+ " [npc2.she] [npc2.verb(start)] sliding [npc2.her] [npc2.her] [npc2.cock] up and down over [npc.namePos] [npc.crotchNipple+]."));
						break;
					case SUB_RESISTING:
						UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
								" [npc2.A_sob+] bursts out from between [npc2.namePos] [npc2.lips+] as [npc2.she] [npc2.verb(try)] to pull [npc2.her] [npc2.cock+] away from [npc.namePos] [npc.crotchNipple+].",
	
								" [npc2.Name] [npc2.verb(let)] out a desperate [npc2.sob], before frantically trying to pull [npc2.her] [npc2.cock+] away from [npc.namePos] [npc.labia+].",
	
								" [npc2.Name] [npc2.sobsVerb] in distress as [npc2.she] [npc2.verb(beg)] [npc.name] to let go of [npc2.her] [npc2.cock]."));
						break;
				}
			}
			
			return UtilText.nodeContentSB.toString();
				
		}
		
		@Override
		public void applyEffects() {
			Main.sex.transferLubrication(Main.sex.getCharacterTargetedForSexAction(this), SexAreaPenetration.PENIS, Main.sex.getCharacterPerformingAction(), SexAreaOrifice.NIPPLE_CROTCH);
		}
	};
	
	
	public static final SexAction PENIS_FUCKING_START = new SexAction(
			SexActionType.START_ONGOING,
			ArousalIncrease.FOUR_HIGH,
			ArousalIncrease.FOUR_HIGH,
			CorruptionLevel.ONE_VANILLA,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.PENIS, SexAreaOrifice.NIPPLE_CROTCH)),
			SexParticipantType.NORMAL) {

		@Override
		public boolean isBaseRequirementsMet() {
			return Main.sex.getCharacterTargetedForSexAction(this).hasBreastsCrotch();
		}
		
		@Override
		public String getActionTitle() {
			return "Fuck [npc2.her] "+getNippleTitle(Main.sex.getCharacterTargetedForSexAction(this));
		}

		@Override
		public String getActionDescription() {
			return "Sink your [npc.cock+] into [npc2.namePos] [npc2.crotchNipple+] and start fucking [npc2.herHim].";
		}

		@Override
		public String getDescription() {
			
			UtilText.nodeContentSB.setLength(0);
			
			switch(Main.sex.getSexPace(Main.sex.getCharacterPerformingAction())) {
				case DOM_GENTLE:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"Slowly teasing the [npc.cockTip+] of [npc.her] [npc.cock] over [npc2.namePos] [npc2.crotchBoobs+],"
									+ " [npc.name] [npc.verb(let)] out a little [npc.moan] before slowly pushing forwards, sinking [npc.her] [npc.cock+] into [npc2.her] [npc2.crotchNipple+].",

							"[npc.Name] [npc.verb(position)] the [npc.cockTip+] of [npc.her] [npc.cock] over [npc2.namePos] [npc2.crotchBoobs+],"
									+ " and with a slow, steady pressure, [npc.she] gently [npc.verb(sink)] it deep into [npc2.her] [npc2.crotchNipple+]."));
					break;
				case DOM_NORMAL:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"Eagerly teasing the [npc.cockTip+] of [npc.her] [npc.cock] over [npc2.namePos] [npc2.crotchBoobs+],"
									+ " [npc.name] [npc.verb(let)] out [npc.a_moan+] before thrusting forwards, greedily sinking [npc.her] [npc.cock+] into [npc2.her] [npc2.crotchNipple+].",

							"[npc.Name] [npc.verb(position)] the [npc.cockTip+] of [npc.her] [npc.cock] over [npc2.namePos] [npc2.crotchBoobs+], "
									+ "and with a determined thrust, [npc.she] eagerly [npc.verb(sink)] it deep into [npc2.her] [npc2.crotchNipple+]."));
					break;
				case DOM_ROUGH:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"Roughly grinding the [npc.cockTip+] of [npc.her] [npc.cock] over [npc2.namePos] [npc2.crotchBoobs+],"
									+ " [npc.name] [npc.verb(let)] out [npc.a_moan+] before violently slamming forwards, forcing [npc.her] [npc.cock+] deep into [npc2.her] [npc2.crotchNipple+].",

							"[npc.Name] [npc.verb(position)] the [npc.cockTip+] of [npc.her] [npc.cock] over [npc2.namePos] [npc2.crotchBoobs+],"
									+ " and with a forceful thrust, [npc.she] roughly [npc.verb(slam)] it deep into [npc2.her] [npc2.crotchNipple+]."));
					break;
				case SUB_EAGER:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"Eagerly teasing the [npc.cockTip+] of [npc.her] [npc.cock] over [npc2.namePos] [npc2.crotchBoobs+],"
									+ " [npc.name] [npc.verb(let)] out [npc.a_moan+] before thrusting forwards, greedily sinking [npc.her] [npc.cock+] into [npc2.her] [npc2.crotchNipple+].",

							"[npc.Name] [npc.verb(position)] the [npc.cockTip+] of [npc.her] [npc.cock] over [npc2.namePos] [npc2.crotchBoobs+],"
									+ " and with a determined thrust, [npc.she] eagerly [npc.verb(sink)] it deep into [npc2.her] [npc2.crotchNipple+]."));
					break;
				case SUB_NORMAL:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"Teasing the [npc.cockTip+] of [npc.her] [npc.cock] over [npc2.namePos] [npc2.crotchBoobs+],"
									+ " [npc.name] [npc.verb(let)] out [npc.a_moan+] before thrusting forwards, sinking [npc.her] [npc.cock+] into [npc2.her] [npc2.crotchNipple+].",

							"[npc.Name] [npc.verb(position)] the [npc.cockTip+] of [npc.her] [npc.cock] over [npc2.namePos] [npc2.crotchBoobs+],"
									+ " and with a little thrust, [npc.she] [npc.verb(sink)] it deep into [npc2.her] [npc2.crotchNipple+]."));
					break;
				default:
					break;
			}

			if(!isTargetedCharacterInanimate()) {
				switch(Main.sex.getSexPace(Main.sex.getCharacterTargetedForSexAction(this))) {
					case DOM_GENTLE:
						UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
								" [npc2.Name] [npc2.verb(let)] out a soft [npc2.moan] as the [npc.cock+] enters [npc2.herHim],"
										+ " before gently thrusting out [npc2.her] stomach in order to sink it even deeper into [npc2.her] [npc2.crotchBoob+].",
	
								" With a soft [npc2.moan], [npc2.name] gently [npc2.verb(push)] out [npc2.her] stomach,"
										+ " sinking [npc.namePos] [npc.cock+] even deeper into [npc2.her] [npc2.crotchNipple+]."));
						break;
					case DOM_ROUGH:
						UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
								" [npc2.Name] [npc2.verb(let)] out [npc2.a_moan+] as the [npc.cock+] enters [npc2.herHim],"
										+ " before violently thrusting out [npc2.her] stomach in order to force it even deeper into [npc2.her] [npc2.crotchBoob+].",
	
								" With [npc2.a_moan+], [npc2.name] violently [npc2.verb(push)] out [npc2.her] stomach,"
										+ " roughly forcing [npc.name] to sink [npc.her] [npc.cock+] even deeper into [npc2.her] [npc2.crotchNipple+]."));
						break;
					case DOM_NORMAL:
					case SUB_EAGER:
						UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
								" [npc2.Name] [npc2.verb(let)] out [npc2.a_moan+] as the [npc.cock+] enters [npc2.herHim],"
										+ " before eagerly pushing out [npc2.her] stomach in order to sink it even deeper into [npc2.her] [npc2.crotchBoob+].",
	
								" With [npc2.a_moan+], [npc2.name] eagerly [npc2.verb(push)] out [npc2.her] stomach,"
										+ " desperately helping to sink [npc.namePos] [npc.cock+] even deeper into [npc2.her] [npc2.crotchNipple+]."));
						break;
					case SUB_NORMAL:
						UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
								" [npc2.Name] [npc2.verb(let)] out [npc2.a_moan+] as the [npc.cock+] enters [npc2.herHim],"
										+ " before pushing out [npc2.her] stomach in order to sink it even deeper into [npc2.her] [npc2.crotchBoob+].",
	
								" With [npc2.a_moan+], [npc2.name] [npc2.verb(push)] out [npc2.her] stomach,"
										+ " helping to sink [npc.namePos] [npc.cock+] even deeper into [npc2.her] [npc2.crotchNipple+]."));
						break;
					case SUB_RESISTING:
						UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
								" [npc2.Name] [npc2.verb(let)] out [npc2.a_sob+] as the [npc.cock+] enters [npc2.herHim],"
										+ " and, with tears running down [npc2.her] [npc2.face], [npc2.she] [npc2.verb(beg)] for [npc.name] to pull out.",
	
								" With [npc2.a_sob+], [npc2.name] [npc2.verb(try)], in vain, to pull away from the unwanted penetration,"
										+ " tears running down [npc2.her] [npc2.face] as [npc.namePos] unwelcome [npc.cock] pushes deep into [npc2.her] [npc2.crotchNipple+]."));
						break;
					default:
						break;
				}
			}
			
			return UtilText.nodeContentSB.toString();
		}
		
	};
	
	private static String getTargetedCharacterResponse(SexAction action) {
		if(!action.isTargetedCharacterInanimate()) {
			switch(Main.sex.getSexPace(Main.sex.getCharacterTargetedForSexAction(action))) {
				case SUB_EAGER:
				case DOM_NORMAL:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							" [npc2.Name] eagerly [npc2.verb(push)] out [npc2.her] stomach in response,"
									+ " letting out [npc2.a_moan+] as [npc2.she] enthusiastically [npc2.verb(help)] to sink [npc.namePos] [npc.cock+] deep into [npc2.her] [npc2.crotchNipple+].",
		
							" [npc2.A_moan+] bursts out from between [npc2.namePos] [npc2.lips+],"
									+ " and, eagerly thrusting out [npc2.her] stomach, [npc2.she] [npc2.verb(beg)] for [npc.name] to carry on fucking [npc2.her] [npc2.crotchBoobs].",
		
							" [npc2.Moaning] in delight, [npc2.name] eagerly [npc2.verb(thrust)] [npc2.her] stomach out,"
									+ " eagerly begging for [npc.name] to continue fucking [npc2.her] [npc2.crotchBoobs] as [npc2.her] movements help to sink [npc.her] [npc.cock+] deep into [npc2.her] [npc2.crotchNipple+]."));
					break;
				case SUB_RESISTING:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							" Desperately trying, and failing, to pull away from [npc.namePos] [npc.cock],"
									+ " [npc2.name] [npc2.verb(let)] out [npc2.a_sob+], tears streaming down [npc2.her] [npc2.face] as [npc2.she] weakly [npc2.verb(beg)] for [npc.name] to pull out of [npc2.her] [npc2.crotchNipple+].",
		
							" [npc2.A_sob+] bursts out from between [npc2.namePos] [npc2.lips] as [npc2.she] weakly [npc2.verb(try)] to push [npc.name] away,"
									+ " tears streaming down [npc2.her] [npc2.face] as [npc2.she] [npc2.verb(plead)] for [npc.herHim] to pull out of [npc2.her] [npc2.crotchNipple+].",
		
							" [npc2.Sobbing] in distress, and with tears running down [npc2.her] [npc2.face],"
									+ " [npc2.name] weakly [npc2.verb(struggle)] against [npc.name], pleading and crying for [npc.herHim] to pull out of [npc2.her] [npc2.crotchNipple+]."));
					break;
				case SUB_NORMAL:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							" [npc2.Name] [npc2.verb(push)] out [npc2.her] stomach in response,"
									+ " letting out [npc2.a_moan+] as [npc2.she] [npc2.verb(help)] to sink [npc.namePos] [npc.cock+] deep into [npc2.her] [npc2.crotchNipple+].",
	
							" [npc2.A_moan+] bursts out from between [npc2.namePos] [npc2.lips+],"
									+ " and, thrusting out [npc2.her] stomach, [npc2.she] [npc2.verb(beg)] for [npc.name] to carry on fucking [npc2.her] [npc2.crotchBoobs].",
	
							" [npc2.Moaning] in delight, [npc2.name] eagerly [npc2.verb(push)] [npc2.her] stomach out,"
									+ " begging for [npc.name] to continue fucking [npc2.her] [npc2.crotchBoobs] as [npc2.her] movements help to sink [npc.her] [npc.cock+] deep into [npc2.her] [npc2.crotchNipple+]."));
					break;
				case DOM_GENTLE:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							" [npc2.Name] slowly [npc2.verb(push)] out [npc2.her] stomach in response,"
									+ " letting out a soft [npc2.moan] as [npc2.she] [npc2.verb(start)] gently imploring [npc.name] to continue fucking [npc2.her] [npc2.crotchBoobs+].",
	
							" A soft [npc2.moan] drifts out from between [npc2.namePos] [npc2.lips+],"
									+ " and, slowly pushing out [npc2.her] stomach, [npc2.she] [npc2.verb(implore)] [npc.name] to carry on fucking [npc2.her] [npc2.crotchBoobs].",
	
							" [npc2.Moaning] in delight, [npc2.name] gently [npc2.verb(push)] [npc2.her] stomach out,"
									+ " begging for [npc.name] to continue fucking [npc2.her] [npc2.crotchBoobs] as [npc2.her] movements help to sink [npc.her] [npc.cock+] deep into [npc2.her] [npc2.crotchNipple+]."));
					break;
				case DOM_ROUGH:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							" [npc2.Name] violently [npc2.verb(thrust)] [npc2.her] stomach out in response,"
									+ " letting out [npc2.a_moan+] as [npc2.she] roughly [npc2.verb(demand)] that [npc.name] [npc.verb(continue)] fucking [npc2.her] [npc2.crotchBoobs].",
	
							" [npc2.A_moan+] bursts out from between [npc2.namePos] [npc2.lips+],"
									+ " and, roughly slamming [npc2.her] stomach into [npc.her] groin, [npc2.she] [npc2.verb(order)] [npc.name] to carry on fucking [npc2.her] [npc2.crotchBoobs].",
	
							" [npc2.Moaning] in delight, [npc2.name] roughly [npc2.verb(slam)] [npc2.her] stomach into [npc.namePos] groin,"
									+ " ordering [npc.herHim] to continue fucking [npc2.her] [npc2.crotchBoobs] as [npc2.her] movements force [npc.her] [npc.cock+] deep into [npc2.her] [npc2.crotchNipple+]."));
					break;
			}
		}
		return "";
	}
	
	public static final SexAction PENIS_FUCKING_DOM_GENTLE = new SexAction(
			SexActionType.ONGOING,
			ArousalIncrease.FOUR_HIGH,
			ArousalIncrease.FOUR_HIGH,
			CorruptionLevel.ONE_VANILLA,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.PENIS, SexAreaOrifice.NIPPLE_CROTCH)),
			SexParticipantType.NORMAL,
			SexPace.DOM_GENTLE) {
		
		@Override
		public String getActionTitle() {
			return "Gentle "+getNippleTitle(Main.sex.getCharacterTargetedForSexAction(this))+"-fuck";
		}

		@Override
		public String getActionDescription() {
			return "Gently slide your [npc.cock] in and out of [npc2.namePos] [npc2.crotchNipple+].";
		}

		@Override
		public String getDescription() {

			UtilText.nodeContentSB.setLength(0);
			
			UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
					"Gently sinking [npc.her] [npc.cock+] deep into [npc2.namePos] [npc2.crotchNipple+],"
							+ " [npc.name] [npc.verb(start)] rocking [npc.her] [npc.hips] back and forth, letting out a little [npc.moan] with every thrust as [npc.she] slowly [npc.verb(fuck)] [npc2.her] [npc2.crotchBoobs].",

					"Slowly pushing [npc.her] [npc.cock+] into [npc2.namePos] [npc2.crotchNipple+],"
							+ " [npc.name] softly [npc.verb(thrust)] [npc.her] [npc.hips] forwards, letting out a little [npc.moan] as [npc.she] gently [npc.verb(fuck)] [npc2.her] [npc2.crotchBoobs].",

					"Sliding [npc.her] [npc.cock+] into [npc2.namePos] [npc2.crotchNipple+], [npc.name] [npc.verb(let)] out a little [npc.moan] as [npc.she] [npc.verb(start)] to gently pump [npc.her] [npc.hips] back and forth,"
							+ " breathing in [npc2.namePos] [npc2.scent] as [npc.she] slowly [npc.verb(fuck)] [npc2.her] [npc2.crotchBoobs]."));

			UtilText.nodeContentSB.append(getTargetedCharacterResponse(this));
					
			return UtilText.nodeContentSB.toString();
		}
		
	};
	
	public static final SexAction PENIS_FUCKING_DOM_NORMAL = new SexAction(
			SexActionType.ONGOING,
			ArousalIncrease.FOUR_HIGH,
			ArousalIncrease.FOUR_HIGH,
			CorruptionLevel.ONE_VANILLA,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.PENIS, SexAreaOrifice.NIPPLE_CROTCH)),
			SexParticipantType.NORMAL,
			SexPace.DOM_NORMAL) {
		
		@Override
		public String getActionTitle() {
			return Util.capitaliseSentence(getNippleTitle(Main.sex.getCharacterTargetedForSexAction(this)))+"-fuck";
		}

		@Override
		public String getActionDescription() {
			return "Continue thrusting your [npc.cock+] in and out of [npc2.namePos] [npc2.crotchNipple+].";
		}

		@Override
		public String getDescription() {

			UtilText.nodeContentSB.setLength(0);
			
			UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
					"Eagerly sinking [npc.her] [npc.cock+] deep into [npc2.namePos] [npc2.crotchNipple+],"
							+ " [npc.name] [npc.verb(start)] enthusiastically rocking [npc.her] [npc.hips] back and forth, letting out [npc.a_moan+] with every thrust as [npc.she] happily [npc.verb(fuck)] [npc2.her] [npc2.crotchBoobs].",

					"Enthusiastically pushing [npc.her] [npc.cock+] deep into [npc2.namePos] [npc2.crotchNipple+],"
							+ " [npc.name] frantically [npc.verb(thrust)] [npc.her] [npc.hips] forwards, letting out [npc.a_moan+] as [npc.she] greedily [npc.verb(fuck)] [npc2.her] [npc2.crotchBoobs].",

					"Thrusting [npc.her] [npc.cock+] deep into [npc2.namePos] [npc2.crotchNipple+], [npc.name] [npc.verb(let)] out [npc.a_moan+] as [npc.she] [npc.verb(start)] to eagerly pump [npc.her] [npc.hips] back and forth,"
							+ " breathing in [npc2.namePos] [npc2.scent] as [npc.she] desperately [npc.verb(fuck)] [npc2.her] [npc2.crotchBoobs]."));

			UtilText.nodeContentSB.append(getTargetedCharacterResponse(this));
			
			return UtilText.nodeContentSB.toString();
		}
		
	};
	
	public static final SexAction PENIS_FUCKING_DOM_ROUGH = new SexAction(
			SexActionType.ONGOING,
			ArousalIncrease.FOUR_HIGH,
			ArousalIncrease.FOUR_HIGH,
			CorruptionLevel.TWO_HORNY,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.PENIS, SexAreaOrifice.NIPPLE_CROTCH)),
			SexParticipantType.NORMAL,
			SexPace.DOM_ROUGH) {

		@Override
		public String getActionTitle() {
			return "Rough "+getNippleTitle(Main.sex.getCharacterTargetedForSexAction(this))+"-fuck";
		}

		@Override
		public String getActionDescription() {
			return "Roughly thrust your [npc.cock+] in and out of [npc2.namePos] [npc2.crotchNipple+].";
		}
		
		@Override
		public String getDescription() {

			UtilText.nodeContentSB.setLength(0);
			
			UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
					"Roughly slamming [npc.her] [npc.cock+] deep into [npc2.namePos] [npc2.crotchNipple+],"
							+ " [npc.name] [npc.verb(start)] roughly slamming [npc.her] [npc.hips] back and forth, letting out [npc.a_moan+] with every thrust as [npc.she] brutally [npc.verb(fuck)] [npc2.her] [npc2.crotchBoobs].",

					"Violently thrusting [npc.her] [npc.cock+] deep into [npc2.namePos] [npc2.crotchNipple+],"
							+ " [npc.name] [npc.verb(start)] roughly slamming [npc.her] [npc.hips] forwards, letting out [npc.a_moan+] as [npc.she] forcefully [npc.verb(fuck)] [npc2.her] [npc2.crotchBoobs].",

					"Forcefully driving [npc.her] [npc.cock+] deep into [npc2.namePos] [npc2.crotchNipple+], [npc.name] [npc.verb(let)] out [npc.a_moan+] as [npc.she] [npc.verb(start)] to roughly slam [npc.her] [npc.hips] back and forth,"
							+ " breathing in [npc2.namePos] [npc2.scent] as [npc.she] violently [npc.verb(fuck)] [npc2.her] [npc2.crotchBoobs]."));

			UtilText.nodeContentSB.append(getTargetedCharacterResponse(this));
			
			return UtilText.nodeContentSB.toString();
		}
		
	};
	
	public static final SexAction PENIS_FUCKING_SUB_NORMAL = new SexAction(
			SexActionType.ONGOING,
			ArousalIncrease.FOUR_HIGH,
			ArousalIncrease.FOUR_HIGH,
			CorruptionLevel.ONE_VANILLA,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.PENIS, SexAreaOrifice.NIPPLE_CROTCH)),
			SexParticipantType.NORMAL,
			SexPace.SUB_NORMAL) {
		
		@Override
		public String getActionTitle() {
			return Util.capitaliseSentence(getNippleTitle(Main.sex.getCharacterTargetedForSexAction(this)))+"-fuck";
		}

		@Override
		public String getActionDescription() {
			return "Continue fucking [npc2.namePos] [npc2.crotchNipple+].";
		}

		@Override
		public String getDescription() {

			UtilText.nodeContentSB.setLength(0);
			
			UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
					"Sinking [npc.her] [npc.cock+] deep into [npc2.namePos] [npc2.crotchNipple+],"
							+ " [npc.name] [npc.verb(start)] rocking [npc.her] [npc.hips] back and forth, letting out [npc.a_moan+] with every thrust as [npc.she] happily [npc.verb(fuck)] [npc2.her] [npc2.crotchBoobs].",

					"Pushing [npc.her] [npc.cock+] deep into [npc2.namePos] [npc2.crotchNipple+],"
							+ " [npc.name] [npc.verb(start)] thrusting [npc.her] [npc.hips] forwards, letting out [npc.a_moan+] as [npc.she] eagerly [npc.verb(fuck)] [npc2.her] [npc2.crotchBoobs].",

					"Thrusting [npc.her] [npc.cock+] deep into [npc2.namePos] [npc2.crotchNipple+], [npc.name] [npc.verb(let)] out [npc.a_moan+] as [npc.she] [npc.verb(start)] to pump [npc.her] [npc.hips] back and forth,"
							+ " breathing in [npc2.namePos] [npc2.scent] as [npc.she] [npc.verb(fuck)] [npc2.her] [npc2.crotchBoobs]."));

			UtilText.nodeContentSB.append(getTargetedCharacterResponse(this));
			
			return UtilText.nodeContentSB.toString();
		}
		
	};
	
	public static final SexAction PENIS_FUCKING_SUB_EAGER = new SexAction(
			SexActionType.ONGOING,
			ArousalIncrease.FOUR_HIGH,
			ArousalIncrease.FOUR_HIGH,
			CorruptionLevel.ONE_VANILLA,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.PENIS, SexAreaOrifice.NIPPLE_CROTCH)),
			SexParticipantType.NORMAL,
			SexPace.SUB_EAGER) {
		
		@Override
		public String getActionTitle() {
			return "Eager "+getNippleTitle(Main.sex.getCharacterTargetedForSexAction(this))+"-fuck";
		}

		@Override
		public String getActionDescription() {
			return "Eagerly pump your [npc.cock+] in and out of [npc2.namePos] [npc2.crotchNipple+].";
		}

		@Override
		public String getDescription() {

			UtilText.nodeContentSB.setLength(0);
			
			UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
					"Eagerly sinking [npc.her] [npc.cock+] deep into [npc2.namePos] [npc2.crotchNipple+],"
							+ " [npc.name] [npc.verb(start)] enthusiastically rocking [npc.her] [npc.crotchBoobs] back and forth, letting out [npc.a_moan+] with every thrust as [npc.she] happily [npc.verb(fuck)] [npc2.namePos] [npc2.crotchBoobs].",

					"Enthusiastically pushing [npc.her] [npc.cock+] deep into [npc2.namePos] [npc2.crotchNipple+],"
							+ " [npc.name] frantically [npc.verb(thrust)] [npc.her] [npc.crotchBoobs] forwards, letting out [npc.a_moan+] as [npc.she] greedily [npc.verb(fuck)] [npc2.herHim].",

					"Thrusting [npc.her] [npc.cock+] deep into [npc2.namePos] [npc2.crotchNipple+], [npc.name] [npc.verb(let)] out [npc.a_moan+] as [npc.she] [npc.verb(start)] to eagerly pump [npc.her] [npc.crotchBoobs] back and forth,"
							+ " breathing in [npc2.namePos] [npc2.scent] as [npc.she] desperately [npc.verb(fuck)] [npc2.herHim]."));

			UtilText.nodeContentSB.append(getTargetedCharacterResponse(this));
			
			return UtilText.nodeContentSB.toString();
		}
		
	};
	
	public static final SexAction PENIS_FUCKING_SUB_RESIST = new SexAction(
			SexActionType.ONGOING,
			ArousalIncrease.TWO_LOW,
			ArousalIncrease.FOUR_HIGH,
			CorruptionLevel.ZERO_PURE,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.PENIS, SexAreaOrifice.NIPPLE_CROTCH)),
			SexParticipantType.NORMAL,
			SexPace.SUB_RESISTING) {
		
		@Override
		public String getActionTitle() {
			return "Resist "+getNippleTitle(Main.sex.getCharacterTargetedForSexAction(this))+"-fuck";
		}

		@Override
		public String getActionDescription() {
			return "Try to pull your [npc.cock] out of [npc2.namePos] [npc2.crotchNipple+].";
		}

		@Override
		public String getDescription() {

			UtilText.nodeContentSB.setLength(0);

			switch(Main.sex.getSexPace(Main.sex.getCharacterTargetedForSexAction(this))) {
				case DOM_GENTLE:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"[npc.Name] [npc.verb(try)] to pull [npc.her] [npc.cock] out of [npc2.namePos] [npc2.crotchNipple],"
									+ " but [npc.her] efforts prove to be in vain as [npc2.name] quickly [npc2.verb(take)] a gentle hold of it, before softly forcing it back into [npc2.her] [npc2.crotchNipple+].",
	
							"With [npc.a_sob+], [npc.name] [npc.verb(try)] to pull [npc.her] [npc.cock] away from [npc2.name], but [npc2.she] quickly [npc2.verb(grab)] it, before gently forcing it back inside [npc2.her] [npc2.crotchNipple+].",
	
							"Tears start to well up in [npc.namePos] [npc.eyes], and with [npc.a_sob+], [npc.she] [npc.verb(try)] to pull [npc.her] [npc.cock] away from [npc2.namePos] [npc2.crotchNipple+],"
									+ " but [npc2.name] quickly [npc2.verb(shift)] position, ignoring [npc.her] protests as [npc2.she] gently [npc2.verb(force)] [npc2.her] [npc2.crotchNipple+] down onto [npc.her] [npc.cock+]."));
					break;
				case DOM_ROUGH:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"[npc.Name] [npc.verb(try)] to pull [npc.her] [npc.cock] out of [npc2.namePos] [npc2.crotchNipple],"
									+ " but [npc.her] efforts prove to be in vain as [npc2.name] quickly [npc2.verb(take)] a rough hold of it, before aggressively forcing it back into [npc2.her] [npc2.crotchNipple+].",
	
							"With [npc.a_sob+], [npc.name] [npc.verb(try)] to pull [npc.her] [npc.cock] away from [npc2.name], but [npc2.she] quickly [npc2.verb(grab)] it, before roughly forcing it back inside [npc2.her] [npc2.crotchNipple+].",
	
							"Tears start to well up in [npc.namePos] [npc.eyes], and with [npc.a_sob+], [npc.she] [npc.verb(try)] to pull [npc.her] [npc.cock] away from [npc2.namePos] [npc2.crotchNipple+],"
									+ " but [npc2.name] quickly [npc2.verb(shift)] position, ignoring [npc.her] protests as [npc2.she] roughly [npc2.verb(force)] [npc2.her] [npc2.crotchNipple+] down onto [npc.her] [npc.cock+]."));
					break;
				default: // DOM_NORMAL and in case anything goes wrong:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"[npc.Name] [npc.verb(try)] to pull [npc.her] [npc.cock] out of [npc2.namePos] [npc2.crotchNipple],"
									+ " but [npc.her] efforts prove to be in vain as [npc2.name] quickly [npc2.verb(take)] a firm hold of it, before eagerly forcing it back into [npc2.her] [npc2.crotchNipple+].",
	
							"With [npc.a_sob+], [npc.name] [npc.verb(try)] to pull [npc.her] [npc.cock] away from [npc2.name], but [npc2.she] quickly [npc2.verb(grab)] it, before eagerly forcing it back inside [npc2.her] [npc2.crotchNipple+].",
	
							"Tears start to well up in [npc.namePos] [npc.eyes], and with [npc.a_sob+], [npc.she] [npc.verb(try)] to pull [npc.her] [npc.cock] away from [npc2.namePos] [npc2.crotchNipple+],"
									+ " but [npc2.name] quickly [npc2.verb(shift)] position, ignoring [npc.her] protests as [npc2.she] [npc2.verb(force)] [npc2.her] [npc2.crotchNipple+] down onto [npc.her] [npc.cock+]."));
					break;
			}
			
			return UtilText.nodeContentSB.toString();
		}
		
	};
	
	public static final SexAction PENIS_FUCKING_STOP = new SexAction(
			SexActionType.STOP_ONGOING,
			ArousalIncrease.TWO_LOW,
			ArousalIncrease.TWO_LOW,
			CorruptionLevel.ZERO_PURE,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.PENIS, SexAreaOrifice.NIPPLE_CROTCH)),
			SexParticipantType.NORMAL) {
		
		@Override
		public String getActionTitle() {
			return "Stop "+getNippleTitle(Main.sex.getCharacterTargetedForSexAction(this))+"-fuck";
		}

		@Override
		public String getActionDescription() {
			return "Pull your [npc.cock+] out of [npc2.namePos] [npc2.crotchNipple+] and stop fucking [npc2.herHim].";
		}

		@Override
		public String getDescription() {
			UtilText.nodeContentSB.setLength(0);
			
			switch(Main.sex.getSexPace(Main.sex.getCharacterPerformingAction())) {
				case DOM_ROUGH:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"Roughly yanking [npc.her] [npc.cock+] out of [npc2.namePos] [npc2.crotchNipple+],"
									+ " [npc.name] dominantly [npc.verb(slide)] the [npc.cockTip+] up and down over one of [npc2.her] [npc2.crotchBoobs+] one last time before pulling back.",

							"Thrusting deep inside of [npc2.name] one last time, [npc.name] then [npc.verb(yank)] [npc.her] [npc.cock+] back out of [npc2.her] [npc2.crotchNipple+], putting an end to the rough fucking."));
					break;
				default:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"Sliding [npc.her] [npc.cock] out of [npc2.namePos] [npc2.crotchNipple+], [npc.name] [npc.verb(rub)] the [npc.cockTip] up and down over one of [npc2.her] [npc2.crotchBoobs+] one last time before pulling back.",

							"Pushing deep inside of [npc2.name] one last time, [npc.name] then [npc.verb(slide)] [npc.her] [npc.cock+] back out of [npc2.her] [npc2.crotchNipple+], putting an end to the fucking."));
					break;
			}

			if(!isTargetedCharacterInanimate()) {
				switch(Main.sex.getSexPace(Main.sex.getCharacterTargetedForSexAction(this))) {
					case SUB_RESISTING:
						UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
								" [npc2.Name] can't [npc2.verb(help)] but [npc2.verb(let)] out [npc2.sob+] as [npc.name] [npc.verb(pull)] out of [npc2.her] [npc2.crotchNipple],"
										+ " and [npc2.she] [npc2.verb(continue)] crying and protesting as [npc2.she] [npc2.verb(carry)] on weakly struggling against [npc.herHim].",
	
								" With [npc2.a_sob+], [npc2.name] [npc2.verb(continue)] to struggle and protest, tears streaming down [npc2.her] [npc2.face] as [npc2.she] [npc2.verb(pull)] [npc2.her] [npc2.crotchNipple+] away from [npc.name]."));
						break;
					default:
						UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
								" [npc2.Name] [npc2.verb(let)] out [npc2.a_moan+] as [npc.name] [npc.verb(pull)] [npc.her] [npc.cock+] out of [npc2.her] [npc2.crotchNipple+], eager for more of [npc.her] attention.",
	
								" [npc2.A_moan+] escapes from between [npc2.namePos] [npc2.lips+], betraying [npc2.her] desperate desire for more of [npc.namePos] attention."));
						break;
				}
			}
			
			return UtilText.nodeContentSB.toString();
		}
	};
	
	
	
	public static final SexAction USING_PENIS_START = new SexAction(
			SexActionType.START_ONGOING,
			ArousalIncrease.FOUR_HIGH,
			ArousalIncrease.FOUR_HIGH,
			CorruptionLevel.ONE_VANILLA,
			Util.newHashMapOfValues(new Value<>(SexAreaOrifice.NIPPLE_CROTCH, SexAreaPenetration.PENIS)),
			SexParticipantType.NORMAL) {

		@Override
		public boolean isBaseRequirementsMet() {
			return Main.sex.getCharacterPerformingAction().hasBreastsCrotch();
		}
		
		@Override
		public String getActionTitle() {
			return "Get "+getNippleTitle(Main.sex.getCharacterPerformingAction())+"-fucked";
		}

		@Override
		public String getActionDescription() {
			return "Slide [npc2.namePos] [npc2.cock+] into your [npc.crotchNipple+] and get fucked.";
		}

		@Override
		public String getDescription() {
			
			UtilText.nodeContentSB.setLength(0);
			
			switch(Main.sex.getSexPace(Main.sex.getCharacterPerformingAction())) {
				case DOM_GENTLE:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"Grabbing [npc2.namePos] [npc2.cock], [npc.name] slowly [npc.verb(guide)] it up to [npc.her] [npc.crotchBoobs+],"
									+ " letting out a little [npc.moan] before gently pushing out [npc.her] stomach and forcing [npc2.herHim] to penetrate [npc.her] [npc.crotchNipple+].",

							"Grabbing [npc2.namePos] [npc2.cock], [npc.name] [npc.verb(line)] it up to [npc.her] [npc.crotchNipple+],"
									+ " before slowly pushing [npc.her] [npc.crotchBoobs] forwards and letting out a soft [npc.moan] as [npc.she] [npc.verb(penetrate)] [npc.herself] on [npc2.her] [npc2.cock+]."));
					break;
				case DOM_NORMAL:
				case SUB_EAGER:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"Grabbing [npc2.namePos] [npc2.cock], [npc.name] eagerly [npc.verb(guide)] it up to [npc.her] [npc.crotchBoobs+],"
									+ " letting out [npc.a_moan+] before desperately pushing out [npc.her] stomach and forcing [npc2.herHim] to penetrate [npc.her] [npc.crotchNipple+].",

							"Grabbing [npc2.namePos] [npc2.cock], [npc.name] [npc.verb(line)] it up to [npc.her] [npc.crotchNipple+],"
									+ " before eagerly pushing [npc.her] [npc.crotchBoobs] forwards and letting out [npc.a_moan+] as [npc.she] [npc.verb(penetrate)] [npc.herself] on [npc2.her] [npc2.cock+]."));
					break;
				case DOM_ROUGH:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"Grabbing [npc2.namePos] [npc2.cock], [npc.name] roughly yank it up to [npc.her] [npc.crotchBoobs+],"
									+ " letting out [npc.a_moan+] before violently thrusting [npc.her] stomach forwards and forcing [npc2.herHim] to penetrate [npc.her] [npc.crotchNipple+].",

							"Grabbing [npc2.namePos] [npc2.cock], [npc.name] [npc.verb(line)] it up to [npc.her] [npc.crotchNipple+],"
									+ " before dominantly pushing [npc.her] [npc.crotchBoobs] forwards and letting out [npc.a_moan+] as [npc.she] [npc.verb(penetrate)] [npc.herself] on [npc2.her] [npc2.cock+]."));
					break;
				case SUB_NORMAL:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"Grabbing [npc2.namePos] [npc2.cock], [npc.name] [npc.verb(guide)] it up to [npc.her] [npc.crotchBoobs+],"
									+ " letting out [npc.a_moan+] before pushing out [npc.her] stomach and forcing [npc2.herHim] to penetrate [npc.her] [npc.crotchNipple+].",

							"Grabbing [npc2.namePos] [npc2.cock], [npc.name] [npc.verb(line)] it up to [npc.her] [npc.crotchNipple+],"
									+ " before pushing [npc.her] [npc.crotchBoobs] forwards and letting out [npc.a_moan+] as [npc.she] [npc.verb(penetrate)] [npc.herself] on [npc2.her] [npc2.cock+]."));
					break;
				default:
					break;
			}

			if(!isTargetedCharacterInanimate()) {
				switch(Main.sex.getSexPace(Main.sex.getCharacterTargetedForSexAction(this))) {
					case DOM_GENTLE:
						UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
								" [npc2.Name] [npc2.verb(let)] out a soft [npc2.moan] as [npc2.she] [npc2.verb(enter)] [npc.herHim],"
										+ " gently pushing [npc2.her] [npc2.cock] forwards as [npc2.she] [npc2.verb(start)] to fuck [npc.namePos] [npc.crotchNipple+].",
	
								" With a soft [npc2.moan], [npc2.name] gently [npc2.verb(thrust)] [npc2.her] [npc2.cock] forwards,"
										+ " sinking it deep into [npc.namePos] [npc.crotchNipple+] as [npc2.she] [npc2.verb(start)] fucking [npc.herHim]."));
						break;
					case DOM_NORMAL:
					case SUB_EAGER:
						UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
								" [npc2.Name] [npc2.verb(let)] out [npc2.a_moan+] as [npc2.she] [npc2.verb(enter)] [npc.herHim],"
										+ " eagerly pushing [npc2.her] [npc2.cock] forwards as [npc2.she] [npc2.verb(start)] enthusiastically fucking [npc.namePos] [npc.crotchNipple+].",
	
								" With [npc2.a_moan+], [npc2.name] eagerly [npc2.verb(thrust)] [npc2.her] [npc2.cock] forwards,"
										+ " sinking it deep into [npc.namePos] [npc.crotchNipple+] as [npc2.she] [npc2.verb(start)] energetically fucking [npc.herHim]."));
						break;
					case DOM_ROUGH:
						UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
								" [npc2.Name] [npc2.verb(let)] out [npc2.a_moan+] as [npc2.she] [npc2.verb(enter)] [npc.herHim],"
										+ " and, seeking to remind [npc.name] who's in charge, [npc2.she] roughly slams [npc2.her] [npc2.cock] forwards and [npc2.verb(start)] to ruthlessly fuck [npc.her] [npc.crotchNipple+].",
	
								" With [npc2.a_moan+], [npc2.name] roughly [npc2.verb(slam)] [npc2.her] [npc2.cock] forwards,"
										+ " seeking to remind [npc.name] who's in charge as [npc2.she] [npc2.verb(start)] ruthlessly fucking [npc.namePos] [npc.crotchNipple+]."));
						break;
					case SUB_NORMAL:
						UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
								" [npc2.Name] [npc2.verb(let)] out [npc2.a_moan+] as [npc2.she] [npc2.verb(enter)] [npc.herHim], pushing [npc2.her] [npc2.cock] forwards as [npc2.she] [npc2.verb(start)] fucking [npc.namePos] [npc.crotchNipple+].",
	
								" With [npc2.a_moan+], [npc2.name] [npc2.verb(thrust)] [npc2.her] [npc2.cock] forwards, sinking it deep into [npc.namePos] [npc.crotchNipple+] as [npc2.she] [npc2.verb(start)] fucking [npc.herHim]."));
						break;
					case SUB_RESISTING:
						UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
								" [npc2.Name] [npc2.verb(let)] out [npc2.a_sob+] as [npc.name] [npc.verb(force)] [npc2.her] [npc2.cock] inside of [npc.herHim],"
										+ " and, struggling against [npc.herHim], [npc2.she] desperately [npc2.verb(try)] to pull [npc2.her] [npc2.cock+] free from [npc.her] [npc.crotchNipple+].",
	
								" With [npc2.a_sob+], [npc2.name] [npc2.verb(struggle)] against [npc.name] as [npc.she] [npc.verb(force)] [npc2.her] [npc2.cock] deep into [npc.her] [npc.crotchNipple+]."));
						break;
					default:
						break;
				}
			}
			
			return UtilText.nodeContentSB.toString();
		}
		
	};
	
	private static String getTargetedCharacterReceivingResponse(SexAction action) {
		if(!action.isTargetedCharacterInanimate()) {
			switch(Main.sex.getSexPace(Main.sex.getCharacterTargetedForSexAction(action))) {
				case SUB_EAGER:
				case DOM_NORMAL:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							" [npc2.Name] greedily [npc2.verb(thrust)] [npc2.her] [npc2.cock+] deep into [npc.namePos] [npc.crotchBoob+],"
									+ " letting out [npc2.a_moan+] as [npc2.she] enthusiastically [npc2.verb(penetrate)] [npc2.her] [npc2.crotchNipple+].",
		
							" [npc2.A_moan+] bursts out from [npc2.namePos] mouth, before [npc2.she] [npc2.verb(start)] thrusting [npc2.her] [npc2.cock+] deep into [npc.namePos] [npc.crotchNipple+].",
		
							" [npc2.Moaning] in delight, [npc2.name] eagerly [npc2.verb(drive)] [npc2.her] [npc2.cock+] as deep as possible into [npc.namePos] [npc.crotchNipple+]."));
					break;
				case SUB_RESISTING:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							" Failing to pull [npc2.her] [npc2.cock] away from [npc.namePos] [npc.crotchNipple],"
									+ " [npc2.name] [npc2.verb(let)] out [npc2.a_sob+] as [npc2.she] weakly [npc2.verb(try)] to struggle free.",
		
							" [npc2.A_sob+] bursts out from between [npc2.namePos] [npc2.lips] as [npc2.she] weakly [npc2.verb(try)] to push [npc.name] away,"
									+ " squirming and protesting as [npc.name] [npc.verb(continue)] to force [npc2.her] [npc2.cock+] deep into [npc.her] [npc.crotchNipple+].",
		
							" [npc2.Sobbing] in distress, [npc2.name] [npc2.verb(try)], in vain, to pull [npc2.her] [npc2.cock] away from [npc.namePos] [npc.crotchNipple+]."));
					break;
				case DOM_GENTLE:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							" [npc2.Name] gently [npc2.verb(slide)] [npc2.her] [npc2.cock+] deep into [npc.namePos] [npc.crotchBoob+],"
									+ " letting out a soft [npc2.moan] as [npc2.she] gently [npc2.verb(penetrate)] [npc2.her] [npc2.crotchNipple+].",
		
							" A gentle [npc2.moan] drifts out from [npc2.namePos] mouth, before [npc2.she] [npc2.verb(start)] slowly sliding [npc2.her] [npc2.cock+] deep into [npc.namePos] [npc.crotchNipple+].",
	
							" [npc2.Moaning] in delight, [npc2.name] gently [npc2.verb(slide)] [npc2.her] [npc2.cock+] deep into [npc.namePos] [npc.crotchNipple+]."));
					break;
				case DOM_ROUGH:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							" [npc2.Name] violently [npc2.verb(thrust)] [npc2.her] [npc2.cock+] deep into [npc.namePos] [npc.crotchBoob+],"
									+ " letting out [npc2.a_moan+] as [npc2.she] roughly [npc2.verb(penetrate)] [npc2.her] [npc2.crotchNipple+].",
		
							" [npc2.A_moan+] bursts out from [npc2.namePos] mouth, before [npc2.she] [npc2.verb(start)] violently thrusting [npc2.her] [npc2.cock+] deep into [npc.namePos] [npc.crotchNipple+].",
	
							" [npc2.Moaning] in delight, [npc2.name] roughly [npc2.verb(slam)] [npc2.her] [npc2.cock+] as deep as possible into [npc.namePos] [npc.crotchNipple+]."));
					break;
				case SUB_NORMAL:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							" [npc2.Name] [npc2.verb(thrust)] [npc2.her] [npc2.cock+] deep into [npc.namePos] [npc.crotchBoob+],"
									+ " letting out [npc2.a_moan+] as [npc2.she] [npc2.verb(penetrate)] [npc2.her] [npc2.crotchNipple+].",
		
							" [npc2.A_moan+] bursts out from [npc2.namePos] mouth, before [npc2.she] [npc2.verb(start)] thrusting [npc2.her] [npc2.cock+] deep into [npc.namePos] [npc.crotchNipple+].",
	
							" [npc2.Moaning] in delight, [npc2.name] [npc2.verb(slide)] [npc2.her] [npc2.cock+] deep into [npc.namePos] [npc.crotchNipple+]."));
					break;
			}
		}
		return "";
	}
	
	public static final SexAction RIDING_PENIS_DOM_GENTLE = new SexAction(
			SexActionType.ONGOING,
			ArousalIncrease.FOUR_HIGH,
			ArousalIncrease.FOUR_HIGH,
			CorruptionLevel.ONE_VANILLA,
			Util.newHashMapOfValues(new Value<>(SexAreaOrifice.NIPPLE_CROTCH, SexAreaPenetration.PENIS)),
			SexParticipantType.NORMAL,
			SexPace.DOM_GENTLE) {
		
		@Override
		public String getActionTitle() {
			return "Gently "+getNippleTitle(Main.sex.getCharacterPerformingAction())+"-fucked";
		}

		@Override
		public String getActionDescription() {
			return "Gently have your [npc.crotchNipple+] fucked by [npc2.namePos] [npc2.cock+].";
		}

		@Override
		public String getDescription() {
			UtilText.nodeContentSB.setLength(0);
			
			UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
					"With a gentle forwards thrust of [npc.her] stomach, [npc.name] [npc.verb(let)] out a soft [npc.moan] as [npc.she] [npc.verb(help)] to sink [npc2.namePos] [npc2.cock+] deep into [npc.her] [npc.crotchNipple+].",

					"With a soft [npc.moan], [npc.name] gently [npc.verb(push)] [npc.her] stomach forwards, forcing [npc2.namePos] [npc2.cock+] ever deeper into [npc.her] [npc.crotchNipple+].",

					"Slowly pushing out [npc.her] stomach,"
							+ " a soft [npc.moan] drifts out from between [npc.namePos] [npc.lips+] as [npc.her] movements force [npc2.namePos] [npc2.cock+] deep into [npc.her] [npc.crotchNipple+]."));

			UtilText.nodeContentSB.append(getTargetedCharacterReceivingResponse(this));
			
			return UtilText.nodeContentSB.toString();
		}
		
	};
	
	public static final SexAction RIDING_PENIS_DOM_NORMAL = new SexAction(
			SexActionType.ONGOING,
			ArousalIncrease.FOUR_HIGH,
			ArousalIncrease.FOUR_HIGH,
			CorruptionLevel.ONE_VANILLA,
			Util.newHashMapOfValues(new Value<>(SexAreaOrifice.NIPPLE_CROTCH, SexAreaPenetration.PENIS)),
			SexParticipantType.NORMAL,
			SexPace.DOM_NORMAL) {
		
		@Override
		public String getActionTitle() {
			return Util.capitaliseSentence(getNippleTitle(Main.sex.getCharacterPerformingAction()))+"-fucked";
		}

		@Override
		public String getActionDescription() {
			return "Eagerly fuck your [npc.crotchNipple+] on [npc2.namePos] [npc2.cock+].";
		}

		@Override
		public String getDescription() {
			UtilText.nodeContentSB.setLength(0);

			UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
					"With an eager forwards thrust of [npc.her] stomach, [npc.name] [npc.verb(let)] out [npc.a_moan+] as [npc.she] [npc.verb(help)] to sink [npc2.namePos] [npc2.cock+] deep into [npc.her] [npc.crotchNipple+].",

					"With [npc.a_moan+], [npc.name] enthusiastically [npc.verb(push)] [npc.her] stomach forwards, forcing [npc2.namePos] [npc2.cock+] ever deeper into [npc.her] [npc.crotchNipple+].",

					"Energetically pushing out [npc.her] stomach,"
							+ " [npc.a_moan+] bursts out from between [npc.namePos] [npc.lips+] as [npc.her] movements force [npc2.namePos] [npc2.cock+] deep into [npc.her] [npc.crotchNipple+]."));

			UtilText.nodeContentSB.append(getTargetedCharacterReceivingResponse(this));
			
			return UtilText.nodeContentSB.toString();
		}
		
	};
	
	public static final SexAction RIDING_PENIS_DOM_ROUGH = new SexAction(
			SexActionType.ONGOING,
			ArousalIncrease.FOUR_HIGH,
			ArousalIncrease.FOUR_HIGH,
			CorruptionLevel.TWO_HORNY,
			Util.newHashMapOfValues(new Value<>(SexAreaOrifice.NIPPLE_CROTCH, SexAreaPenetration.PENIS)),
			SexParticipantType.NORMAL,
			SexPace.DOM_ROUGH) {
		
		@Override
		public String getActionTitle() {
			return "Roughly "+getNippleTitle(Main.sex.getCharacterPerformingAction())+"-fucked";
		}

		@Override
		public String getActionDescription() {
			return "Roughly fuck your [npc.crotchNipple+] on [npc2.namePos] [npc2.cock+].";
		}

		@Override
		public String getDescription() {
			UtilText.nodeContentSB.setLength(0);

			UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
					"With a violent forwards thrust of [npc.her] stomach, [npc.name] [npc.verb(let)] out [npc.a_moan+] as [npc.she] [npc.verb(force)] [npc2.namePos] [npc2.cock+] deep into [npc.her] [npc.crotchNipple+].",

					"With [npc.a_moan+], [npc.name] roughly [npc.verb(thrust)] [npc.her] stomach forwards, forcing [npc2.namePos] [npc2.cock+] ever deeper into [npc.her] [npc.crotchNipple+].",

					"Forcefully pushing out [npc.her] stomach,"
							+ " [npc.a_moan+] bursts out from between [npc.namePos] [npc.lips+] as [npc.her] movements roughly force [npc2.namePos] [npc2.cock+] deep into [npc.her] [npc.crotchNipple+]."));

			UtilText.nodeContentSB.append(getTargetedCharacterReceivingResponse(this));
			
			return UtilText.nodeContentSB.toString();
		}

	};
	
	public static final SexAction RIDING_PENIS_SUB_NORMAL = new SexAction(
			SexActionType.ONGOING,
			ArousalIncrease.FOUR_HIGH,
			ArousalIncrease.FOUR_HIGH,
			CorruptionLevel.ONE_VANILLA,
			Util.newHashMapOfValues(new Value<>(SexAreaOrifice.NIPPLE_CROTCH, SexAreaPenetration.PENIS)),
			SexParticipantType.NORMAL,
			SexPace.SUB_NORMAL) {
		
		@Override
		public String getActionTitle() {
			return Util.capitaliseSentence(getNippleTitle(Main.sex.getCharacterPerformingAction()))+"-fucked";
		}

		@Override
		public String getActionDescription() {
			return "Fuck your [npc.crotchNipple+] on [npc2.namePos] [npc2.cock+].";
		}

		@Override
		public String getDescription() {
			UtilText.nodeContentSB.setLength(0);

			UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
					"With a quick forwards thrust of [npc.her] stomach, [npc.name] [npc.verb(let)] out [npc.a_moan+] as [npc.she] [npc.verb(help)] to sink [npc2.namePos] [npc2.cock+] deep into [npc.her] [npc.crotchNipple+].",

					"With [npc.a_moan+], [npc.name] [npc.verb(push)] [npc.her] stomach forwards, forcing [npc2.namePos] [npc2.cock+] ever deeper into [npc.her] [npc.crotchNipple+].",

					"Pushing out [npc.her] stomach,"
							+ " [npc.a_moan+] bursts out from between [npc.namePos] [npc.lips+] as [npc.her] movements force [npc2.namePos] [npc2.cock+] deep into [npc.her] [npc.crotchNipple+]."));

			UtilText.nodeContentSB.append(getTargetedCharacterReceivingResponse(this));
			
			return UtilText.nodeContentSB.toString();
		}
		
	};
	
	public static final SexAction RIDING_PENIS_SUB_EAGER = new SexAction(
			SexActionType.ONGOING,
			ArousalIncrease.FOUR_HIGH,
			ArousalIncrease.FOUR_HIGH,
			CorruptionLevel.ONE_VANILLA,
			Util.newHashMapOfValues(new Value<>(SexAreaOrifice.NIPPLE_CROTCH, SexAreaPenetration.PENIS)),
			SexParticipantType.NORMAL,
			SexPace.SUB_EAGER) {
		
		@Override
		public String getActionTitle() {
			return "Eagerly "+getNippleTitle(Main.sex.getCharacterPerformingAction())+"-fucked";
		}

		@Override
		public String getActionDescription() {
			return "Eagerly fuck your [npc.crotchNipple+] on [npc2.namePos] [npc2.cock+].";
		}

		@Override
		public String getDescription() {
			UtilText.nodeContentSB.setLength(0);

			UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
					"With an eager forwards thrust of [npc.her] stomach, [npc.name] [npc.verb(let)] out [npc.a_moan+] as [npc.she] [npc.verb(help)] to sink [npc2.namePos] [npc2.cock+] deep into [npc.her] [npc.crotchNipple+].",

					"With [npc.a_moan+], [npc.name] enthusiastically [npc.verb(push)] [npc.her] stomach forwards, forcing [npc2.namePos] [npc2.cock+] ever deeper into [npc.her] [npc.crotchNipple+].",

					"Energetically pushing out [npc.her] stomach,"
							+ " [npc.a_moan+] bursts out from between [npc.namePos] [npc.lips+] as [npc.her] movements force [npc2.namePos] [npc2.cock+] deep into [npc.her] [npc.crotchNipple+]."));

			UtilText.nodeContentSB.append(getTargetedCharacterReceivingResponse(this));
			
			return UtilText.nodeContentSB.toString();
		}
		
	};
	
	public static final SexAction FUCKED_SUB_RESIST = new SexAction(
			SexActionType.ONGOING,
			ArousalIncrease.ZERO_NONE,
			ArousalIncrease.FOUR_HIGH,
			CorruptionLevel.ZERO_PURE,
			Util.newHashMapOfValues(new Value<>(SexAreaOrifice.NIPPLE_CROTCH, SexAreaPenetration.PENIS)),
			SexParticipantType.NORMAL,
			SexPace.SUB_RESISTING) {
		
		@Override
		public String getActionTitle() {
			return "Resist "+getNippleTitle(Main.sex.getCharacterPerformingAction())+"-fucked";
		}

		@Override
		public String getActionDescription() {
			return "Try and pull your [npc.crotchNipple+] away from [npc2.namePos] [npc2.cock+].";
		}

		@Override
		public String getDescription() {

			UtilText.nodeContentSB.setLength(0);

			switch(Main.sex.getSexPace(Main.sex.getCharacterTargetedForSexAction(this))) {
				case DOM_GENTLE:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"[npc.Name] [npc.verb(feel)] tears [npc.verb(start)] to well up in [npc.her] [npc.eyes], and, not being able to hold back any longer, [npc.she] suddenly [npc.verb(let)] out [npc.a_sob+],"
									+ " before weakly trying to pull [npc2.namePos] [npc2.cock] out of [npc.her] [npc.crotchNipple+].",

							"[npc.A_sob+] bursts out from [npc.namePos] mouth as [npc.she] frantically [npc.verb(try)] to pull [npc.her] [npc.crotchNipple] away from [npc2.namePos] unwanted penetration,"
									+ " struggling in desperation as [npc2.her] [npc2.cock+] [npc2.verb(continue)] slowly sliding in and out of [npc.her] [npc.crotchBoob+].",

							"Trying desperately to pull [npc.her] [npc.crotchBoobs] away,"
									+ " [npc.name] [npc.sobVerb] in distress as [npc2.namePos] [npc2.cock+] [npc2.verb(continue)] gently sliding deep into [npc.her] [npc.crotchNipple+]."));
					break;
				case DOM_NORMAL:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"[npc.Name] [npc.verb(feel)] tears [npc.verb(start)] to well up in [npc.her] [npc.eyes], and, not being able to hold back any longer, [npc.she] suddenly [npc.verb(let)] out [npc.a_sob+],"
									+ " before weakly trying to pull [npc2.namePos] [npc2.cock] out of [npc.her] [npc.crotchNipple+].",

							"[npc.A_sob+] bursts out from [npc.namePos] mouth as [npc.she] frantically [npc.verb(try)] to pull [npc.her] [npc.crotchNipple] away from [npc2.namePos] unwanted penetration,"
									+ " struggling in desperation as [npc2.her] [npc2.cock+] [npc2.verb(continue)] frantically pumping in and out of [npc.her] [npc.crotchBoob+].",

							"Trying desperately to pull [npc.her] [npc.crotchBoobs] away,"
									+ " [npc.name] [npc.sobVerb] in distress as [npc2.namePos] [npc2.cock+] [npc2.verb(continue)] greedily thrusting deep into [npc.her] [npc.crotchNipple+]."));
					break;
				case DOM_ROUGH:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"[npc.Name] [npc.verb(feel)] tears [npc.verb(start)] to well up in [npc.her] [npc.eyes], and, not being able to hold back any longer, [npc.she] suddenly [npc.verb(let)] out [npc.a_sob+],"
									+ " before weakly trying to pull [npc2.namePos] [npc2.cock] out of [npc.her] [npc.crotchNipple+].",

							"[npc.A_sob+] bursts out from [npc.namePos] mouth as [npc.she] frantically [npc.verb(try)] to pull [npc.her] [npc.crotchNipple] away from [npc2.namePos] unwanted penetration,"
									+ " struggling in desperation as [npc2.her] [npc2.cock+] [npc2.verb(continue)] roughly slamming in and out of [npc.her] [npc.crotchBoob+].",

							"Trying desperately to pull [npc.her] [npc.crotchBoobs] away,"
									+ " [npc.name] [npc.sobVerb] in distress as [npc2.namePos] [npc2.cock+] [npc2.verb(continue)] violently thrusting deep into [npc.her] [npc.crotchNipple+]."));
					break;
				default:
					break;
			}
			
			return UtilText.nodeContentSB.toString();
		}
		
	};
	
	public static final SexAction FUCKED_STOP = new SexAction(
			SexActionType.STOP_ONGOING,
			ArousalIncrease.TWO_LOW,
			ArousalIncrease.TWO_LOW,
			CorruptionLevel.ZERO_PURE,
			Util.newHashMapOfValues(new Value<>(SexAreaOrifice.NIPPLE_CROTCH, SexAreaPenetration.PENIS)),
			SexParticipantType.NORMAL) {

		@Override
		public String getActionTitle() {
			return "Stop "+getNippleTitle(Main.sex.getCharacterPerformingAction())+"-fucked";
		}

		@Override
		public String getActionDescription() {
			return "Get [npc2.name] to pull [npc2.her] [npc2.cock] out of your [npc.crotchNipple+].";
		}

		@Override
		public String getDescription() {
			UtilText.nodeContentSB.setLength(0);
			
			switch(Main.sex.getSexPace(Main.sex.getCharacterPerformingAction())) {
				case DOM_ROUGH:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"Yanking [npc2.namePos] [npc2.cock] out of [npc.her] [npc.crotchNipple+], [npc.name] [npc.verb(let)] out a menacing growl as [npc.she] [npc.verb(command)] [npc2.name] to stop fucking [npc.herHim].",

							"[npc.Name] [npc.verb(lean)] into [npc2.name], inhaling [npc2.her] [npc2.scent] before yanking [npc2.her] [npc2.cock] out of [npc.her] [npc.crotchNipple+]."));
					break;
				default:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"Sliding [npc2.namePos] [npc2.cock] out of [npc.her] [npc.crotchNipple+], [npc.name] [npc.verb(let)] out [npc.a_moan+] as [npc.she] [npc.verb(tell)] [npc2.name] to stop fucking [npc.herHim].",

							"[npc.Name] [npc.verb(lean)] into [npc2.name], inhaling [npc2.her] [npc2.scent] before sliding [npc2.her] [npc2.cock] out of [npc.her] [npc.crotchNipple+]."));
					break;
			}

			if(!isTargetedCharacterInanimate()) {
				switch(Main.sex.getSexPace(Main.sex.getCharacterTargetedForSexAction(this))) {
					case SUB_RESISTING:
						UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
								" [npc2.Name] [npc2.verb(let)] out a relieved sigh, which soon turns into [npc2.a_sob+] as [npc2.she] [npc2.verb(realise)] that [npc.nameIsFull]n't finished with [npc2.herHim] just yet.",
	
								" With [npc2.a_sob+], [npc2.name] [npc2.verb(continue)] to protest and struggle against [npc.name] as [npc.she] [npc.verb(hold)] [npc2.herHim] firmly in place."));
						break;
					default:
						UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
								" [npc2.Name] [npc2.verb(let)] out [npc2.a_moan+] as [npc.name] [npc.verb(stop)] [npc2.herHim] from fucking [npc.her] [npc.crotchNipple+].",
	
								" [npc2.A_moan+] escapes from between [npc2.namePos] [npc2.lips+], betraying [npc2.her] desire to continue fucking [npc.namePos] [npc.crotchNipple+]."));
						break;
				}
			}
			
			return UtilText.nodeContentSB.toString();
		}
	};
	
	public static final SexAction NIPPLE_CROTCH_CONTROL = new SexAction(
			SexActionType.ONGOING,
			ArousalIncrease.FOUR_HIGH,
			ArousalIncrease.FIVE_EXTREME,
			CorruptionLevel.ZERO_PURE,
			Util.newHashMapOfValues(new Value<>(SexAreaOrifice.NIPPLE_CROTCH, SexAreaPenetration.PENIS)),
			SexParticipantType.NORMAL) {
		
		@Override
		public String getActionTitle() {
			return Util.capitaliseSentence(getNippleTitle(Main.sex.getCharacterPerformingAction()))+" control";
		}

		@Override
		public String getActionDescription() {
			return "Squeeze your internally-muscled [npc.crotchNipple] down around [npc2.namePos] [npc2.cock].";
		}

		@Override
		public boolean isBaseRequirementsMet() {
			return Main.sex.getCharacterPerformingAction().getNippleCrotchOrificeModifiers().contains(OrificeModifier.MUSCLE_CONTROL);
		}

		@Override
		public String getDescription() {
			return UtilText.returnStringAtRandom(
					"Letting out [npc.a_moan+], [npc.name] [npc.verb(concentrate)] on squeezing the extra internal muscles within [npc.her] [npc.crotchNipple] down around [npc2.namePos] [npc2.cock+].",

					(!isTargetedCharacterInanimate()
						?"[npc.Name] [npc.verb(let)] out [npc.a_moan+] as [npc.she] [npc.verb(focus)] on controlling the extra muscles lining the insides of [npc.her] [npc.crotchNipple]."
							+ " Gripping and squeezing them down around [npc2.namePos] [npc2.cock+], [npc.name] [npc.verb(cause)] [npc2.herHim] to let out an involuntary cry of pleasure."
						:""),

					"[npc.Name] [npc.verb(find)] [npc.her] [npc.moans] falling into a steady rhythm as [npc.she] [npc.verb(concentrate)]"
							+ " on squeezing the extra muscles within [npc.her] [npc.crotchNipple+] down around [npc2.namePos] [npc2.cock+].",

					"With [npc.a_moan+], [npc.name] [npc.verb(focus)] on controlling the extra muscles deep within [npc.her] [npc.crotchNipple],"
							+ " gripping them down and massaging [npc2.namePos] [npc2.cock+] as [npc.she] [npc.verb(squeal)] in pleasure.");
		}
	};
}
