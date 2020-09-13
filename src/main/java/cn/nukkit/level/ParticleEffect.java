package cn.nukkit.level;

import cn.nukkit.api.Since;

public enum ParticleEffect {
    ARROWSPELL("minecraft:arrow_spell_emitter"),
    BALLOON_GAS("minecraft:balloon_gas_particle"),
    BASIC_BUBBLE("minecraft:basic_bubble_particle"),
    BASIC_BUBBLE_MANUAL("minecraft:basic_bubble_particle_manual"),
    BASIC_CRIT("minecraft:basic_crit_particle"),
    BASIC_FLAME("minecraft:basic_flame_particle"),
    BASIC_PORTAL("minecraft:basic_portal_particle"),
    BASIC_SMOKE("minecraft:basic_smoke_particle"),
    BLEACH("minecraft:bleach"),
    BLOCK_DESTRUCT("minecraft:block_destruct"),
    BLOCK_SLIDE("minecraft:block_slide"),
    @Since("1.3.0.0-PN") BLUE_FLAME("minecraft:blue_flame_particle"),
    BREAKING_ITEM_ICON("minecraft:breaking_item_icon"),
    BREAKING_ITEM_TERRAIN("minecraft:breaking_item_terrain"),
    BUBBLE_COLUMN_BUBBLE("minecraft:bubble_column_bubble"),
    BUBBLE_COLUMN_DOWN("minecraft:bubble_column_down_particle"),
    BUBBLE_COLUMN_UP("minecraft:bubble_column_up_particle"),
    CAMERA_SHOOT_EXPLOSION("minecraft:camera_shoot_explosion"),
    CAMPFIRE_SMOKE("minecraft:campfire_smoke_particle"),
    CAMPFIRE_SMOKE_TALL("minecraft:campfire_tall_smoke_particle"),
    CAULDRONSPELL("minecraft:cauldron_spell_emitter"),
    CAULDRON_BUBBLE("minecraft:cauldron_bubble_particle"),
    CAULDRON_SPLASH("minecraft:cauldron_splash_particle"),
    COLORED_FLAME("minecraft:colored_flame_particle"),
    CONDUIT("minecraft:conduit_particle"),
    CONDUIT_ABSORB("minecraft:conduit_absorb_particle"),
    CONDUIT_ATTACK("minecraft:conduit_attack_emitter"),
    CRITICAL_HIT("minecraft:critical_hit_emitter"),
    @Since("1.3.0.0-PN") CROP_GROWTH("minecraft:crop_growth_emitter"),
    DOLPHIN_MOVE("minecraft:dolphin_move_particle"),
    DRAGON_BREATH_FIRE("minecraft:dragon_breath_fire"),
    DRAGON_BREATH_LINGERING("minecraft:dragon_breath_lingering"),
    DRAGON_BREATH_TRAIL("minecraft:dragon_breath_trail"),
    DRAGON_DEATH_EXPLOSION("minecraft:dragon_death_explosion_emitter"),
    DRAGON_DESTROY_BLOCK("minecraft:dragon_destroy_block"),
    DRAGON_DYING_EXPLOSION("minecraft:dragon_dying_explosion"),
    ENCHANTING_TABLE_PARTICLE("minecraft:enchanting_table_particle"),
    ENDROD("minecraft:endrod"),
    END_CHEST("minecraft:end_chest"),
    EVAPORATION_ELEPHANT_TOOTHPASTE("minecraft:elephant_tooth_paste_vapor_particle"),
    EVOCATION_FANG("minecraft:evocation_fang_particle"),
    EVOKER_SPELL("minecraft:evoker_spell"),
    EXPLOSION_CAULDRON("minecraft:cauldron_explosion_emitter"),
    EXPLOSION_DEATH("minecraft:death_explosion_emitter"),
    EXPLOSION_EGG_DESTROY("minecraft:egg_destroy_emitter"),
    EXPLOSION_EYEOFENDER_DEATH("minecraft:eyeofender_death_explode_particle"),
    EXPLOSION_LABTABLE_FIRE("minecraft:misc_fire_vapor_particle"),
    EXPLOSION_LEVEL("minecraft:explosion_particle"),
    EXPLOSION_MANUAL("minecraft:explosion_manual"),
    EYE_OF_ENDER_BUBBLE("minecraft:eye_of_ender_bubble_particle"),
    FALLING_BORDER_DUST("minecraft:falling_border_dust_particle"),
    FALLING_DUST("minecraft:falling_dust"),
    FALLING_DUST_CONCRETE_POWDER("minecraft:falling_dust_concrete_powder_particle"),
    FALLING_DUST_DRAGON_EGG("minecraft:falling_dust_dragon_egg_particle"),
    FALLING_DUST_GRAVEL("minecraft:falling_dust_gravel_particle"),
    FALLING_DUST_RED_SAND("minecraft:falling_dust_red_sand_particle"),
    FALLING_DUST_SAND("minecraft:falling_dust_sand_particle"),
    FALLING_DUST_SCAFFOLDING("minecraft:falling_dust_scaffolding_particle"),
    FALLING_DUST_TOP_SNOW("minecraft:falling_dust_top_snow_particle"),
    FISH_HOOK("minecraft:fish_hook_particle"),
    FISH_POS("minecraft:fish_pos_particle"),
    GUARDIAN_ATTACK("minecraft:guardian_attack_particle"),
    GUARDIAN_WATER_MOVE("minecraft:guardian_water_move_particle"),
    HEART("minecraft:heart_particle"),
    HONEY_DRIP("minecraft:honey_drip_particle"),
    HUGE_EXPLOSION_LAB_MISC("minecraft:huge_explosion_lab_misc_emitter"),
    HUGE_EXPLOSION_LEVEL("minecraft:huge_explosion_emitter"),
    ICE_EVAPORATION("minecraft:ice_evaporation_emitter"),
    INK("minecraft:ink_emitter"),
    KNOCKBACK_ROAR("minecraft:knockback_roar_particle"),
    LAB_TABLE_HEATBLOCK_DUST("minecraft:lab_table_heatblock_dust_particle"),
    LAB_TABLE_MISC_MYSTICAL("minecraft:lab_table_misc_mystical_particle"),
    LARGE_EXPLOSION_LEVEL("minecraft:large_explosion"),
    LAVA_DRIP("minecraft:lava_drip_particle"),
    LAVA_PARTICLE("minecraft:lava_particle"),
    LLAMA_SPIT("minecraft:llama_spit_smoke"),
    MAGNESIUM_SALTS("minecraft:magnesium_salts_emitter"),
    MOBFLAME("minecraft:mobflame_emitter"),
    MOBFLAME_SINGLE("minecraft:mobflame_single"),
    MOBSPELL("minecraft:mobspell_emitter"),
    MOB_BLOCK_SPAWN("minecraft:mob_block_spawn_emitter"),
    MOB_PORTAL("minecraft:mob_portal"),
    MYCELIUM_DUST("minecraft:mycelium_dust_particle"),
    NECTAR_DRIP("minecraft:nectar_drip_particle"),
    NOTE("minecraft:note_particle"),
    OBSIDIAN_GLOW_DUST("minecraft:obsidian_glow_dust_particle"),
    @Since("1.3.0.0-PN") OBSIDIAN_TEAR("minecraft:obsidian_tear_particle"),
    PHANTOM_TRAIL("minecraft:phantom_trail_particle"),
    PORTAL_DIRECTIONAL("minecraft:portal_directional"),
    PORTAL_EAST_WEST("minecraft:portal_east_west"),
    PORTAL_NORTH_SOUTH("minecraft:portal_north_south"),
    @Since("1.3.0.0-PN") PORTAL_REVERSE("minecraft:portal_reverse_particle"),
    RAIN_SPLASH("minecraft:rain_splash_particle"),
    REDSTONE_ORE_DUST("minecraft:redstone_ore_dust_particle"),
    REDSTONE_REPEATER_DUST("minecraft:redstone_repeater_dust_particle"),
    REDSTONE_TORCH_DUST("minecraft:redstone_torch_dust_particle"),
    REDSTONE_WIRE_DUST("minecraft:redstone_wire_dust_particle"),
    RISING_BORDER_DUST("minecraft:rising_border_dust_particle"),
    SHULKER_BULLET("minecraft:shulker_bullet"),
    SILVERFISH_GRIEF("minecraft:silverfish_grief_emitter"),
    @Since("1.3.0.0-PN") SOUL("minecraft:soul_particle"),
    SPARKLER("minecraft:sparkler_emitter"),
    SPLASHPOTIONSPELL("minecraft:splash_spell_emitter"),
    SPONGE_ABSORB_BUBBLE("minecraft:sponge_absorb_water_particle"),
    SQUID_FLEE("minecraft:squid_flee_particle"),
    SQUID_INK_BUBBLE("minecraft:squid_ink_bubble"),
    SQUID_MOVE("minecraft:squid_move_particle"),
    STUNNED("minecraft:stunned_emitter"),
    TOTEM("minecraft:totem_particle"),
    TOTEM_MANUAL("minecraft:totem_manual"),
    UNDERWATER_TORCH_BUBBLE("minecraft:underwater_torch_particle"),
    VILLAGER_ANGRY("minecraft:villager_angry"),
    VILLAGER_HAPPY("minecraft:villager_happy"),
    WATER_DRIP("minecraft:water_drip_particle"),
    WATER_EVAPORATION_ACTOR("minecraft:water_evaporation_actor_emitter"),
    WATER_EVAPORATION_BUCKET("minecraft:water_evaporation_bucket_emitter"),
    WATER_EVAPORATION_MANUAL("minecraft:water_evaporation_manual"),
    WATER_SPASH_MANUAL("minecraft:water_splash_particle_manual"),
    WATER_SPLASH("minecraft:water_splash_particle"),
    WATER_WAKE("minecraft:water_wake_particle"),
    WITHER_BOSS_INVULNERABLE("minecraft:wither_boss_invulnerable");

    private final String identifier;

    ParticleEffect(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return this.identifier;
    }
}