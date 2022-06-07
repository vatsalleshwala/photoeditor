package com.burhanrashid52.photoediting.emoji;

import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;

public class Emoji {


    public static final String[] emoji = new String[]{

            //Smileys
            "😀", "😃", "😄", "😁", "😆", "😅", "😂", "🤣", "🥲", "☺",
            "😊", "😇", "🙂", "🙃", "😉", "😌", "😍", "🥰", "😘", "😗",
            "😙", "😚", "😋", "😛", "😝", "😜", "🤪", "🤨", "🧐", "🤓",
            "😎", "🥸", "🤩", "🥳", "😏", "😒", "😞", "😔", "😟", "😕",
            "🙁", "☹", "😣", "😖", "😫", "😩", "🥺", "😢", "😭", "😤",
            "😠", "😡", "🤬", "🤯", "😳", "🥵", "🥶", "😱", "😨", "😰",
            "😥", "😓", "🤗", "🤔", "🤭", "🤫", "🤥", "😶", "😐", "😑",
            "😬", "🙄", "😯", "😦", "😧", "😮", "😲", "🥱", "😴", "🤤",
            "😪", "😵", "🤐", "🥴", "🤢", "🤮", "🤧", "😷", "🤒", "🤕",
            "🤑", "🤠", "😈", "👿", "👹", "👺", "🤡", "💩", "👻", "💀",
            "☠", "👽", "👾", "🤖", "🎃", "😺", "😸", "😹", "😻", "😼",
            "😽", "🙀", "😿", "😾",

            //Gestures and Body Parts
            "👋", "🤚", "🖐", "✋", "🖖", "👌", "🤌", "🤏", "✌", "🤞", "🤟", "🤘", "🤙", "👈", "👉", "👆",
            "🖕", "👇", "☝", "👍", "👎", "✊", "👊", "🤛", "🤜", "👏",
            "🙌", "👐", "🤲", "🤝", "🙏", "✍", "💅", "🤳", "💪", "🦾",
            "🦵", "🦿", "🦶", "👣", "👂", "🦻", "👃", "🫀", "🫁", "🧠",
            "🦷", "🦴", "👀", "👁", "👅", "👄", "💋", "🩸",

            //People and Fantasy
            "👶", "👧", "🧒", "👦", "👩", "🧑", "👨", "👩‍🦱", "🧑‍🦱", "👨‍🦱", "👩‍🦰", "🧑‍🦰",
            "👨‍🦰", "👱‍♀", "👱", "👱‍♂", "👩‍🦳", "🧑‍🦳", "👨‍🦳", "👩‍🦲", "🧑‍🦲", "👨‍🦲",
            "🧔", "👵", "🧓", "👴", "👲", "👳‍♀", "👳", "👳‍♂", "🧕", "👮‍♀", "👮", "👮‍♂",
            "👷‍♀", "👷", "👷‍♂", "💂‍♀", "💂", "💂‍♂", "🕵️‍♀", "🕵️", "🕵️‍♂", "👩‍⚕", "🧑‍⚕",
            "👨‍⚕", "👩‍🌾", "🧑‍🌾", "👨‍🌾", "👩‍🍳", "🧑‍🍳", "👨‍🍳", "👩‍🎓", "🧑‍🎓", "👨‍🎓",
            "👩‍🎤", "🧑‍🎤", "👨‍🎤", "👩‍🏫", "🧑‍🏫", "👨‍🏫", "👩‍🏭", "🧑‍🏭", "👨‍🏭", "👩‍💻",
            "🧑‍💻", "👨‍💻", "👩‍💼", "🧑‍💼", "👨‍💼", "👩‍🔧", "🧑‍🔧", "👨‍🔧", "👩‍🔬", "🧑‍🔬",
            "👨‍🔬", "👩‍🎨", "🧑‍🎨", "👨‍🎨", "👩‍🚒", "🧑‍🚒", "👨‍🚒", "👩‍✈", "🧑‍✈", "👨‍✈",
            "👩‍🚀", "🧑‍🚀", "👨‍🚀", "👩‍⚖", "🧑‍⚖", "👨‍⚖", "👰‍♀", "👰", "👰‍♂", "🤵‍♀", "🤵",
            "🤵‍♂", "👸", "🤴", "🥷", "🦸‍♀", "🦸", "🦸‍♂", "🦹‍♀", "🦹", "🦹‍♂", "🤶", "🧑‍🎄",
            "🎅", "🧙‍♀", "🧙", "🧙‍♂", "🧝‍♀", "🧝", "🧝‍♂", "🧛‍♀", "🧛", "🧛‍♂", "🧟‍♀",
            "🧟", "🧟‍♂", "🧞‍♀", "🧞", "🧞‍♂", "🧜‍♀", "🧜", "🧜‍♂", "🧚‍♀", "🧚", "🧚‍♂",
            "👼", "🤰", "🤱", "👩‍🍼", "🧑‍🍼", "👨‍🍼", "🙇‍♀", "🙇", "🙇‍♂", "💁‍♀", "💁", "💁‍♂",
            "🙅‍♀", "🙅", "🙅‍♂", "🙆‍♀", "🙆", "🙆‍♂", "🙋‍♀", "🙋", "🙋‍♂", "🧏‍♀", "🧏", "🧏‍♂",
            "🤦‍♀", "🤦", "🤦‍♂", "🤷‍♀", "🤷", "🤷‍♂", "🙎‍♀", "🙎", "🙎‍♂", "🙍‍♀", "🙍", "🙍‍♂",
            "💇‍♀", "💇", "💇‍♂", "💆‍♀", "💆", "💆‍♂", "🧖‍♀", "🧖", "🧖‍♂", "💅", "🤳", "💃",
            "🕺", "👯‍♀", "👯", "👯‍♂", "🕴", "👩‍🦽", "🧑‍🦽", "👨‍🦽", "👩‍🦼", "🧑‍🦼", "👨‍🦼",
            "🚶‍♀", "🚶", "🚶‍♂", "👩‍🦯", "🧑‍🦯", "👨‍🦯", "🧎‍♀", "🧎", "🧎‍♂", "🏃‍♀", "🏃", "🏃‍♂",
            "🧍‍♀", "🧍", "🧍‍♂", "👭", "🧑‍🤝‍🧑", "👬", "👫", "👩‍❤👩", "💑", "👨‍❤‍👨", "👩‍❤👨",
            "👩‍❤️‍💋‍👩", "💏", "👨‍❤️‍💋‍👨", "👩‍❤️‍💋‍👨", "👪", "👨‍👩‍👦", "👨‍👩‍👧", "👨‍👩‍👧‍👦",
            "👨‍👩‍👦‍👦", "👨‍👩‍👧‍👧", "👨‍👨‍👦", "👨‍👨‍👧", "👨‍👨‍👧‍👦", "👨‍👨‍👦‍👦", "👨‍👨‍👧‍👧", "👩‍👩‍👦",
            "👩‍👩‍👧", "👩‍👩‍👧‍👦", "👩‍👩‍👦‍👦", "👩‍👩‍👧‍👧", "👨‍👦", "👨‍👦‍👦", "👨‍👧", "👨‍👧‍👦", "👨‍👧‍👧",
            "👩‍👦", "👩‍👦‍👦", "👩‍👧", "👩‍👧‍👦", "👩‍👧‍👧", "🗣", "👤", "👥", "🫂",

            //Clothing and Accessories
            "🧳", "🌂", "☂", "🧵", "🪡", "🪢", "🧶", "👓", "🕶", "🥽", "🥼", "🦺", "👔", "👕", "👖", "🧣", "🧤", "🧥",
            "🧦", "👗", "👘", "🥻", "🩴", "🩱", "🩲", "🩳", "👙", "👚", "👛", "👜", "👝", "🎒", "👞", "👟", "🥾", "🥿",
            "👠", "👡", "🩰", "👢", "👑", "👒", "🎩", "🎓", "🧢", "⛑", "🪖", "💄", "💍", "💼","\uD83E\uDD72",

            //Emojis
            "👋🏻", "👋🏼", "👋🏽", "👋🏾", "👋🏿",
            "🤚🏻", "🤚🏼", "🤚🏽", "🤚🏾","🤚🏿",
            "🖐🏻", "🖐🏼", "🖐🏽", "🖐🏾", "🖐🏿",
            "✋🏻", "✋🏼", "✋🏽", "✋🏾", "✋🏿",
            "🖖🏻", "🖖🏼", "🖖🏽", "🖖🏾", "🖖🏿",
            "👌🏻", "👌🏼", "👌🏽", "👌🏾", "👌🏿",
            "🤌🏻", "🤌🏼", "🤌🏽", "🤌🏾", "🤌🏿",
            "🤏🏻", "🤏🏼", "🤏🏽", "🤏🏾", "🤏🏿",
            "✌🏻", "✌🏼", "✌🏽", "✌🏾", "✌🏿",
            "🤞🏻", "🤞🏼", "🤞🏽", "🤞🏾", "🤞🏿",
            "🤟🏻", "🤟🏼", "🤟🏽", "🤟🏾", "🤟🏿",
            "🤘🏻", "🤘🏼", "🤘🏽", "🤘🏾", "🤘🏿",
            "🤙🏻", "🤙🏼", "🤙🏽", "🤙🏾", "🤙🏿",
            "👈🏻", "👈🏼", "👈🏽", "👈🏾", "👈🏿",
            "👉🏻", "👉🏼", "👉🏽", "👉🏾", "👉🏿",
            "👆🏻", "👆🏼", "👆🏽", "👆🏾", "👆🏿",
            "🖕🏻", "🖕🏼", "🖕🏽", "🖕🏾", "🖕🏿",
            "👇🏻", "👇🏼", "👇🏽", "👇🏾", "👇🏿",
            "☝🏻", "☝🏼", "☝🏽", "☝🏾", "☝🏿",
            "👍🏻", "👍🏼", "👍🏽", "👍🏾", "👍🏿",
            "👎🏻", "👎🏼", "👎🏽", "👎🏾", "👎🏿",
            "✊🏻", "✊🏼", "✊🏽", "✊🏾", "✊🏿",
            "👊🏻", "👊🏼", "👊🏽", "👊🏾", "👊🏿",
            "🤛🏻", "🤛🏼", "🤛🏽", "🤛🏾", "🤛🏿",
            "🤜🏻", "🤜🏼", "🤜🏽", "🤜🏾", "🤜🏿",
            "👏🏻", "👏🏼", "👏🏽", "👏🏾", "👏🏿",
            "🙌🏻", "🙌🏼", "🙌🏽", "🙌🏾", "🙌🏿",
            "👐🏻", "👐🏼", "👐🏽", "👐🏾", "👐🏿",
            "🤲🏻", "🤲🏼", "🤲🏽", "🤲🏾", "🤲🏿",
            "🙏🏻", "🙏🏼", "🙏🏽", "🙏🏾", "🙏🏿",
            "✍🏻", "✍🏼", "✍🏽", "✍🏾", "✍🏿",
            "💅🏻", "💅🏼", "💅🏽", "💅🏾", "💅🏿",
            "🤳🏻", "🤳🏼", "🤳🏽", "🤳🏾", "🤳🏿",
            "💪🏻", "💪🏼", "💪🏽", "💪🏾", "💪🏿",
            "🦵🏻", "🦵🏼", "🦵🏽", "🦵🏾", "🦵🏿",
            "🦶🏻", "🦶🏼", "🦶🏽", "🦶🏾", "🦶🏿",
            "👂🏻", "👂🏼", "👂🏽", "👂🏾", "👂🏿",
            "🦻🏻", "🦻🏼", "🦻🏽", "🦻🏾", "🦻🏿",
            "👃🏻", "👃🏼", "👃🏽", "👃🏾", "👃🏿",
            "👶🏻", "👶🏼", "👶🏽", "👶🏾", "👶🏿",
            "👧🏻", "👧🏼", "👧🏽", "👧🏾", "👧🏿",
            "🧒🏻", "🧒🏼", "🧒🏽", "🧒🏾", "🧒🏿",
            "👦🏻", "👦🏼", "👦🏽", "👦🏾", "👦🏿",
            "👩🏻", "👩🏼", "👩🏽", "👩🏾", "👩🏿",
            "🧑🏻", "🧑🏼", "🧑🏽", "🧑🏾", "🧑🏿",
            "👨🏻", "👨🏼", "👨🏽", "👨🏾", "👨🏿",
            "👩🏻‍🦱", "👩🏼‍🦱", "👩🏽‍🦱", "👩🏾‍🦱", "👩🏿‍🦱",
            "🧑🏻‍🦱", "🧑🏼‍🦱", "🧑🏽‍🦱", "🧑🏾‍🦱", "🧑🏿‍🦱",
            "👨🏻‍🦱", "👨🏼‍🦱", "👨🏽‍🦱", "👨🏾‍🦱", "👨🏿‍🦱",
            "👩🏻‍🦰", "👩🏼‍🦰", "👩🏽‍🦰", "👩🏾‍🦰", "👩🏿‍🦰",
            "🧑🏻‍🦰", "🧑🏼‍🦰", "🧑🏽‍🦰", "🧑🏾‍🦰", "🧑🏿‍🦰",
            "👨🏻‍🦰", "👨🏼‍🦰", "👨🏽‍🦰", "👨🏾‍🦰", "👨🏿‍🦰",
            "👱🏻‍♀", "👱🏼‍♀", "👱🏽‍♀", "👱🏾‍♀", "👱🏿‍♀",
            "👱🏻", "👱🏼", "👱🏽", "👱🏾", "👱🏿",
            "👱🏻‍♂", "👱🏼‍♂", "👱🏽‍♂", "👱🏾‍♂", "👱🏿‍♂",
            "👩🏻‍🦳", "👩🏼‍🦳", "👩🏽‍🦳", "👩🏾‍🦳", "👩🏿‍🦳",
            "🧑🏻‍🦳", "🧑🏼‍🦳", "🧑🏽‍🦳", "🧑🏾‍🦳", "🧑🏿‍🦳",
            "👨🏻‍🦳", "👨🏼‍🦳", "👨🏽‍🦳", "👨🏾‍🦳", "👨🏿‍🦳",
            "👩🏻‍🦲", "👩🏼‍🦲", "👩🏽‍🦲", "👩🏾‍🦲", "👩🏿‍🦲",
            "🧑🏻‍🦲", "🧑🏼‍🦲", "🧑🏽‍🦲", "🧑🏾‍🦲", "🧑🏿‍🦲",
            "👨🏻‍🦲", "👨🏼‍🦲", "👨🏽‍🦲", "👨🏾‍🦲", "👨🏿‍🦲",
            "🧔🏻", "🧔🏼", "🧔🏽", "🧔🏾", "🧔🏿",
            "👵🏻", "👵🏼", "👵🏽", "👵🏾", "👵🏿",
            "🧓🏻", "🧓🏼", "🧓🏽", "🧓🏾", "🧓🏿",
            "👴🏻", "👴🏼", "👴🏽", "👴🏾", "👴🏿",
            "👲🏻", "👲🏼", "👲🏽", "👲🏾", "👲🏿",
            "👳🏻‍♀", "👳🏼‍♀", "👳🏽‍♀", "👳🏾‍♀", "👳🏿‍♀",
            "👳🏻", "👳🏼", "👳🏽", "👳🏾", "👳🏿",
            "👳🏻‍♂", "👳🏼‍♂", "👳🏽‍♂", "👳🏾‍♂", "👳🏿‍♂",
            "🧕🏻", "🧕🏼", "🧕🏽", "🧕🏾", "🧕🏿",
            "👮🏻‍♀", "👮🏼‍♀", "👮🏽‍♀", "👮🏾‍♀", "👮🏿‍♀",
            "👮🏻", "👮🏼", "👮🏽", "👮🏾", "👮🏿",
            "👮🏻‍♂", "👮🏼‍♂", "👮🏽‍♂", "👮🏾‍♂", "👮🏿‍♂",
            "👷🏻‍♀", "👷🏼‍♀", "👷🏽‍♀", "👷🏾‍♀", "👷🏿‍♀",
            "👷🏻", "👷🏼", "👷🏽", "👷🏾", "👷🏿",
            "👷🏻‍♂", "👷🏼‍♂", "👷🏽‍♂", "👷🏾‍♂", "👷🏿‍♂",
            "💂🏻‍♀", "💂🏼‍♀", "💂🏽‍♀", "💂🏾‍♀", "💂🏿‍♀",
            "💂🏻", "💂🏼", "💂🏽", "💂🏾", "💂🏿",
            "💂🏻‍♂", "💂🏼‍♂", "💂🏽‍♂", "💂🏾‍♂", "💂🏿‍♂",
            "🕵🏻‍♀", "🕵🏼‍♀", "🕵🏽‍♀", "🕵🏾‍♀", "🕵🏿‍♀",
            "🕵🏻", "🕵🏼", "🕵🏽", "🕵🏾", "🕵🏿",
            "🕵🏻‍♂", "🕵🏼‍♂", "🕵🏽‍♂", "🕵🏾‍♂", "🕵🏿‍♂",
            "👩🏻‍⚕", "👩🏼‍⚕", "👩🏽‍⚕", "👩🏾‍⚕", "👩🏿‍⚕",
            "🧑🏻‍⚕", "🧑🏼‍⚕", "🧑🏽‍⚕", "🧑🏾‍⚕", "🧑🏿‍⚕",
            "👨🏻‍⚕", "👨🏼‍⚕", "👨🏽‍⚕", "👨🏾‍⚕", "👨🏿‍⚕",
            "👩🏻‍🌾", "👩🏼‍🌾", "👩🏽‍🌾", "👩🏾‍🌾", "👩🏿‍🌾",
            "🧑🏻‍🌾", "🧑🏼‍🌾", "🧑🏽‍🌾", "🧑🏾‍🌾", "🧑🏿‍🌾",
            "👨🏻‍🌾", "👨🏼‍🌾", "👨🏽‍🌾", "👨🏾‍🌾", "👨🏿‍🌾",
            "👩🏻‍🍳", "👩🏼‍🍳", "👩🏽‍🍳", "👩🏾‍🍳", "👩🏿‍🍳",
            "🧑🏻‍🍳", "🧑🏼‍🍳", "🧑🏽‍🍳", "🧑🏾‍🍳", "🧑🏿‍🍳",
            "👨🏻‍🍳", "👨🏼‍🍳", "👨🏽‍🍳", "👨🏾‍🍳", "👨🏿‍🍳",
            "👩🏻‍🎓", "👩🏼‍🎓", "👩🏽‍🎓", "👩🏾‍🎓", "👩🏿‍🎓",
            "🧑🏻‍🎓", "🧑🏼‍🎓", "🧑🏽‍🎓", "🧑🏾‍🎓", "🧑🏿‍🎓",
            "👨🏻‍🎓", "👨🏼‍🎓", "👨🏽‍🎓", "👨🏾‍🎓", "👨🏿‍🎓",
            "👩🏻‍🎤", "👩🏼‍🎤", "👩🏽‍🎤", "👩🏾‍🎤", "👩🏿‍🎤",
            "🧑🏻‍🎤", "🧑🏼‍🎤", "🧑🏽‍🎤", "🧑🏾‍🎤", "🧑🏿‍🎤",
            "👨🏻‍🎤", "👨🏼‍🎤", "👨🏽‍🎤", "👨🏾‍🎤", "👨🏿‍🎤",
            "👩🏻‍🏫", "👩🏼‍🏫", "👩🏽‍🏫", "👩🏾‍🏫", "👩🏿‍🏫",
            "🧑🏻‍🏫", "🧑🏼‍🏫", "🧑🏽‍🏫", "🧑🏾‍🏫", "🧑🏿‍🏫",
            "👨🏻‍🏫", "👨🏼‍🏫", "👨🏽‍🏫", "👨🏾‍🏫", "👨🏿‍🏫",
            "👩🏻‍🏭", "👩🏼‍🏭", "👩🏽‍🏭", "👩🏾‍🏭", "👩🏿‍🏭",
            "🧑🏻‍🏭", "🧑🏼‍🏭", "🧑🏽‍🏭", "🧑🏾‍🏭", "🧑🏿‍🏭",
            "👨🏻‍🏭", "👨🏼‍🏭", "👨🏽‍🏭", "👨🏾‍🏭", "👨🏿‍🏭",
            "👩🏻‍💻", "👩🏼‍💻", "👩🏽‍💻", "👩🏾‍💻", "👩🏿‍💻",
            "🧑🏻‍💻", "🧑🏼‍💻", "🧑🏽‍💻", "🧑🏾‍💻", "🧑🏿‍💻",
            "👨🏻‍💻", "👨🏼‍💻", "👨🏽‍💻", "👨🏾‍💻", "👨🏿‍💻",
            "👩🏻‍💼", "👩🏼‍💼", "👩🏽‍💼", "👩🏾‍💼", "👩🏿‍💼",
            "🧑🏻‍💼", "🧑🏼‍💼", "🧑🏽‍💼", "🧑🏾‍💼", "🧑🏿‍💼",
            "👨🏻‍💼", "👨🏼‍💼", "👨🏽‍💼", "👨🏾‍💼", "👨🏿‍💼",
            "👩🏻‍🔧", "👩🏼‍🔧", "👩🏽‍🔧", "👩🏾‍🔧", "👩🏿‍🔧",
            "🧑🏻‍🔧", "🧑🏼‍🔧", "🧑🏽‍🔧", "🧑🏾‍🔧", "🧑🏿‍🔧",
            "👨🏻‍🔧", "👨🏼‍🔧", "👨🏽‍🔧", "👨🏾‍🔧", "👨🏿‍🔧",
            "👩🏻‍🔬", "👩🏼‍🔬", "👩🏽‍🔬", "👩🏾‍🔬", "👩🏿‍🔬",
            "🧑🏻‍🔬", "🧑🏼‍🔬", "🧑🏽‍🔬", "🧑🏾‍🔬", "🧑🏿‍🔬",
            "👨🏻‍🔬", "👨🏼‍🔬", "👨🏽‍🔬", "👨🏾‍🔬", "👨🏿‍🔬",
            "👩🏻‍🎨", "👩🏼‍🎨", "👩🏽‍🎨", "👩🏾‍🎨", "👩🏿‍🎨",
            "🧑🏻‍🎨", "🧑🏼‍🎨", "🧑🏽‍🎨", "🧑🏾‍🎨", "🧑🏿‍🎨",
            "👨🏻‍🎨", "👨🏼‍🎨", "👨🏽‍🎨", "👨🏾‍🎨", "👨🏿‍🎨",
            "👩🏻‍🚒", "👩🏼‍🚒", "👩🏽‍🚒", "👩🏾‍🚒", "👩🏿‍🚒",
            "🧑🏻‍🚒", "🧑🏼‍🚒", "🧑🏽‍🚒", "🧑🏾‍🚒", "🧑🏿‍🚒",
            "👨🏻‍🚒", "👨🏼‍🚒", "👨🏽‍🚒", "👨🏾‍🚒", "👨🏿‍🚒",
            "👩🏻‍✈", "👩🏼‍✈", "👩🏽‍✈", "👩🏾‍✈", "👩🏿‍✈",
            "🧑🏻‍✈", "🧑🏼‍✈", "🧑🏽‍✈", "🧑🏾‍✈", "🧑🏿‍✈",
            "👨🏻‍✈", "👨🏼‍✈", "👨🏽‍✈", "👨🏾‍✈", "👨🏿‍✈",
            "👩🏻‍🚀", "👩🏼‍🚀", "👩🏽‍🚀", "👩🏾‍🚀", "👩🏿‍🚀",
            "🧑🏻‍🚀", "🧑🏼‍🚀", "🧑🏽‍🚀", "🧑🏾‍🚀", "🧑🏿‍🚀",
            "👨🏻‍🚀", "👨🏼‍🚀", "👨🏽‍🚀", "👨🏾‍🚀", "👨🏿‍🚀",
            "👩🏻‍⚖", "👩🏼‍⚖", "👩🏽‍⚖", "👩🏾‍⚖", "👩🏿‍⚖",
            "🧑🏻‍⚖", "🧑🏼‍⚖", "🧑🏽‍⚖", "🧑🏾‍⚖", "🧑🏿‍⚖",
            "👨🏻‍⚖", "👨🏼‍⚖", "👨🏽‍⚖", "👨🏾‍⚖", "👨🏿‍⚖",
            "👰🏻‍♀", "👰🏼‍♀", "👰🏽‍♀", "👰🏾‍♀", "👰🏿‍♀",
            "👰🏻", "👰🏼", "👰🏽", "👰🏾", "👰🏿",
            "👰🏻‍♂", "👰🏼‍♂", "👰🏽‍♂", "👰🏾‍♂", "👰🏿‍♂",
            "🤵🏻‍♀", "🤵🏼‍♀", "🤵🏽‍♀", "🤵🏾‍♀", "🤵🏿‍♀",
            "🤵🏻", "🤵🏼", "🤵🏽", "🤵🏾", "🤵🏿",
            "🤵🏻‍♂", "🤵🏼‍♂", "🤵🏽‍♂", "🤵🏾‍♂", "🤵🏿‍♂",
            "👸🏻", "👸🏼", "👸🏽", "👸🏾", "👸🏿",
            "🤴🏼", "🤴🏼", "🤴🏽", "🤴🏾", "🤴🏿",
            "🥷🏻", "🥷🏼", "🥷🏽", "🥷🏾", "🥷🏿",
            "🦸🏻‍♀", "🦸🏼‍♀", "🦸🏽‍♀", "🦸🏾‍♀", "🦸🏿‍♀",
            "🦸🏻", "🦸🏼", "🦸🏽", "🦸🏾", "🦸🏿",
            "🦸🏻‍♂", "🦸🏼‍♂", "🦸🏽‍♂", "🦸🏾‍♂", "🦸🏿‍♂",
            "🦹🏻‍♀", "🦹🏼‍♀", "🦹🏽‍♀", "🦹🏾‍♀", "🦹🏿‍♀",
            "🦹🏻", "🦹🏼", "🦹🏽", "🦹🏾", "🦹🏿",
            "🦹🏻‍♂", "🦹🏼‍♂", "🦹🏽‍♂", "🦹🏾‍♂", "🦹🏿‍♂",
            "🤶🏻", "🤶🏼", "🤶🏽", "🤶🏾", "🤶🏿",
            "🧑🏻‍🎄", "🧑🏼‍🎄", "🧑🏽‍🎄", "🧑🏾‍🎄", "🧑🏿‍🎄",
            "🎅🏻", "🎅🏼", "🎅🏽", "🎅🏾", "🎅🏿",
            "🧙🏻‍♀", "🧙🏼‍♀", "🧙🏽‍♀", "🧙🏾‍♀", "🧙🏿‍♀",
            "🧙🏻", "🧙🏼", "🧙🏽", "🧙🏾", "🧙🏿",
            "🧙🏻‍♂", "🧙🏼‍♂", "🧙🏽‍♂", "🧙🏾‍♂", "🧙🏿‍♂",
            "🧝🏻‍♀", "🧝🏼‍♀", "🧝🏽‍♀", "🧝🏾‍♀", "🧝🏿‍♀",
            "🧝🏻", "🧝🏼", "🧝🏽", "🧝🏾", "🧝🏿",
            "🧝🏻‍♂", "🧝🏼‍♂", "🧝🏽‍♂", "🧝🏾‍♂", "🧝🏿‍♂",
            "🧛🏻‍♀", "🧛🏼‍♀", "🧛🏽‍♀", "🧛🏾‍♀", "🧛🏿‍♀",
            "🧛🏻", "🧛🏼", "🧛🏽", "🧛🏾", "🧛🏿",
            "🧛🏻‍♂", "🧛🏼‍♂", "🧛🏽‍♂", "🧛🏾‍♂", "🧛🏿‍♂",
            "🧜🏻‍♀", "🧜🏼‍♀", "🧜🏽‍♀", "🧜🏾‍♀", "🧜🏿‍♀",
            "🧜🏻", "🧜🏼", "🧜🏽", "🧜🏾", "🧜🏿",
            "🧜🏻‍♂", "🧜🏼‍♂", "🧜🏽‍♂", "🧜🏾‍♂", "🧜🏿‍♂",
            "🧚🏻‍♀", "🧚🏼‍♀", "🧚🏽‍♀", "🧚🏾‍♀", "🧚🏿‍♀",
            "🧚🏻", "🧚🏼", "🧚🏽", "🧚🏾", "🧚🏿",
            "🧚🏻‍♂", "🧚🏼‍♂", "🧚🏽‍♂", "🧚🏾‍♂", "🧚🏿‍♂",
            "👼🏻", "👼🏼", "👼🏽", "👼🏾", "👼🏿",
            "🤰🏻", "🤰🏼", "🤰🏽", "🤰🏾", "🤰🏿",
            "🤱🏻", "🤱🏼", "🤱🏽", "🤱🏾", "🤱🏿",
            "👩🏻‍🍼", "👩🏼‍🍼", "👩🏽‍🍼", "👩🏾‍🍼", "👩🏿‍🍼",
            "🧑🏻‍🍼", "🧑🏼‍🍼", "🧑🏽‍🍼", "🧑🏾‍🍼", "🧑🏿‍🍼",
            "👨🏻‍🍼", "👨🏼‍🍼", "👨🏽‍🍼", "👨🏾‍🍼", "👨🏿‍🍼",
            "🙇🏻‍♀", "🙇🏼‍♀", "🙇🏽‍♀", "🙇🏾‍♀", "🙇🏿‍♀",
            "🙇🏻", "🙇🏼", "🙇🏽", "🙇🏾", "🙇🏿",
            "🙇🏻‍♂", "🙇🏼‍♂", "🙇🏽‍♂", "🙇🏾‍♂", "🙇🏿‍♂",
            "💁🏻‍♀", "💁🏼‍♀", "💁🏽‍♀", "💁🏾‍♀", "💁🏿‍♀",
            "💁🏻", "💁🏼", "💁🏽", "💁🏾", "💁🏿",
            "💁🏻‍♂", "💁🏼‍♂", "💁🏽‍♂", "💁🏾‍♂", "💁🏿‍♂",
            "🙅🏻‍♀", "🙅🏼‍♀", "🙅🏽‍♀", "🙅🏾‍♀", "🙅🏿‍♀",
            "🙅🏻", "🙅🏼", "🙅🏽", "🙅🏾", "🙅🏿",
            "🙅🏻‍♂", "🙅🏼‍♂", "🙅🏽‍♂", "🙅🏾‍♂", "🙅🏿‍♂",
            "🙆🏻‍♀", "🙆🏼‍♀", "🙆🏽‍♀", "🙆🏾‍♀", "🙆🏿‍♀",
            "🙆🏻", "🙆🏼", "🙆🏽", "🙆🏾", "🙆🏿",
            "🙆🏻‍♂", "🙆🏼‍♂", "🙆🏽‍♂", "🙆🏾‍♂", "🙆🏿‍♂",
            "🙋🏻‍♀", "🙋🏼‍♀", "🙋🏽‍♀", "🙋🏾‍♀", "🙋🏿‍♀",
            "🙋🏻", "🙋🏼", "🙋🏽", "🙋🏾", "🙋🏿",
            "🙋🏻‍♂", "🙋🏼‍♂", "🙋🏽‍♂", "🙋🏾‍♂", "🙋🏿‍♂",
            "🧏🏻‍♀", "🧏🏼‍♀", "🧏🏽‍♀", "🧏🏾‍♀", "🧏🏿‍♀",
            "🧏🏻", "🧏🏼", "🧏🏽", "🧏🏾", "🧏🏿",
            "🧏🏻‍♂", "🧏🏼‍♂", "🧏🏽‍♂", "🧏🏾‍♂", "🧏🏿‍♂",
            "🤦🏻‍♀", "🤦🏼‍♀", "🤦🏽‍♀", "🤦🏾‍♀", "🤦🏿‍♀",
            "🤦🏻", "🤦🏼", "🤦🏽", "🤦🏾", "🤦🏿",
            "🤦🏻‍♂", "🤦🏼‍♂", "🤦🏽‍♂", "🤦🏾‍♂", "🤦🏿‍♂",
            "🤷🏻‍♀", "🤷🏼‍♀", "🤷🏽‍♀", "🤷🏾‍♀", "🤷🏿‍♀",
            "🤷🏻", "🤷🏼", "🤷🏽", "🤷🏾", "🤷🏿",
            "🤷🏻‍♂", "🤷🏼‍♂", "🤷🏽‍♂", "🤷🏾‍♂", "🤷🏿‍♂",
            "🙎🏻‍♀", "🙎🏼‍♀", "🙎🏽‍♀", "🙎🏾‍♀", "🙎🏿‍♀",
            "🙎🏻", "🙎🏼", "🙎🏽", "🙎🏾", "🙎🏿",
            "🙎🏻‍♂", "🙎🏼‍♂", "🙎🏽‍♂", "🙎🏾‍♂", "🙎🏿‍♂",
            "🙍🏻‍♀", "🙍🏼‍♀", "🙍🏽‍♀", "🙍🏾‍♀", "🙍🏿‍♀",
            "🙍🏻", "🙍🏼", "🙍🏽", "🙍🏾", "🙍🏿",
            "🙍🏻‍♂", "🙍🏼‍♂", "🙍🏽‍♂", "🙍🏾‍♂", "🙍🏿‍♂",
            "💇🏻‍♀", "💇🏼‍♀", "💇🏽‍♀", "💇🏾‍♀", "💇🏿‍♀",
            "💇🏻", "💇🏼", "💇🏽", "💇🏾", "💇🏿",
            "💇🏻‍♂", "💇🏼‍♂", "💇🏽‍♂", "💇🏾‍♂", "💇🏿‍♂",
            "💆🏻‍♀", "💆🏼‍♀", "💆🏽‍♀", "💆🏾‍♀", "💆🏿‍♀",
            "💆🏻", "💆🏼", "💆🏽", "💆🏾", "💆🏿",
            "💆🏻‍♂", "💆🏼‍♂", "💆🏽‍♂", "💆🏾‍♂", "💆🏿‍♂",
            "🧖🏻‍♀", "🧖🏼‍♀", "🧖🏽‍♀", "🧖🏾‍♀", "🧖🏿‍♀",
            "🧖🏻", "🧖🏼", "🧖🏽", "🧖🏾", "🧖🏿",
            "🧖🏻‍♂", "🧖🏼‍♂", "🧖🏽‍♂", "🧖🏾‍♂", "🧖🏿‍♂",
            "💃🏻", "💃🏼", "💃🏽", "💃🏾", "💃🏿",
            "🕺🏻", "🕺🏼", "🕺🏽", "🕺🏾", "🕺🏿",
            "🕴🏻", "🕴🏼", "🕴🏽", "🕴🏿", "🕴🏿",
            "👩🏻‍🦽", "👩🏼‍🦽", "👩🏽‍🦽", "👩🏾‍🦽", "👩🏿‍🦽",
            "🧑🏻‍🦽", "🧑🏼‍🦽", "🧑🏽‍🦽", "🧑🏾‍🦽", "🧑🏿‍🦽",
            "👨🏻‍🦽", "👨🏼‍🦽", "👨🏽‍🦽", "👨🏾‍🦽", "👨🏿‍🦽",
            "👩🏻‍🦼", "👩🏼‍🦼", "👩🏽‍🦼", "👩🏾‍🦼", "👩🏿‍🦼",
            "🧑🏻‍🦼", "🧑🏼‍🦼", "🧑🏽‍🦼", "🧑🏾‍🦼", "🧑🏿‍🦼",
            "👨🏻‍🦼", "👨🏼‍🦼", "👨🏽‍🦼", "👨🏾‍🦼", "👨🏿‍🦼",
            "🚶🏻‍♀", "🚶🏼‍♀", "🚶🏽‍♀", "🚶🏾‍♀", "🚶🏿‍♀",
            "🚶🏻", "🚶🏼", "🚶🏽", "🚶🏾", "🚶🏿",
            "🚶🏻‍♂", "🚶🏼‍♂", "🚶🏽‍♂", "🚶🏾‍♂", "🚶🏿‍♂",
            "👩🏻‍🦯", "👩🏼‍🦯", "👩🏽‍🦯", "👩🏾‍🦯", "👩🏿‍🦯",
            "🧑🏻‍🦯", "🧑🏼‍🦯", "🧑🏽‍🦯", "🧑🏾‍🦯", "🧑🏿‍🦯",
            "👨🏻‍🦯", "👨🏼‍🦯", "👨🏽‍🦯", "👨🏾‍🦯", "👨🏿‍🦯",
            "🧎🏻‍♀", "🧎🏼‍♀", "🧎🏽‍♀", "🧎🏾‍♀", "🧎🏿‍♀",
            "🧎🏻", "🧎🏼", "🧎🏽", "🧎🏾", "🧎🏿",
            "🧎🏻‍♂", "🧎🏼‍♂", "🧎🏽‍♂", "🧎🏾‍♂", "🧎🏿‍♂",
            "🏃🏻‍♀", "🏃🏼‍♀", "🏃🏽‍♀", "🏃🏾‍♀", "🏃🏿‍♀",
            "🏃🏻", "🏃🏼", "🏃🏽", "🏃🏾", "🏃🏿",
            "🏃🏻‍♂", "🏃🏼‍♂", "🏃🏽‍♂", "🏃🏾‍♂", "🏃🏿‍♂",
            "🧍🏻‍♀", "🧍🏼‍♀", "🧍🏽‍♀", "🧍🏾‍♀", "🧍🏿‍♀",
            "🧍🏻", "🧍🏼", "🧍🏽", "🧍🏾", "🧍🏿",
            "🧍🏻‍♂", "🧍🏼‍♂", "🧍🏽‍♂", "🧍🏾‍♂", "🧍🏿‍♂",
            "👭🏻", "👭🏼", "👭🏽", "👭🏾", "👭🏿",
            "🧑🏻‍🤝‍🧑🏻", "🧑🏼‍🤝‍🧑🏼", "🧑🏽‍🤝‍🧑🏽", "🧑🏾‍🤝‍🧑🏾", "🧑🏿‍🤝‍🧑🏿",
            "👬🏻", "👬🏼", "👬🏽", "👬🏾", "👬🏿",
            "👫🏻", "👫🏼", "👫🏽", "👫🏾", "👫🏿",
            "🧗🏻‍♀", "🧗🏼‍♀", "🧗🏽‍♀", "🧗🏾‍♀", "🧗🏿‍♀",
            "🧗🏻", "🧗🏼", "🧗🏽", "🧗🏾", "🧗🏿",
            "🧗🏻‍♂", "🧗🏼‍♂", "🧗🏽‍♂", "🧗🏾‍♂", "🧗🏿‍♂",
            "🏇🏻", "🏇🏼", "🏇🏽", "🏇🏾", "🏇🏿",
            "🏂🏻", "🏂🏼", "🏂🏽", "🏂🏾", "🏂🏿",
            "🏌🏻‍♀", "🏌🏼‍♀", "🏌🏽‍♀", "🏌🏾‍♀", "🏌🏿‍♀",
            "🏌🏻", "🏌🏼", "🏌🏽", "🏌🏾", "🏌🏿",
            "🏌🏻‍♂", "🏌🏼‍♂", "🏌🏽‍♂", "🏌🏾‍♂", "🏌🏿‍♂",
            "🏄🏻‍♀", "🏄🏼‍♀", "🏄🏽‍♀", "🏄🏾‍♀", "🏄🏿‍♀",
            "🏄🏻", "🏄🏼", "🏄🏽", "🏄🏾", "🏄🏿",
            "🏄🏻‍♂", "🏄🏼‍♂", "🏄🏽‍♂", "🏄🏾‍♂", "🏄🏿‍♂",
            "🚣🏻‍♀", "🚣🏼‍♀", "🚣🏽‍♀", "🚣🏾‍♀", "🚣🏿‍♀",
            "🚣🏻", "🚣🏼", "🚣🏽", "🚣🏾", "🚣🏿",
            "🚣🏻‍♂", "🚣🏼‍♂", "🚣🏽‍♂", "🚣🏾‍♂", "🚣🏿‍♂",
            "🏊🏻‍♀", "🏊🏼‍♀", "🏊🏽‍♀", "🏊🏾‍♀", "🏊🏿‍♀",
            "🏊🏻", "🏊🏼", "🏊🏽", "🏊🏾", "🏊🏿",
            "🏊🏻‍♂", "🏊🏼‍♂", "🏊🏽‍♂", "🏊🏾‍♂", "🏊🏿‍♂",
            "⛹🏻‍♀", "⛹🏼‍♀", "⛹🏽‍♀", "⛹🏾‍♀", "⛹🏿‍♀",
            "⛹🏻", "⛹🏼", "⛹🏽", "⛹🏾", "⛹🏿",
            "⛹🏻‍♂", "⛹🏼‍♂", "⛹🏽‍♂", "⛹🏾‍♂", "⛹🏿‍♂",
            "🏋🏻‍♀", "🏋🏼‍♀", "🏋🏽‍♀", "🏋🏾‍♀", "🏋🏿‍♀",
            "🏋🏻", "🏋🏼", "🏋🏽", "🏋🏾", "🏋🏿",
            "🏋🏻‍♂", "🏋🏼‍♂", "🏋🏽‍♂", "🏋🏾‍♂", "🏋🏿‍♂",
            "🚴🏻‍♀", "🚴🏼‍♀", "🚴🏽‍♀", "🚴🏾‍♀", "🚴🏿‍♀",
            "🚴🏻", "🚴🏼", "🚴🏽", "🚴🏾", "🚴🏿",
            "🚴🏻‍♂", "🚴🏼‍♂", "🚴🏽‍♂", "🚴🏾‍♂", "🚴🏿‍♂",
            "🚵🏻‍♀", "🚵🏼‍♀", "🚵🏽‍♀", "🚵🏾‍♀", "🚵🏿‍♀",
            "🚵🏻", "🚵🏼", "🚵🏽", "🚵🏾", "🚵🏿",
            "🚵🏻‍♂", "🚵🏼‍♂", "🚵🏽‍♂", "🚵🏾‍♂", "🚵🏿‍♂",
            "🤸🏻‍♀", "🤸🏼‍♀", "🤸🏽‍♀", "🤸🏾‍♀", "🤸🏿‍♀",
            "🤸🏻", "🤸🏼", "🤸🏽", "🤸🏾", "🤸🏿",
            "🤸🏻‍♂", "🤸🏼‍♂", "🤸🏽‍♂", "🤸🏾‍♂", "🤸🏿‍♂",
            "🤽🏻‍♀", "🤽🏼‍♀", "🤽🏽‍♀", "🤽🏾‍♀", "🤽🏿‍♀",
            "🤽🏻", "🤽🏼", "🤽🏽", "🤽🏾", "🤽🏿",
            "🤽🏻‍♂", "🤽🏼‍♂", "🤽🏽‍♂", "🤽🏾‍♂", "🤽🏿‍♂",
            "🤾🏻‍♀", "🤾🏼‍♀", "🤾🏽‍♀", "🤾🏾‍♀", "🤾🏿‍♀",
            "🤾🏻", "🤾🏼", "🤾🏽", "🤾🏾", "🤾🏿",
            "🤾🏻‍♂", "🤾🏼‍♂", "🤾🏽‍♂", "🤾🏾‍♂", "🤾🏿‍♂",
            "🤹🏻‍♀", "🤹🏼‍♀", "🤹🏽‍♀", "🤹🏾‍♀", "🤹🏿‍♀",
            "🤹🏻", "🤹🏼", "🤹🏽", "🤹🏾", "🤹🏿",
            "🤹🏻‍♂", "🤹🏼‍♂", "🤹🏽‍♂", "🤹🏾‍♂", "🤹🏿‍♂",
            "🧘🏻‍♀", "🧘🏼‍♀", "🧘🏽‍♀", "🧘🏾‍♀", "🧘🏿‍♀",
            "🧘🏻", "🧘🏼", "🧘🏽", "🧘🏾", "🧘🏿",
            "🧘🏻‍♂", "🧘🏼‍♂", "🧘🏽‍♂", "🧘🏾‍♂", "🧘🏿‍♂",
            "🛀🏻", "🛀🏼", "🛀🏽", "🛀🏾", "🛀🏿",
            "🛌🏻", "🛌🏼", "🛌🏽", "🛌🏾", "🛌🏿",


            //Animals & Nature
            "🐶", "🐱", "🐭", "🐹", "🐰", "🦊", "🐻", "🐼", "🐻‍❄", "🐨", "🐯", "🦁", "🐮", "🐷", "🐽", "🐸", "🐵", "🙈", "🙉", "🙊",
            "🐒", "🐔", "🐧", "🐦", "🐤", "🐣", "🐥", "🦆", "🦅", "🦉", "🦇", "🐺", "🐗", "🐴", "🦄", "🐝", "🪱", "🐛", "🦋", "🐌",
            "🐞", "🐜", "🪰", "🪲", "🪳", "🦟", "🦗", "🕷", "🕸", "🦂", "🐢", "🐍", "🦎", "🦖", "🦕", "🐙", "🦑", "🦐", "🦞",
            "🦀", "🐡", "🐠", "🐟", "🐬", "🐳", "🐋", "🦈", "🐊", "🐅", "🐆", "🦓", "🦍", "🦧", "🦣", "🐘", "🦛", "🦏", "🐪", "🐫",
            "🦒", "🦘", "🦬", "🐃", "🐂", "🐄", "🐎", "🐖", "🐏", "🐑", "🦙", "🐐", "🦌", "🐕", "🐩", "🦮", "🐕‍🦺", "🐈", "🐈‍⬛",
            "🪶", "🐓", "🦃", "🦤", "🦚", "🦜", "🦢", "🦩", "🕊", "🐇", "🦝", "🦨", "🦡", "🦫", "🦦", "🦥", "🐁", "🐀", "🐿",
            "🦔", "🐾", "🐉", "🐲", "🌵", "🎄", "🌲", "🌳", "🌴", "🪵", "🌱", "🌿", "☘", "🍀", "🎍", "🪴", "🎋", "🍃", "🍂", "🍁",
            "🍄", "🐚", "🪨", "🌾", "💐", "🌷", "🌹", "🥀", "🌺", "🌸", "🌼", "🌻", "🌞", "🌝", "🌛", "🌜", "🌚", "🌕", "🌖", "🌗", "🌘",
            "🌑", "🌒", "🌓", "🌔", "🌙", "🌎", "🌍", "🌏", "🪐", "💫", "⭐", "🌟", "✨", "⚡", "☄", "💥", "🔥", "🌪", "🌈", "☀", "🌤",
            "⛅", "🌥", "☁", "🌦", "🌧", "⛈", "🌩", "🌨", "❄", "☃", "⛄", "🌬", "💨", "💧", "💦", "☔", "☂", "🌊", "🌫",


            //Food & Drink
            "🍏", "🍎", "🍐", "🍊", "🍋", "🍌", "🍉", "🍇", "🍓", "🫐", "🍈", "🍒", "🍑", "🥭", "🍍", "🥥", "🥝", "🍅", "🍆",
            "🥑", "🥦", "🥬", "🥒", "🌶", "🫑", "🌽", "🥕", "🫒", "🧄", "🧅", "🥔", "🍠", "🥐", "🥯", "🍞", "🥖", "🥨", "🧀",
            "🥚", "🍳", "🧈", "🥞", "🧇", "🥓", "🥩", "🍗", "🍖", "🦴", "🌭", "🍔", "🍟", "🍕", "🫓", "🥪", "🥙", "🧆", "🌮",
            "🌯", "🫔", "🥗", "🥘", "🫕", "🥫", "🍝", "🍜", "🍲", "🍛", "🍣", "🍱", "🥟", "🦪", "🍤", "🍙", "🍚", "🍘", "🍥",
            "🥠", "🥮", "🍢", "🍡", "🍧", "🍨", "🍦", "🥧", "🧁", "🍰", "🎂", "🍮", "🍭", "🍬", "🍫", "🍿", "🍩", "🍪", "🌰",
            "🥜", "🍯", "🥛", "🍼", "🫖", "☕", "🍵", "🧃", "🥤", "🧋", "🍶", "🍺", "🍻", "🥂", "🍷", "🥃", "🍸", "🍹", "🧉", "🍾",
            "🧊", "🥄", "🍴", "🍽", "🥣", "🥡", "🥢", "🧂",

            //Activity and Sports
            "⚽", "🏀", "🏈", "⚾", "🥎", "🎾", "🏐", "🏉", "🥏", "🎱", "🪀", "🏓", "🏸", "🏒", "🏑", "🥍", "🏏", "🪃",
            "🥅", "⛳", "🪁", "🏹", "🎣", "🤿", "🥊", "🥋", "🎽", "🛹", "🛼", "🛷", "⛸", "🥌", "🎿", "⛷", "🏂", "🪂",
            "🏋️‍♀", "🏋", "🏋️‍♂", "🤼‍♀", "🤼", "🤼‍♂", "🤸‍♀", "🤸", "🤸‍♂", "⛹‍♀", "⛹", "⛹‍♂", "🤺", "🤾‍♀", "🤾", "🤾‍♂",
            "🏌️‍♀", "🏌️", "🏌️‍♂", "🏇", "🧘‍♀", "🧘", "🧘‍♂", "🏄‍♀", "🏄", "🏄‍♂", "🏊‍♀", "🏊", "🏊‍♂", "🤽‍♀", "🤽", "🤽‍♂",
            "🚣‍♀", "🚣", "🚣‍♂", "🧗‍♀", "🧗", "🧗‍♂", "🚵‍♀", "🚵", "🚵‍♂", "🚴‍♀", "🚴", "🚴‍♂", "🏆", "🥇", "🥈", "🥉",
            "🏅", "🎖", "🏵", "🎗", "🎫", "🎟", "🎪", "🤹", "🤹‍♂", "🤹‍♀", "🎭", "🩰", "🎨", "🎬", "🎤", "🎧", "🎼", "🎹",
            "🥁", "🪘", "🎷", "🎺", "🪗", "🎸", "🪕", "🎻", "🎲", "♟", "🎯", "🎳", "🎮", "🎰", "🧩",


            //Travel & Places
            "🚗", "🚕", "🚙", "🚌", "🚎", "🏎", "🚓", "🚑", "🚒", "🚐", "🛻", "🚚", "🚛", "🚜", "🦯", "🦽", "🦼", "🛴", "🚲", "🛵", "🏍",
            "🛺", "🚨", "🚔", "🚍", "🚘", "🚖", "🚡", "🚠", "🚟", "🚃", "🚋", "🚞", "🚝", "🚄", "🚅", "🚈", "🚂", "🚆", "🚇", "🚊", "🚉", "✈",
            "🛫", "🛬", "🛩", "💺", "🛰", "🚀", "🛸", "🚁", "🛶", "⛵", "🚤", "🛥", "🛳", "⛴", "🚢", "⚓", "🪝", "⛽", "🚧", "🚦", "🚥", "🚏",
            "🗺", "🗿", "🗽", "🗼", "🏰", "🏯", "🏟", "🎡", "🎢", "🎠", "⛲", "⛱", "🏖", "🏝", "🏜", "🌋", "⛰", "🏔", "🗻", "🏕", "⛺", "🛖",
            "🏠", "🏡", "🏘", "🏚", "🏗", "🏭", "🏢", "🏬", "🏣", "🏤", "🏥", "🏦", "🏨", "🏪", "🏫", "🏩", "💒", "🏛", "⛪", "🕌", "🕍", "🛕",
            "🕋", "⛩", "🛤", "🛣", "🗾", "🎑", "🏞", "🌅", "🌄", "🌠", "🎇", "🎆", "🌇", "🌆", "🏙", "🌃", "🌌", "🌉", "🌁",


            //Objects
            "⌚", "📱", "📲", "💻", "⌨", "🖥", "🖨", "🖱", "🖲", "🕹", "🗜", "💽", "💾", "💿", "📀", "📼", "📷", "📸", "📹", "🎥", "📽", "🎞", "📞",
            "☎", "📟", "📠", "📺", "📻", "🎙", "🎚", "🎛", "🧭", "⏱", "⏲", "⏰", "🕰", "⌛", "⏳", "📡", "🔋", "🔌", "💡", "🔦", "🕯", "🪔", "🧯",
            "🛢", "💸", "💵", "💴", "💶", "💷", "🪙", "💰", "💳", "💎", "⚖", "🪜", "🧰", "🪛", "🔧", "🔨", "⚒", "🛠", "⛏", "🪚", "🔩", "⚙",
            "🪤", "🧱", "⛓", "🧲", "🔫", "💣", "🧨", "🪓", "🔪", "🗡", "⚔", "🛡", "🚬", "⚰", "🪦", "⚱", "🏺", "🔮", "📿", "🧿", "💈", "⚗", "🔭",
            "🔬", "🕳", "🩹", "🩺", "💊", "💉", "🩸", "🧬", "🦠", "🧫", "🧪", "🌡", "🧹", "🪠", "🧺", "🧻", "🚽", "🚰", "🚿", "🛁", "🛀", "🧼",
            "🪥", "🪒", "🧽", "🪣", "🧴", "🛎", "🔑", "🗝", "🚪", "🪑", "🛋", "🛏", "🛌", "🧸", "🪆", "🖼", "🪞", "🪟", "🛍", "🛒", "🎁", "🎈",
            "🎏", "🎀", "🪄", "🪅", "🎊", "🎉", "🎎", "🏮", "🎐", "🧧", "✉", "📩", "📨", "📧", "💌", "📥", "📤", "📦", "🏷", "🪧", "📪", "📫", "📬",
            "📭", "📮", "📯", "📜", "📃", "📄", "📑", "🧾", "📊", "📈", "📉", "🗒", "🗓", "📆", "📅", "🗑", "📇", "🗃", "🗳", "🗄", "📋", "📁", "📂",
            "🗂", "🗞", "📰", "📓", "📔", "📒", "📕", "📗", "📘", "📙", "📚", "📖", "🔖", "🧷", "🔗", "📎", "🖇", "📐", "📏", "🧮", "📌", "📍", "✂",
            "🖊", "🖋", "✒", "🖌", "🖍", "📝", "✏", "🔍", "🔎", "🔏", "🔐", "🔒", "🔓",

            //Symbols
            "❤", "🧡", "💛", "💚", "💙", "💜", "🖤", "🤍", "🤎", "💔", "❣", "💕", "💞", "💓", "💗", "💖", "💘", "💝",
            "💟", "☮", "✝", "☪", "🕉", "☸", "✡", "🔯", "🕎", "☯", "☦", "🛐", "⛎", "♈", "♉", "♊", "♋", "♌", "♍",
            "♎", "♏", "♐", "♑", "♒", "♓", "🆔", "⚛", "🉑", "☢", "☣", "📴", "📳", "🈶", "🈚", "🈸", "🈺", "🈷", "✴",
            "🆚", "💮", "🉐", "㊙", "㊗", "🈴", "🈵", "🈹", "🈲", "🅰️", "🅱️", "🆎", "🆑", "🅾️", "🆘", "❌", "⭕", "🛑", "⛔",
            "📛", "🚫", "💯", "💢", "♨", "🚷", "🚯", "🚳", "🚱", "🔞", "📵", "🚭", "❗", "❕", "❓", "❔", "‼", "⁉", "🔅",
            "🔆", "〽", "⚠", "🚸", "🔱", "⚜", "🔰", "♻", "✅", "🈯️", "💹", "❇", "✳️", "❎", "🌐", "💠", "Ⓜ️", "🌀",
            "💤", "🏧", "🚾", "♿️", "🅿️", "🛗", "🈳", "🈂️", "🛂", "🛃", "🛄", "🛅", "🚹", "🚺", "🚼", "⚧", "🚻", "🚮",
            "🎦", "📶", "🈁", "🔣", "ℹ️", "🔤", "🔡", "🔠", "🆖", "🆗", "🆙", "🆒", "🆕", "🆓", "0️⃣", "1️⃣", "2️⃣", "3️⃣",
            "4️⃣", "5️⃣", "6️⃣", "7️⃣", "8️⃣", "9️⃣", "🔟", "🔢", "#️⃣", "*️⃣", "⏏️", "▶️", "⏸", "⏯", "⏹", "⏺", "⏭",
            "⏮", "⏩", "⏪", "⏫", "⏬", "◀️", "🔼", "🔽", "➡️", "⬅️", "⬆️", "⬇️", "↗️", "↘️", "↙️",
            "↖️", "↕️", "↔️", "↪️", "↩️", "⤴️", "⤵️", "🔀", "🔁", "🔂", "🔄", "🔃", "🎵", "🎶", "➕", "➖",
            "➗", "✖️", "♾", "💲", "💱", "™️", "©️", "®️", "〰️", "➰", "➿", "🔚", "🔙", "🔛", "🔝", "🔜", "✔️",
            "☑️", "🔘", "🔴", "🟠", "🟡", "🟢", "🔵", "🟣", "⚫️", "⚪️", "🟤", "🔺", "🔻", "🔸", "🔹", "🔶", "🔷", "🔳",
            "🔲", "▪️", "▫️", "◾️", "◽️", "◼️", "◻️", "🟥", "🟧", "🟨", "🟩", "🟦", "🟪", "⬛️", "⬜️", "🟫",
            "🔈", "🔇", "🔉", "🔊", "🔔", "🔕", "📣", "📢", "👁‍🗨", "💬", "💭", "🗯", "♠️", "♣️", "♥️", "♦️", "🃏", "🎴",
            "🀄️", "🕐", "🕑", "🕒", "🕓", "🕔", "🕕", "🕖", "🕗", "🕘", "🕙", "🕚", "🕛", "🕜", "🕝", "🕞", "🕟", "🕠", "🕡", "🕢",
            "🕣", "🕤", "🕥", "🕦", "🕧",


            //Non-Emoji Symbols
            "✢", "✣", "✤", "✥", "✦", "✧", "★", "☆", "✯", "✡︎", "✩", "✪", "✫", "✬", "✭", "✮", "✶", "✷",
            "✵", "✸", "✹", "→", "⇒", "⟹", "⇨", "⇾", "➾", "⇢", "☛", "☞", "➔", "➜", "➙", "➛",
            "➝", "➞", "♠︎", "♣︎", "♥︎", "♦︎", "♤", "♧", "♡", "♢", "♚", "♛", "♜", "♝",
            "♞", "♟", "♔", "♕", "♖", "♗", "♘", "♙", "⚀", "⚁", "⚂", "⚃", "⚄", "⚅", "🂠", "⚈", "⚉",
            "⚆", "⚇", "𓀀", "𓀁", "𓀂", "𓀃", "𓀄", "𓀅", "𓀆", "𓀇", "𓀈", "𓀉", "𓀊", "𓀋", "𓀌", "𓀍", "𓀎", "𓀏", "𓀐",
            "𓀑", "𓀒", "𓀓", "𓀔", "𓀕", "𓀖", "𓀗", "𓀘", "𓀙", "𓀚", "𓀛", "𓀜", "𓀝",

            //Flags 
            "🏳️", "🏴", "🏁", "🚩", "🏳️‍🌈", "🏳️‍⚧️", "🏴‍☠️", "🇦🇫", "🇦🇽", "🇦🇱", "🇩🇿", "🇦🇸", "🇦🇩", "🇦🇴", "🇦🇮", "🇦🇶",
            "🇦🇬", "🇦🇷", "🇦🇲", "🇦🇼", "🇦🇺", "🇦🇹", "🇦🇿", "🇧🇸", "🇧🇭", "🇧🇩", "🇧🇧", "🇧🇾", "🇧🇪", "🇧🇿", "🇧🇯", "🇧🇲", "🇧🇹", "🇧🇴", "🇧🇦",
            "🇧🇼", "🇧🇷", "🇮🇴", "🇻🇬", "🇧🇳", "🇧🇬", "🇧🇫", "🇧🇮", "🇰🇭", "🇨🇲", "🇨🇦", "🇮🇨", "🇨🇻", "🇧🇶", "🇰🇾", "🇨🇫", "🇹🇩", "🇨🇱", "🇨🇳", "🇨🇽",
            "🇨🇨", "🇨🇴", "🇰🇲", "🇨🇬", "🇨🇩", "🇨🇰", "🇨🇷", "🇨🇮", "🇭🇷", "🇨🇺", "🇨🇼", "🇨🇾", "🇨🇿", "🇩🇰", "🇩🇯", "🇩🇲", "🇩🇴", "🇪🇨", "🇪🇬", "🇸🇻",
            "🇬🇶", "🇪🇷", "🇪🇪", "🇪🇹", "🇪🇺", "🇫🇰", "🇫🇴", "🇫🇯", "🇫🇮", "🇫🇷", "🇬🇫", "🇵🇫", "🇹🇫", "🇬🇦", "🇬🇲", "🇬🇪", "🇩🇪", "🇬🇭", "🇬🇮", "🇬🇷",
            "🇬🇱", "🇬🇩", "🇬🇵", "🇬🇺", "🇬🇹", "🇬🇬", "🇬🇳", "🇬🇼", "🇬🇾", "🇭🇹", "🇭🇳", "🇭🇰", "🇭🇺", "🇮🇸", "🇮🇳", "🇮🇩", "🇮🇷", "🇮🇶",
            "🇮🇪", "🇮🇲", "🇮🇱", "🇮🇹", "🇯🇲", "🇯🇵", "🎌" ,"🇯🇪", "🇯🇴", "🇰🇿", "🇰🇪", "🇰🇮", "🇽🇰", "🇰🇼", "🇰🇬", "🇱🇦", "🇱🇻", "🇱🇧", "🇱🇸",
            "🇱🇷", "🇱🇾", "🇱🇮", "🇱🇹", "🇱🇺", "🇲🇴", "🇲🇰", "🇲🇬", "🇲🇼", "🇲🇾", "🇲🇻", "🇲🇱", "🇲🇹", "🇲🇭", "🇲🇶", "🇲🇷", "🇲🇺", "🇾🇹", "🇲🇽",
            "🇫🇲", "🇲🇩", "🇲🇨", "🇲🇳", "🇲🇪", "🇲🇸", "🇲🇦", "🇲🇿", "🇲🇲", "🇳🇦", "🇳🇷", "🇳🇵", "🇳🇱", "🇳🇨", "🇳🇿", "🇳🇮", "🇳🇪", "🇳🇬",
            "🇳🇺", "🇳🇫", "🇰🇵", "🇲🇵", "🇳🇴", "🇴🇲", "🇵🇰", "🇵🇼", "🇵🇸", "🇵🇦", "🇵🇬", "🇵🇾", "🇵🇪", "🇵🇭", "🇵🇳", "🇵🇱", "🇵🇹", "🇵🇷", "🇶🇦", "🇷🇪",
            "🇷🇴", "🇷🇺", "🇷🇼", "🇼🇸", "🇸🇲", "🇸🇦", "🇸🇳", "🇷🇸", "🇸🇨", "🇸🇱", "🇸🇬", "🇸🇽", "🇸🇰", "🇸🇮", "🇬🇸", "🇸🇧", "🇸🇴", "🇿🇦", "🇰🇷", "🇸🇸",
            "🇪🇸", "🇱🇰", "🇧🇱", "🇸🇭", "🇰🇳", "🇱🇨", "🇵🇲", "🇻🇨", "🇸🇩", "🇸🇷", "🇸🇿", "🇸🇪", "🇨🇭", "🇸🇾", "🇹🇼", "🇹🇯", "🇹🇿", "🇹🇭", "🇹🇱", "🇹🇬",
            "🇹🇰", "🇹🇴", "🇹🇹", "🇹🇳", "🇹🇷", "🇹🇲", "🇹🇨", "🇹🇻", "🇻🇮", "🇺🇬", "🇺🇦", "🇦🇪", "🇬🇧","🇺🇳", "🇺🇸", "🇺🇾", "🇺🇿",
            "🇻🇺", "🇻🇦", "🇻🇪", "🇻🇳", "🇼🇫", "🇪🇭", "🇾🇪", "🇿🇲", "🇿🇼",


            //New Emojis
            "🥲", "🥸", "🤌", "🤌🏻", "🤌🏼", "🤌🏽", "🤌🏾", "🤌🏿", "🫀", "🫁", "🥷", "🤵‍♀️", "🤵🏻‍♀️", "🤵🏼‍♀️", "🤵🏽‍♀️", "🤵🏾‍♀️",
            "🤵🏿‍♀️", "🤵‍♂️", "🤵🏻‍♂️", "🤵🏼‍♂️", "🤵🏽‍♂️", "🤵🏾‍♂️", "🤵🏿‍♂️", "👰‍♀️", "👰🏻‍♀️", "👰🏼‍♀️", "👰🏽‍♀️",
            "👰🏾‍♀️", "👰🏿‍♀️", "👰‍♂️", "👰🏻‍♂️", "👰🏼‍♂️", "👰🏽‍♂️", "👰🏾‍♂️", "👰🏿‍♂️", "👩‍🍼", "👩🏻‍🍼", "👩🏼‍🍼",
            "👩🏽‍🍼", "👩🏾‍🍼", "👩🏿‍🍼", "🧑‍🍼", "🧑🏻‍🍼", "🧑🏼‍🍼", "🧑🏽‍🍼", "🧑🏾‍🍼", "🧑🏿‍🍼", "👨‍🍼", "👨🏻‍🍼", "👨🏼‍🍼", "👨🏽‍🍼",
            "👨🏾‍🍼", "👨🏿‍🍼", "🧑‍🎄", "🧑🏻‍🎄", "🧑🏼‍🎄", "🧑🏽‍🎄", "🧑🏾‍🎄", "🧑🏿‍🎄", "🫂", "🐈‍⬛", "🦬", "🦣", "🦫", "🐻‍❄️", "🦤",
            "🪶", "🦭", "🪲", "🪳", "🪰", "🪱", "🪴", "🫐", "🫒", "🫑", "🫓", "🫔", "🫕", "🫖", "🧋", "🪨", "🪵", "🛖", "🛻", "🛼", "🪄", "🪅", "🪆", "🪡",
            "🪢", "🩴", "🪖", "🪗", "🪘", "🪙", "🪃", "🪚", "🪛", "🪝", "🪜", "🛗", "🪞", "🪟", "🪠", "🪤", "🪣", "🪥", "🪦", "🪧", "🏳️‍⚧️",

            //2021.
            "😮‍💨", "😵‍💫", "😶‍🌫️", "❤️‍🔥", "❤️‍🩹", "🧔‍♀️", "🧔🏻‍♀️", "🧔🏼‍♀️", "🧔🏽‍♀️", "🧔🏾‍♀️", "🧔🏿‍♀️",
            "🧔‍♂️", "🧔🏻‍♂️", "🧔🏼‍♂️", "🧔🏽‍♂️", "🧔🏾‍♂️", "🧔🏿‍♂️", "💑🏻", "💑🏼", "💑🏽", "💑🏾", "💑🏿", "💏🏻",
            "💏🏼", "💏🏽", "💏🏾", "💏🏿", "👨🏻‍❤️‍👨🏻", "👨🏻‍❤️‍👨🏼", "👨🏻‍❤️‍👨🏽", "👨🏻‍❤️‍👨🏾", "👨🏻‍❤️‍👨🏿", "👨🏼‍❤️‍👨🏻", "👨🏼‍❤️‍👨🏼", "👨🏼‍❤️‍👨🏽",
            "👨🏼‍❤️‍👨🏾", "👨🏼‍❤️‍👨🏿", "👨🏽‍❤️‍👨🏻", "👨🏽‍❤️‍👨🏼", "👨🏽‍❤️‍👨🏽", "👨🏽‍❤️‍👨🏾", "👨🏽‍❤️‍👨🏿", "👨🏾‍❤️‍👨🏻", "👨🏾‍❤️‍👨🏼", "👨🏾‍❤️‍👨🏽",
            "👨🏾‍❤️‍👨🏾", "👨🏾‍❤️‍👨🏿", "👨🏿‍❤️‍👨🏻", "👨🏿‍❤️‍👨🏼", "👨🏿‍❤️‍👨🏽", "👨🏿‍❤️‍👨🏾", "👨🏿‍❤️‍👨🏿", "👩🏻‍❤️‍👨🏻", "👩🏻‍❤️‍👨🏼",
            "👩🏻‍❤️‍👨🏽", "👩🏻‍❤️‍👨🏾", "👩🏻‍❤️‍👨🏿", "👩🏻‍❤️‍👩🏻", "👩🏻‍❤️‍👩🏼", "👩🏻‍❤️‍👩🏽", "👩🏻‍❤️‍👩🏾", "👩🏻‍❤️‍👩🏿", "👩🏼‍❤️‍👨🏻", "👩🏼‍❤️‍👨🏼",
            "👩🏼‍❤️‍👨🏽", "👩🏼‍❤️‍👨🏾", "👩🏼‍❤️‍👨🏿", "👩🏼‍❤️‍👩🏻", "👩🏼‍❤️‍👩🏼", "👩🏼‍❤️‍👩🏽", "👩🏼‍❤️‍👩🏾", "👩🏼‍❤️‍👩🏿", "👩🏽‍❤️‍👨🏻", "👩🏽‍❤️‍👨🏼",
            "👩🏽‍❤️‍👨🏽", "👩🏽‍❤️‍👨🏾", "👩🏽‍❤️‍👨🏿", "👩🏽‍❤️‍👩🏻", "👩🏽‍❤️‍👩🏼", "👩🏽‍❤️‍👩🏽", "👩🏽‍❤️‍👩🏾", "👩🏽‍❤️‍👩🏿", "👩🏾‍❤️‍👨🏻", "👩🏾‍❤️‍👨🏼",
            "👩🏾‍❤️‍👨🏽", "👩🏾‍❤️‍👨🏾", "👩🏾‍❤️‍👨🏿", "👩🏾‍❤️‍👩🏻", "👩🏾‍❤️‍👩🏼", "👩🏾‍❤️‍👩🏽", "👩🏾‍❤️‍👩🏾", "👩🏾‍❤️‍👩🏿", "👩🏿‍❤️‍👨🏻", "👩🏿‍❤️‍👨🏼",
            "👩🏿‍❤️‍👨🏽", "👩🏿‍❤️‍👨🏾", "👩🏿‍❤️‍👨🏿", "👩🏿‍❤️‍👩🏻", "👩🏿‍❤️‍👩🏼", "👩🏿‍❤️‍👩🏽", "👩🏿‍❤️‍👩🏾", "👩🏿‍❤️‍👩🏿", "🧑🏻‍❤️‍🧑🏼",
            "🧑🏻‍❤️‍🧑🏽", "🧑🏻‍❤️‍🧑🏾", "🧑🏻‍❤️‍🧑🏿", "🧑🏼‍❤️‍🧑🏻", "🧑🏼‍❤️‍🧑🏽", "🧑🏼‍❤️‍🧑🏾", "🧑🏼‍❤️‍🧑🏿",
            "🧑🏽‍❤️‍🧑🏻", "🧑🏽‍❤️‍🧑🏼", "🧑🏽‍❤️‍🧑🏾", "🧑🏽‍❤️‍🧑🏿", "🧑🏾‍❤️‍🧑🏻", "🧑🏾‍❤️‍🧑🏼", "🧑🏾‍❤️‍🧑🏽",
            "🧑🏾‍❤️‍🧑🏿", "🧑🏿‍❤️‍🧑🏻", "🧑🏿‍❤️‍🧑🏼", "🧑🏿‍❤️‍🧑🏽", "🧑🏿‍❤️‍🧑🏾", "👨🏻‍❤️‍💋‍👨🏻", "👨🏻‍❤️‍💋‍👨🏼", "👨🏻‍❤️‍💋‍👨🏽",
            "👨🏻‍❤️‍💋‍👨🏾", "👨🏻‍❤️‍💋‍👨🏿", "👨🏼‍❤️‍💋‍👨🏻", "👨🏼‍❤️‍💋‍👨🏼", "👨🏼‍❤️‍💋‍👨🏽", "👨🏼‍❤️‍💋‍👨🏾", "👨🏼‍❤️‍💋‍👨🏿", "👨🏽‍❤️‍💋‍👨🏻", "👨🏽‍❤️‍💋‍👨🏼",
            "👨🏽‍❤️‍💋‍👨🏽", "👨🏽‍❤️‍💋‍👨🏾", "👨🏽‍❤️‍💋‍👨🏿", "👨🏾‍❤️‍💋‍👨🏻", "👨🏾‍❤️‍💋‍👨🏼", "👨🏾‍❤️‍💋‍👨🏽", "👨🏾‍❤️‍💋‍👨🏾", "👨🏾‍❤️‍💋‍👨🏿", "👨🏿‍❤️‍💋‍👨🏻",
            "👨🏿‍❤️‍💋‍👨🏼", "👨🏿‍❤️‍💋‍👨🏽", "👨🏿‍❤️‍💋‍👨🏾", "👨🏿‍❤️‍💋‍👨🏿", "👩🏻‍❤️‍💋‍👨🏻", "👩🏻‍❤️‍💋‍👨🏼", "👩🏻‍❤️‍💋‍👨🏽", "👩🏻‍❤️‍💋‍👨🏾", "👩🏻‍❤️‍💋‍👨🏿",
            "👩🏻‍❤️‍💋‍👩🏻", "👩🏻‍❤️‍💋‍👩🏼", "👩🏻‍❤️‍💋‍👩🏽", "👩🏻‍❤️‍💋‍👩🏾", "👩🏻‍❤️‍💋‍👩🏿", "👩🏼‍❤️‍💋‍👨🏻", "👩🏼‍❤️‍💋‍👨🏼", "👩🏼‍❤️‍💋‍👨🏽", "👩🏼‍❤️‍💋‍👨🏾",
            "👩🏼‍❤️‍💋‍👨🏿", "👩🏼‍❤️‍💋‍👩🏻", "👩🏼‍❤️‍💋‍👩🏼", "👩🏼‍❤️‍💋‍👩🏽", "👩🏼‍❤️‍💋‍👩🏾", "👩🏼‍❤️‍💋‍👩🏿", "👩🏽‍❤️‍💋‍👨🏻", "👩🏽‍❤️‍💋‍👨🏼"," 👩🏽‍❤️‍💋‍👨🏽",
            "👩🏽‍❤️‍💋‍👨🏾", "👩🏽‍❤️‍💋‍👨🏿", "👩🏽‍❤️‍💋‍👩🏻", "👩🏽‍❤️‍💋‍👩🏼", "👩🏽‍❤️‍💋‍👩🏽", "👩🏽‍❤️‍💋‍👩🏾", "👩🏽‍❤️‍💋‍👩🏿", "👩🏾‍❤️‍💋‍👨🏻", "👩🏾‍❤️‍💋‍👨🏼",
            "👩🏾‍❤️‍💋‍👨🏽", "👩🏾‍❤️‍💋‍👨🏾", "👩🏾‍❤️‍💋‍👨🏿", "👩🏾‍❤️‍💋‍👩🏻", "👩🏾‍❤️‍💋‍👩🏼", "👩🏾‍❤️‍💋‍👩🏽", "👩🏾‍❤️‍💋‍👩🏾", "👩🏾‍❤️‍💋‍👩🏿", "👩🏿‍❤️‍💋‍👨🏻",
            "👩🏿‍❤️‍💋‍👨🏼", "👩🏿‍❤️‍💋‍👨🏽", "👩🏿‍❤️‍💋‍👨🏾", "👩🏿‍❤️‍💋‍👨🏿", "👩🏿‍❤️‍💋‍👩🏻", "👩🏿‍❤️‍💋‍👩🏼", "👩🏿‍❤️‍💋‍👩🏽", "👩🏿‍❤️‍💋‍👩🏾", "👩🏿‍❤️‍💋‍👩🏿",
            "🧑🏻‍❤️‍💋‍🧑🏼", "🧑🏻‍❤️‍💋‍🧑🏽", "🧑🏻‍❤️‍💋‍🧑🏾", "🧑🏻‍❤️‍💋‍🧑🏿", "🧑🏼‍❤️‍💋‍🧑🏻", "🧑🏼‍❤️‍💋‍🧑🏽", "🧑🏼‍❤️‍💋‍🧑🏾",
            "🧑🏼‍❤️‍💋‍🧑🏿", "🧑🏽‍❤️‍💋‍🧑🏻", "🧑🏽‍❤️‍💋‍🧑🏼", "🧑🏽‍❤️‍💋‍🧑🏾", "🧑🏽‍❤️‍💋‍🧑🏿", "🧑🏾‍❤️‍💋‍🧑🏻", "🧑🏾‍❤️‍💋‍🧑🏼",
            "🧑🏾‍❤️‍💋‍🧑🏽", "🧑🏾‍❤️‍💋‍🧑🏿", "🧑🏿‍❤️‍💋‍🧑🏻", "🧑🏿‍❤️‍💋‍🧑🏼", "🧑🏿‍❤️‍💋‍🧑🏽", "🧑🏿‍❤️‍💋‍🧑🏾"


};

    public static final ArrayList<String> ALL_EMOJI(){
        ArrayList<String> Emoji = new ArrayList<String>(Arrays.asList(emoji));
        Log.e("TAG","size " + Emoji.size());
        return Emoji;
    }
}