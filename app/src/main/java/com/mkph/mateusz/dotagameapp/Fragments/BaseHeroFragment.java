package com.mkph.mateusz.dotagameapp.Fragments;

import android.app.Fragment;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.mkph.mateusz.dotagameapp.R;

import java.util.Random;

/**
 * Created by Mateusz on 9/7/2014.
 */
public class BaseHeroFragment extends Fragment {

    private MediaPlayer mediaPlayer;
    public static final String ARG_PAGE = "page";
    private int mPageNumber;
    public ImageButton heroPic;
    public String title;


    public static BaseHeroFragment create(int pageNumber) {
        BaseHeroFragment fragment = new BaseHeroFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, pageNumber);
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPageNumber = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.base_hero_fragment_layout, container, false);

        heroPic = (ImageButton) rootView.findViewById(R.id.hero_pic);
        Random r = new Random();
        int random = r.nextInt(107 - 0);

        switch (mPageNumber) {
            case 0:
                heroPic.setBackgroundResource(R.drawable.abaddon_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.wdoc_win_03);
                break;
            case 1:
                heroPic.setBackgroundResource(R.drawable.alchemist_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.venm_rare_01);
                break;
            case 2:
                heroPic.setBackgroundResource(R.drawable.ancient_apparition_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 3:
                heroPic.setBackgroundResource(R.drawable.antimage_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 4:
                heroPic.setBackgroundResource(R.drawable.axe_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 5:
                heroPic.setBackgroundResource(R.drawable.bane_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 6:
                heroPic.setBackgroundResource(R.drawable.batrider_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 7:
                heroPic.setBackgroundResource(R.drawable.beastmaster_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 8:
                heroPic.setBackgroundResource(R.drawable.bloodseeker_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 9:
                heroPic.setBackgroundResource(R.drawable.bounty_hunter_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 10:
                heroPic.setBackgroundResource(R.drawable.brewmaster);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.wdoc_win_03);
                break;
            case 11:
                heroPic.setBackgroundResource(R.drawable.bristleback_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.venm_rare_01);
                break;
            case 12:
                heroPic.setBackgroundResource(R.drawable.broodmother_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 13:
                heroPic.setBackgroundResource(R.drawable.centaur_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 14:
                heroPic.setBackgroundResource(R.drawable.chaos_knight_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 15:
                heroPic.setBackgroundResource(R.drawable.chen_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 16:
                heroPic.setBackgroundResource(R.drawable.clinkz);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 17:
                heroPic.setBackgroundResource(R.drawable.clockwerk_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 18:
                heroPic.setBackgroundResource(R.drawable.crystal_maiden_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 19:
                heroPic.setBackgroundResource(R.drawable.dark_seer_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;

            case 20:
                heroPic.setBackgroundResource(R.drawable.dazzle_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.wdoc_win_03);
                break;
            case 21:
                heroPic.setBackgroundResource(R.drawable.death_prophet_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.venm_rare_01);
                break;
            case 22:
                heroPic.setBackgroundResource(R.drawable.disruptor_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 23:
                heroPic.setBackgroundResource(R.drawable.doom_bringer_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 24:
                heroPic.setBackgroundResource(R.drawable.dragon_knight_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 25:
                heroPic.setBackgroundResource(R.drawable.drow_ranger_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 26:
                heroPic.setBackgroundResource(R.drawable.earth_spirit_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 27:
                heroPic.setBackgroundResource(R.drawable.earthshaker_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 28:
                heroPic.setBackgroundResource(R.drawable.elder_titan_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 29:
                heroPic.setBackgroundResource(R.drawable.ember_spirit_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;

            case 30:
                heroPic.setBackgroundResource(R.drawable.enchantress_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.wdoc_win_03);
                break;
            case 31:
                heroPic.setBackgroundResource(R.drawable.enigma_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.venm_rare_01);
                break;
            case 32:
                heroPic.setBackgroundResource(R.drawable.faceless_void_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 33:
                heroPic.setBackgroundResource(R.drawable.gyrocopter_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 34:
                heroPic.setBackgroundResource(R.drawable.huskar_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 35:
                heroPic.setBackgroundResource(R.drawable.invoker_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 36:
                heroPic.setBackgroundResource(R.drawable.io_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 37:
                heroPic.setBackgroundResource(R.drawable.jakiro_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 38:
                heroPic.setBackgroundResource(R.drawable.juggernaut_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 39:
                heroPic.setBackgroundResource(R.drawable.kotl_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;

            case 40:
                heroPic.setBackgroundResource(R.drawable.kunkka_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.wdoc_win_03);
                break;
            case 41:
                heroPic.setBackgroundResource(R.drawable.legion_commander_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.venm_rare_01);
                break;
            case 42:
                heroPic.setBackgroundResource(R.drawable.leshrac_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 43:
                heroPic.setBackgroundResource(R.drawable.lich_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 44:
                heroPic.setBackgroundResource(R.drawable.life_stealer_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 45:
                heroPic.setBackgroundResource(R.drawable.lina_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 46:
                heroPic.setBackgroundResource(R.drawable.lion_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 47:
                heroPic.setBackgroundResource(R.drawable.lone_druid_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 48:
                heroPic.setBackgroundResource(R.drawable.luna_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 49:
                heroPic.setBackgroundResource(R.drawable.lycan_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;

            case 50:
                heroPic.setBackgroundResource(R.drawable.magnataur_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.wdoc_win_03);
                break;
            case 51:
                heroPic.setBackgroundResource(R.drawable.medusa_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.venm_rare_01);
                break;
            case 52:
                heroPic.setBackgroundResource(R.drawable.meepo_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 53:
                heroPic.setBackgroundResource(R.drawable.mirana_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 54:
                heroPic.setBackgroundResource(R.drawable.morphling_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 55:
                heroPic.setBackgroundResource(R.drawable.naga_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 56:
                heroPic.setBackgroundResource(R.drawable.natures);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 57:
                heroPic.setBackgroundResource(R.drawable.necrolyte_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 58:
                heroPic.setBackgroundResource(R.drawable.night_stalker_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 59:
                heroPic.setBackgroundResource(R.drawable.nyx_assassin_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;

            case 60:
                heroPic.setBackgroundResource(R.drawable.obsidian_destroyer_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.wdoc_win_03);
                break;
            case 61:
                heroPic.setBackgroundResource(R.drawable.ogre_magi_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.venm_rare_01);
                break;
            case 62:
                heroPic.setBackgroundResource(R.drawable.omniknight_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 63:
                heroPic.setBackgroundResource(R.drawable.phantom_assassin_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 64:
                heroPic.setBackgroundResource(R.drawable.phantom_lancer_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 65:
                heroPic.setBackgroundResource(R.drawable.phoenix_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 66:
                heroPic.setBackgroundResource(R.drawable.puck_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 67:
                heroPic.setBackgroundResource(R.drawable.pudge_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 68:
                heroPic.setBackgroundResource(R.drawable.pugna_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 69:
                heroPic.setBackgroundResource(R.drawable.queenofpain_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;

            case 70:
                heroPic.setBackgroundResource(R.drawable.razor);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.wdoc_win_03);
                break;
            case 71:
                heroPic.setBackgroundResource(R.drawable.riki_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.venm_rare_01);
                break;
            case 72:
                heroPic.setBackgroundResource(R.drawable.rubick_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 73:
                heroPic.setBackgroundResource(R.drawable.sand_king_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 74:
                heroPic.setBackgroundResource(R.drawable.shadow_demon_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 75:
                heroPic.setBackgroundResource(R.drawable.shadow_fiend_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 76:
                heroPic.setBackgroundResource(R.drawable.shadow_shaman_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 77:
                heroPic.setBackgroundResource(R.drawable.silencer_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 78:
                heroPic.setBackgroundResource(R.drawable.skywrath_mage);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 79:
                heroPic.setBackgroundResource(R.drawable.slardar_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;

            case 80:
                heroPic.setBackgroundResource(R.drawable.slark_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.wdoc_win_03);
                break;
            case 81:
                heroPic.setBackgroundResource(R.drawable.sniper_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.venm_rare_01);
                break;
            case 82:
                heroPic.setBackgroundResource(R.drawable.spectre_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 83:
                heroPic.setBackgroundResource(R.drawable.spirit_breaker_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 84:
                heroPic.setBackgroundResource(R.drawable.storm_spirit_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 85:
                heroPic.setBackgroundResource(R.drawable.sven_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 86:
                heroPic.setBackgroundResource(R.drawable.techies_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 87:
                heroPic.setBackgroundResource(R.drawable.templar_assassin_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 88:
                heroPic.setBackgroundResource(R.drawable.terrorblade_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 89:
                heroPic.setBackgroundResource(R.drawable.tidehunter_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;

            case 90:
                heroPic.setBackgroundResource(R.drawable.timbersaw_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.wdoc_win_03);
                break;
            case 91:
                heroPic.setBackgroundResource(R.drawable.tinker_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.venm_rare_01);
                break;
            case 92:
                heroPic.setBackgroundResource(R.drawable.tiny_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 93:
                heroPic.setBackgroundResource(R.drawable.treant_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 94:
                heroPic.setBackgroundResource(R.drawable.troll_warlord_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 95:
                heroPic.setBackgroundResource(R.drawable.tusk_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 96:
                heroPic.setBackgroundResource(R.drawable.undying_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 97:
                heroPic.setBackgroundResource(R.drawable.ursa_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 98:
                heroPic.setBackgroundResource(R.drawable.vengefulspirit_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 99:
                heroPic.setBackgroundResource(R.drawable.venomancer);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 100:
                heroPic.setBackgroundResource(R.drawable.viper_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;

            case 101:
                heroPic.setBackgroundResource(R.drawable.visage_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.wdoc_win_03);
                break;
            case 102:
                heroPic.setBackgroundResource(R.drawable.warlock_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.venm_rare_01);
                break;
            case 103:
                heroPic.setBackgroundResource(R.drawable.weaver_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 104:
                heroPic.setBackgroundResource(R.drawable.windrunner_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 105:
                heroPic.setBackgroundResource(R.drawable.witch_doctor_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 106:
                heroPic.setBackgroundResource(R.drawable.wraith_king_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;
            case 107:
                heroPic.setBackgroundResource(R.drawable.zues_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
                break;

        }

        setupListener();
        return rootView;
    }

    private void setupListener() {
        heroPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
    }

    public String getHeroName(int page) {
        switch (page) {
            case 0:
                title = "Abaddon";
                break;
            case 1:
                title = "Alchemist";
                break;
            case 2:
                title = "Ancient Apparition ";
                break;
            case 3:
                title = "Anti-Mage";
                break;
            case 4:
                title = "Axe";
                break;
            case 5:
                title = "Bane";
                break;
            case 6:
                title = "Goblin Ginger";
                break;
            case 7:
                title = "Caveman";
                break;
            case 8:
                title = "Period Destroyer";
                break;
            case 9:
                title = "Rat Bugga";
                break;
            case 10:
                title = "Drunk Ferret";
                break;
            case 11:
                title = "Spikey Pirate";
                break;
            case 12:
                title = "Queen Spider";
                break;
            case 13:
                title = "Minataur";
                break;
            case 14:
                title = "Hells Horseman";
                break;
            case 15:
                title = "HOLY BLACK DUDE";
                break;
            case 16:
                title = "Horned Skelly Man";
                break;
            case 17:
                title = "Chomp Chomp";
                break;
            case 18:
                title = "Elsa from Frozen";
                break;
            case 19:
                title = "Purple Old Man";
                break;

            case 20:
                title = "Pink Painted Punk";
                break;
            case 21:
                title = "Sexy Ghost Woman";
                break;
            case 22:
                title = "T-Rex and Ape";
                break;
            case 23:
                title = "Devil Bro";
                break;
            case 24:
                title = "Red Knight";
                break;
            case 25:
                title = "Icey Riding Hood";
                break;
            case 26:
                title = "Green eyed Stone";
                break;
            case 27:
                title = "Bison Boy";
                break;
            case 28:
                title = "Horned Elk";
                break;
            case 29:
                title = "Big nosed Fireman";
                break;

            case 30:
                title = "Ginger Elf";
                break;
            case 31:
                title = "Dark Matter";
                break;
            case 32:
                title = "Hammerhead Purple Man";
                break;
            case 33:
                title = "Helicopter Pilot";
                break;
            case 34:
                title = "Fire Spear Thrower";
                break;
            case 35:
                title = "Blonde Magician";
                break;
            case 36:
                title = "Ball of light";
                break;
            case 37:
                title = "Ice Fire Dragon";
                break;
            case 38:
                title = "Masked Swordman";
                break;
            case 39:
                title = "Grandpa on a Horse";
                break;

            case 40:
                title = "Ship Captain";
                break;
            case 41:
                title = "Jungle Warrior Lady";
                break;
            case 42:
                title = "Blue and Pink Glowing Horse";
                break;
            case 43:
                title = "Floating Ice Man";
                break;
            case 44:
                title = "Crazy Toothed Crawling Man";
                break;
            case 45:
                title = "Red-Headed Fire Lady";
                break;
            case 46:
                title = "Purple Nosed Zapping Golbin";
                break;
            case 47:
                title = "Bear Man";
                break;
            case 48:
                title = "Armored Pather Riding Chick";
                break;
            case 49:
                title = "Werewolf";
                break;
            case 50:
                title = "One Horned Mammoth";
                break;
            case 51:
                title = "Crazy Snake Hair Serpent";
                break;
            case 52:
                title = "Multiplying Mole Rat";
                break;
            case 53:
                title = "Tiger Moon Princess";
                break;
            case 54:
                title = "Liquid Creature";
                break;
            case 55:
                title = "Slimy Singing Mermaid";
                break;

            case 56:
                title = "Leafy Teleport Man";
                break;
            case 57:
                title = "Green Glowing Undead Grandpa";
                break;
            case 58:
                title = "Gargoyle";
                break;
            case 59:
                title = "Armored Invisible Bug";
                break;
            case 60:
                title = "Two Headed Blue Fatty";
                break;
            case 61:
                title = "Holy Hammer Bro";
                break;
            case 62:
                title = "4th Dimension Demon";
                break;
            case 63:
                title = "Blinking Blade Killer";
                break;
            case 64:
                title = "Multiplying Mess";
                break;
            case 65:
                title = "Fire Bird";
                break;

            case 66:
                title = "Jelly Butterfly";
                break;
            case 67:
                title = "Fat Meat Man";
                break;
            case 68:
                title = "Tiny Green Skeleton";
                break;
            case 69:
                title = "Hooker for Hell";
                break;
            case 70:
                title = "Lightning Statue Zapper";
                break;
            case 71:
                title = "Smokey Invisible Hitter";
                break;
            case 72:
                title = "Cuff Yo Spell Boy";
                break;
            case 73:
                title = "Sand Scorpion";
                break;
            case 74:
                title = "Dark Red Spiked Scary Guy";
                break;
            case 75:
                title = "Dark Red Soul Keeper";
                break;

            case 76:
                title = "Ward Making Zapping Bandit";
                break;
            case 77:
                title = "Aint no body got time for spells";
                break;
            case 78:
                title = "Holy Flying Monk";
                break;
            case 79:
                title = "Big Toothed Sea Monster";
                break;
            case 80:
                title = "Tadpod with A Dagger";
                break;
            case 81:
                title = "Musket Shooter";
                break;
            case 82:
                title = "Dark Nightmare Ghost";
                break;
            case 83:
                title = "Space Cow";
                break;
            case 84:
                title = "Fat Lightning Monk";
                break;
            case 85:
                title = "Long Horned Claymore Warrior";
                break;
            case 86:
                title = "Bomb Blowers";
                break;
            case 87:
                title = "Masked Pink Princess";
                break;
            case 88:
                title = "Meta Morphing Demon";
                break;
            case 89:
                title = "Big Green Seaweed Monster";
                break;
            case 90:
                title = "Tree Cutting Chainsaw Man";
                break;
            case 91:
                title = "Rocket Blaster Marching Man";
                break;
            case 92:
                title = "Big Forest Stone Man";
                break;
            case 93:
                title = "Walking Oak Tree";
                break;
            case 94:
                title = "Red Ugly Troll";
                break;
            case 95:
                title = "Frozen Walrus";
                break;
            case 96:
                title = "Poison Zombie";
                break;
            case 97:
                title = "Big Clawed Teddy Bear";
                break;
            case 98:
                title = "Armored Swapping Lady";
                break;
            case 99:
                title = "Poison Snake";
                break;
            case 100:
                title = "Flying Poison Dragon";
                break;
            case 101:
                title = "Flying Skeleton Dragon";
                break;
            case 102:
                title = "Fire Golem Daddy";
                break;
            case 103:
                title = "Fast Teal Bug";
                break;
            case 104:
                title = "Elf Archer";
                break;
            case 105:
                title = "Purple Tribal Medicine Man";
                break;
            case 106:
                title = "Undead Warrior King";
                break;
            case 107:
                title = "Zapping God";
                break;

        }


        return title;
    }



}