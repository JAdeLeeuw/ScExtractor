package jnibwapi.model;

import jnibwapi.IDLookup;
import jnibwapi.NativeUnitCommands;
import jnibwapi.types.*;
import jnibwapi.types.OrderType.OrderTypes;
import jnibwapi.types.TechType.TechTypes;
import jnibwapi.types.UnitCommandType.UnitCommandTypes;
import jnibwapi.types.UnitType.UnitTypes;
import jnibwapi.types.UpgradeType.UpgradeTypes;

/**
 * Represents a StarCraft unit.
 * 
 * For a description of fields see: http://code.google.com/p/bwapi/wiki/Unit
 */
public class Unit implements Cloneable {
	
	public static final int numAttributes = 123;
	public static final double TO_DEGREES = 180.0 / Math.PI;
	public static final double fixedScale = 100.0;
	
	private final IDLookup iDLookup;
	private final NativeUnitCommands cmds;
	
	private int ID;
	private int replayID;
	private int playerID;
	private int typeID;
	private int x;
	private int y;
	private int tileX;
	private int tileY;
	private double angle;
	private double velocityX;
	private double velocityY;
	private int hitPoints;
	private int shield;
	private int energy;
	private int resources;
	private int resourceGroup;
	private int lastCommandFrame;
	private int lastCommandID;
	private int lastAttackingPlayerID;
	private int initialTypeID;
	private int initialX;
	private int initialY;
	private int initialTileX;
	private int initialTileY;
	private int initialHitPoints;
	private int initialResources;
	private int killCount;
	private int acidSporeCount;
	private int interceptorCount;
	private int scarabCount;
	private int spiderMineCount;
	private int groundWeaponCooldown;
	private int airWeaponCooldown;
	private int spellCooldown;
	private int defenseMatrixPoints;
	private int defenseMatrixTimer;
	private int ensnareTimer;
	private int irradiateTimer;
	private int lockdownTimer;
	private int maelstromTimer;
	private int orderTimer;
	private int plagueTimer;
	private int removeTimer;
	private int stasisTimer;
	private int stimTimer;
	private int buildTypeID;
	private int trainingQueueSize;
	private int researchingTechID;
	private int upgradingUpgradeID;
	private int remainingBuildTimer;
	private int remainingTrainTime;
	private int remainingResearchTime;
	private int remainingUpgradeTime;
	private int buildUnitID;
	private int targetUnitID;
	private int targetX;
	private int targetY;
	private int orderID;
	private int orderTargetID;
	private int secondaryOrderID;
	private int rallyX;
	private int rallyY;
	private int rallyUnitID;
	private int addOnID;
	private int nydusExitUnitID;
	private int transportID;
	private int loadedUnitsCount;
	private int carrierUnitID;
	private int hatcheryUnitID;
	private int larvaCount;
	private int powerUpUnitID;
	private boolean exists;
	private boolean nukeReady;
	private boolean accelerating;
	private boolean attacking;
	private boolean attackFrame;
	private boolean beingConstructed;
	private boolean beingGathered;
	private boolean beingHealed;
	private boolean blind;
	private boolean braking;
	private boolean burrowed;
	private boolean carryingGas;
	private boolean carryingMinerals;
	private boolean cloaked;
	private boolean completed;
	private boolean constructing;
	private boolean defenseMatrixed;
	private boolean detected;
	private boolean ensnared;
	private boolean following;
	private boolean gatheringGas;
	private boolean gatheringMinerals;
	private boolean hallucination;
	private boolean holdingPosition;
	private boolean idle;
	private boolean interruptable;
	private boolean invincible;
	private boolean irradiated;
	private boolean lifted;
	private boolean loaded;
	private boolean lockedDown;
	private boolean maelstrommed;
	private boolean morphing;
	private boolean moving;
	private boolean parasited;
	private boolean patrolling;
	private boolean plagued;
	private boolean repairing;
	private boolean selected;
	private boolean sieged;
	private boolean startingAttack;
	private boolean stasised;
	private boolean stimmed;
	private boolean stuck;
	private boolean training;
	private boolean underAttack;
	private boolean underDarkSwarm;
	private boolean underDisruptionWeb;
	private boolean underStorm;
	private boolean unpowered;
	private boolean upgrading;
	private boolean visible;
	
	public Unit(int ID, IDLookup iDLookup, NativeUnitCommands cmds) {
		this.ID = ID;
		this.iDLookup = iDLookup;
		this.cmds = cmds;
	}
	
	public void setDestroyed()
	{
		exists = false;
	}
	
	public void update(int[] data, int index) {
		index++; // ID = data[index++];
		replayID = data[index++];
		playerID = data[index++];
		typeID = data[index++];
		x = data[index++];
		y = data[index++];
		tileX = data[index++];
		tileY = data[index++];
		angle = data[index++] / TO_DEGREES;
		velocityX = data[index++] / fixedScale;
		velocityY = data[index++] / fixedScale;
		hitPoints = data[index++];
		shield = data[index++];
		energy = data[index++];
		resources = data[index++];
		resourceGroup = data[index++];
		lastCommandFrame = data[index++];
		lastCommandID = data[index++];
		lastAttackingPlayerID = data[index++];
		initialTypeID = data[index++];
		initialX = data[index++];
		initialY = data[index++];
		initialTileX = data[index++];
		initialTileY = data[index++];
		initialHitPoints = data[index++];
		initialResources = data[index++];
		killCount = data[index++];
		acidSporeCount = data[index++];
		interceptorCount = data[index++];
		scarabCount = data[index++];
		spiderMineCount = data[index++];
		groundWeaponCooldown = data[index++];
		airWeaponCooldown = data[index++];
		spellCooldown = data[index++];
		defenseMatrixPoints = data[index++];
		defenseMatrixTimer = data[index++];
		ensnareTimer = data[index++];
		irradiateTimer = data[index++];
		lockdownTimer = data[index++];
		maelstromTimer = data[index++];
		orderTimer = data[index++];
		plagueTimer = data[index++];
		removeTimer = data[index++];
		stasisTimer = data[index++];
		stimTimer = data[index++];
		buildTypeID = data[index++];
		trainingQueueSize = data[index++];
		researchingTechID = data[index++];
		upgradingUpgradeID = data[index++];
		remainingBuildTimer = data[index++];
		remainingTrainTime = data[index++];
		remainingResearchTime = data[index++];
		remainingUpgradeTime = data[index++];
		buildUnitID = data[index++];
		targetUnitID = data[index++];
		targetX = data[index++];
		targetY = data[index++];
		orderID = data[index++];
		orderTargetID = data[index++];
		secondaryOrderID = data[index++];
		rallyX = data[index++];
		rallyY = data[index++];
		rallyUnitID = data[index++];
		addOnID = data[index++];
		nydusExitUnitID = data[index++];
		transportID = data[index++];
		loadedUnitsCount = data[index++];
		carrierUnitID = data[index++];
		hatcheryUnitID = data[index++];
		larvaCount = data[index++];
		powerUpUnitID = data[index++];
		exists = data[index++] == 1;
		nukeReady = data[index++] == 1;
		accelerating = data[index++] == 1;
		attacking = data[index++] == 1;
		attackFrame = data[index++] == 1;
		beingConstructed = data[index++] == 1;
		beingGathered = data[index++] == 1;
		beingHealed = data[index++] == 1;
		blind = data[index++] == 1;
		braking = data[index++] == 1;
		burrowed = data[index++] == 1;
		carryingGas = data[index++] == 1;
		carryingMinerals = data[index++] == 1;
		cloaked = data[index++] == 1;
		completed = data[index++] == 1;
		constructing = data[index++] == 1;
		defenseMatrixed = data[index++] == 1;
		detected = data[index++] == 1;
		ensnared = data[index++] == 1;
		following = data[index++] == 1;
		gatheringGas = data[index++] == 1;
		gatheringMinerals = data[index++] == 1;
		hallucination = data[index++] == 1;
		holdingPosition = data[index++] == 1;
		idle = data[index++] == 1;
		interruptable = data[index++] == 1;
		invincible = data[index++] == 1;
		irradiated = data[index++] == 1;
		lifted = data[index++] == 1;
		loaded = data[index++] == 1;
		lockedDown = data[index++] == 1;
		maelstrommed = data[index++] == 1;
		morphing = data[index++] == 1;
		moving = data[index++] == 1;
		parasited = data[index++] == 1;
		patrolling = data[index++] == 1;
		plagued = data[index++] == 1;
		repairing = data[index++] == 1;
		selected = data[index++] == 1;
		sieged = data[index++] == 1;
		startingAttack = data[index++] == 1;
		stasised = data[index++] == 1;
		stimmed = data[index++] == 1;
		stuck = data[index++] == 1;
		training = data[index++] == 1;
		underAttack = data[index++] == 1;
		underDarkSwarm = data[index++] == 1;
		underDisruptionWeb = data[index++] == 1;
		underStorm = data[index++] == 1;
		unpowered = data[index++] == 1;
		upgrading = data[index++] == 1;
		visible = data[index++] == 1;
	}
	
	@Override
	public Unit clone() {
		/*
		 * Safe to use clone for this class because it has only primitive fields and a reference to
		 * BWAPI, which should be shallow-copied. Beware when using equals or == with cloned Units
		 * as they will be considered equal (and not ==) regardless of any changes in their
		 * properties over time.
		 */
		try {
			return (Unit) super.clone();
		} catch (CloneNotSupportedException e) {
			// Should never happen, as this implements Cloneable and extends Object
			e.printStackTrace();
			return null;
		}
	}
	
	public Position getPosition() {
		return new Position(x, y);
	}
	
	/** Returns the edge-to-edge distance between the current unit and the target unit. */
	public double getDistance(Unit target) {
		if (!isExists() || target == null || !target.isExists())
			return Integer.MAX_VALUE;
		
		if (this == target)
			return 0;
		
		int xDist = getLeft() - (target.getRight() + 1);
		if (xDist < 0) {
			xDist = target.getLeft() - (getRight() + 1);
			if (xDist < 0) {
				xDist = 0;
			}
		}
		int yDist = getTop() - (target.getBottom() + 1);
		if (yDist < 0) {
			yDist = target.getTop() - (getBottom() + 1);
			if (yDist < 0) {
				yDist = 0;
			}
		}
		return new Position(0, 0).getPDistance(new Position(xDist, yDist));
	}
	
	/** Returns the distance from the edge of the current unit to the target position. */
	public double getDistance(Position target) {
		if (!isExists())
			return Integer.MAX_VALUE;
		int xDist = getLeft() - (target.getPX() + 1);
		if (xDist < 0) {
			xDist = target.getPX() - (getRight() + 1);
			if (xDist < 0) {
				xDist = 0;
			}
		}
		int yDist = getTop() - (target.getPY() + 1);
		if (yDist < 0) {
			yDist = target.getPY() - (getBottom() + 1);
			if (yDist < 0) {
				yDist = 0;
			}
		}
		return new Position(0, 0).getPDistance(new Position(xDist, yDist));
	}
	
	public Position getTopLeft() {
		return new Position(getLeft(), getTop());
	}
	
	public Position getBottomRight() {
		return new Position(getRight(), getBottom());
	}
	
	public int getLeft() {
		return x - getType().getDimensionLeft();
	}
	
	public int getTop() {
		return y - getType().getDimensionUp();
	}
	
	public int getRight() {
		return x + getType().getDimensionRight();
	}
	
	public int getBottom() {
		return y + getType().getDimensionDown();
	}
	
	// ------------------------------ FIELD ACCESSOR METHODS ------------------------------ //
	
	public int getID() {
		return ID;
	}
	
	public int getReplayID() {
		return replayID;
	}
	
	@Deprecated
	public int getPlayerID() {
		return playerID;
	}
	
	public Player getPlayer() {
		return iDLookup.getPlayer(playerID);
	}
	
	@Deprecated
	public int getTypeID() {
		return typeID;
	}
	
	public UnitType getType() {
		return UnitTypes.getUnitType(typeID);
	}
	
	/** @deprecated use {@link #getPosition()} */
	public int getX() {
		return x;
	}
	
	/** @deprecated use {@link #getPosition()} */
	public int getY() {
		return y;
	}
	
	/** @deprecated use {@link #getPosition()} */
	public int getTileX() {
		return tileX;
	}
	
	/** @deprecated use {@link #getPosition()} */
	public int getTileY() {
		return tileY;
	}
	
	public double getAngle() {
		return angle;
	}
	
	public double getVelocityX() {
		return velocityX;
	}
	
	public double getVelocityY() {
		return velocityY;
	}
	
	public int getHitPoints() {
		return hitPoints;
	}
	
	public int getShields() {
		return shield;
	}
	
	public int getEnergy() {
		return energy;
	}
	
	public int getResources() {
		return resources;
	}
	
	public int getResourceGroup() {
		return resourceGroup;
	}
	
	public int getLastCommandFrame() {
		return lastCommandFrame;
	}
	
	@Deprecated
	public int getLastCommandID() {
		return lastCommandID;
	}
	
	public UnitCommandType getLastCommand() {
		return UnitCommandTypes.getUnitCommandType(lastCommandID);
	}
	
	@Deprecated
	public int getLastAttackingPlayerID() {
		return lastAttackingPlayerID;
	}
	
	public Player getLastAttackingPlayer() {
		return iDLookup.getPlayer(lastAttackingPlayerID);
	}
	
	@Deprecated
	public int getInitialTypeID() {
		return initialTypeID;
	}
	
	public UnitType getInitialType() {
		return UnitTypes.getUnitType(initialTypeID);
	}
	
	/** @deprecated use {@link #getInitialPosition()} */
	public int getInitialX() {
		return initialX;
	}
	
	/** @deprecated use {@link #getInitialPosition()} */
	public int getInitialY() {
		return initialY;
	}
	
	/** @deprecated use {@link #getInitialPosition()} */
	public int getInitialTileX() {
		return initialTileX;
	}
	
	/** @deprecated use {@link #getInitialPosition()} */
	public int getInitialTileY() {
		return initialTileY;
	}
	
	public Position getInitialPosition() {
		return new Position(initialX, initialY);
	}
	
	public int getInitialHitPoints() {
		return initialHitPoints;
	}
	
	public int getInitialResources() {
		return initialResources;
	}
	
	public int getKillCount() {
		return killCount;
	}
	
	public int getAcidSporeCount() {
		return acidSporeCount;
	}
	
	/** @see #getInterceptors() TODO */
	public int getInterceptorCount() {
		return interceptorCount;
	}
	
	public int getScarabCount() {
		return scarabCount;
	}
	
	public int getSpiderMineCount() {
		return spiderMineCount;
	}
	
	public int getGroundWeaponCooldown() {
		return groundWeaponCooldown;
	}
	
	public int getAirWeaponCooldown() {
		return airWeaponCooldown;
	}
	
	public int getSpellCooldown() {
		return spellCooldown;
	}
	
	public int getDefenseMatrixPoints() {
		return defenseMatrixPoints;
	}
	
	public int getDefenseMatrixTimer() {
		return defenseMatrixTimer;
	}
	
	public int getEnsnareTimer() {
		return ensnareTimer;
	}
	
	public int getIrradiateTimer() {
		return irradiateTimer;
	}
	
	public int getLockdownTimer() {
		return lockdownTimer;
	}
	
	public int getMaelstromTimer() {
		return maelstromTimer;
	}
	
	public int getOrderTimer() {
		return orderTimer;
	}
	
	public int getPlagueTimer() {
		return plagueTimer;
	}
	
	public int getRemoveTimer() {
		return removeTimer;
	}
	
	public int getStasisTimer() {
		return stasisTimer;
	}
	
	public int getStimTimer() {
		return stimTimer;
	}
	
	@Deprecated
	public int getBuildTypeID() {
		return buildTypeID;
	}
	
	public UnitType getBuildType() {
		return UnitTypes.getUnitType(buildTypeID);
	}
	
	public int getTrainingQueueSize() {
		return trainingQueueSize;
	}
	
	@Deprecated
	public int getResearchingTechID() {
		return researchingTechID;
	}
	
	public TechType getTech() {
		return TechTypes.getTechType(researchingTechID);
	}
	
	@Deprecated
	public int getUpgradingUpgradeID() {
		return upgradingUpgradeID;
	}
	
	public UpgradeType getUpgrade() {
		return UpgradeTypes.getUpgradeType(upgradingUpgradeID);
	}
	
	public int getRemainingBuildTimer() {
		return remainingBuildTimer;
	}
	
	public int getRemainingTrainTime() {
		return remainingTrainTime;
	}
	
	public int getRemainingResearchTime() {
		return remainingResearchTime;
	}
	
	public int getRemainingUpgradeTime() {
		return remainingUpgradeTime;
	}
	
	@Deprecated
	public int getBuildUnitID() {
		return buildUnitID;
	}
	
	public Unit getBuildUnit() {
		return iDLookup.getUnit(buildUnitID);
	}
	
	@Deprecated
	public int getTargetUnitID() {
		return targetUnitID;
	}
	
	public Unit getTarget() {
		return iDLookup.getUnit(targetUnitID);
	}
	
	@Deprecated
	public int getTargetX() {
		return targetX;
	}
	
	@Deprecated
	public int getTargetY() {
		return targetY;
	}
	
	public Position getTargetPosition() {
		return new Position(targetX, targetY);
	}
	
	@Deprecated
	public int getOrderID() {
		return orderID;
	}
	
	public OrderType getOrder() {
		return OrderTypes.getOrderType(orderID);
	}
	
	@Deprecated
	public int getOrderTargetUnitID() {
		return orderTargetID;
	}
	
	public Unit getOrderTarget() {
		return iDLookup.getUnit(orderTargetID);
	}
	
	@Deprecated
	public int getSecondaryOrderID() {
		return secondaryOrderID;
	}
	
	public OrderType getSecondaryOrder() {
		return OrderTypes.getOrderType(secondaryOrderID);
	}
	
	@Deprecated
	public int getRallyX() {
		return rallyX;
	}
	
	@Deprecated
	public int getRallyY() {
		return rallyY;
	}
	
	public Position getRallyPosition() {
		return new Position(rallyX, rallyY);
	}
	
	@Deprecated
	public int getRallyUnitID() {
		return rallyUnitID;
	}
	
	public Unit getRallyUnit() {
		return iDLookup.getUnit(rallyUnitID);
	}
	
	@Deprecated
	public int getAddOnUnitID() {
		return addOnID;
	}
	
	public Unit getAddon() {
		return iDLookup.getUnit(addOnID);
	}
	
	@Deprecated
	public int getNydusExitUnitID() {
		return nydusExitUnitID;
	}
	
	public Unit getNydusExit() {
		return iDLookup.getUnit(nydusExitUnitID);
	}
	
	@Deprecated
	public int getTransportUnitID() {
		return transportID;
	}
	
	public Unit getTransport() {
		return iDLookup.getUnit(transportID);
	}
	
	/** TODO @see #getLoadedUnits() */
	public int getLoadedUnitsCount() {
		return loadedUnitsCount;
	}
	
	@Deprecated
	public int getCarrierUnitID() {
		return carrierUnitID;
	}
	
	public Unit getCarrier() {
		return iDLookup.getUnit(carrierUnitID);
	}
	
	@Deprecated
	public int getHatcheryUnitID() {
		return hatcheryUnitID;
	}
	
	public Unit getHatchery() {
		return iDLookup.getUnit(hatcheryUnitID);
	}
	
	/** TODO @see #getLarva() */
	public int getLarvaCount() {
		return larvaCount;
	}
	
	@Deprecated
	public int getPowerUpUnitID() {
		return powerUpUnitID;
	}
	
	public Unit getPowerUp() {
		return iDLookup.getUnit(powerUpUnitID);
	}
	
	public boolean isExists() {
		return exists;
	}
	
	public boolean isNukeReady() {
		return nukeReady;
	}
	
	public boolean isAccelerating() {
		return accelerating;
	}
	
	public boolean isAttacking() {
		return attacking;
	}
	
	public boolean isAttackFrame() {
		return attackFrame;
	}
	
	public boolean isBeingConstructed() {
		return beingConstructed;
	}
	
	public boolean isBeingGathered() {
		return beingGathered;
	}
	
	public boolean isBeingHealed() {
		return beingHealed;
	}
	
	public boolean isBlind() {
		return blind;
	}
	
	public boolean isBraking() {
		return braking;
	}
	
	public boolean isBurrowed() {
		return burrowed;
	}
	
	public boolean isCarryingGas() {
		return carryingGas;
	}
	
	public boolean isCarryingMinerals() {
		return carryingMinerals;
	}
	
	public boolean isCloaked() {
		return cloaked;
	}
	
	public boolean isCompleted() {
		return completed;
	}
	
	public boolean isConstructing() {
		return constructing;
	}
	
	public boolean isDefenseMatrixed() {
		return defenseMatrixed;
	}
	
	public boolean isDetected() {
		return detected;
	}
	
	public boolean isEnsnared() {
		return ensnared;
	}
	
	public boolean isFollowing() {
		return following;
	}
	
	public boolean isGatheringGas() {
		return gatheringGas;
	}
	
	public boolean isGatheringMinerals() {
		return gatheringMinerals;
	}
	
	public boolean isHallucination() {
		return hallucination;
	}
	
	public boolean isHoldingPosition() {
		return holdingPosition;
	}
	
	public boolean isIdle() {
		return idle;
	}
	
	public boolean isInterruptable() {
		return interruptable;
	}
	
	public boolean isInvincible() {
		return invincible;
	}
	
	public boolean isIrradiated() {
		return irradiated;
	}
	
	public boolean isLifted() {
		return lifted;
	}
	
	public boolean isLoaded() {
		return loaded;
	}
	
	public boolean isLockedDown() {
		return lockedDown;
	}
	
	public boolean isMaelstrommed() {
		return maelstrommed;
	}
	
	public boolean isMorphing() {
		return morphing;
	}
	
	public boolean isMoving() {
		return moving;
	}
	
	public boolean isParasited() {
		return parasited;
	}
	
	public boolean isPatrolling() {
		return patrolling;
	}
	
	public boolean isPlagued() {
		return plagued;
	}
	
	public boolean isRepairing() {
		return repairing;
	}
	
	public boolean isSelected() {
		return selected;
	}
	
	public boolean isSieged() {
		return sieged;
	}
	
	public boolean isStartingAttack() {
		return startingAttack;
	}
	
	public boolean isStasised() {
		return stasised;
	}
	
	public boolean isStimmed() {
		return stimmed;
	}
	
	public boolean isStuck() {
		return stuck;
	}
	
	public boolean isTraining() {
		return training;
	}
	
	public boolean isUnderAttack() {
		return underAttack;
	}
	
	public boolean isUnderDarkSwarm() {
		return underDarkSwarm;
	}
	
	public boolean isUnderDisruptionWeb() {
		return underDisruptionWeb;
	}
	
	public boolean isUnderStorm() {
		return underStorm;
	}
	
	public boolean isUnpowered() {
		return unpowered;
	}
	
	public boolean isUpgrading() {
		return upgrading;
	}
	
	public boolean isVisible() {
		return visible;
	}
	
	// ------------------------------ UNIT COMMANDS ------------------------------ //
	public boolean attack(Position p) {
		return cmds.attack(ID, p.getPX(), p.getPY());
	}
	
	public boolean attack(Unit target) {
		return cmds.attack(ID, target.getID());
	}
	
	public boolean build(Position p, UnitType type) {
		return cmds.build(ID, p.getBX(), p.getBY(), type.getID());
	}
	
	public boolean buildAddon(UnitType type) {
		return cmds.buildAddon(ID, type.getID());
	}
	
	public boolean train(UnitType type) {
		return cmds.train(ID, type.getID());
	}
	
	public boolean morph(UnitType type) {
		return cmds.morph(ID, type.getID());
	}
	
	public boolean research(TechType tech) {
		return cmds.research(ID, tech.getID());
	}
	
	public boolean upgrade(UpgradeType upgrade) {
		return cmds.upgrade(ID, upgrade.getID());
	}
	
	public boolean setRallyPoint(Position p) {
		return cmds.setRallyPoint(ID, p.getPX(), p.getPY());
	}
	
	public boolean setRallyPoint(Unit target) {
		return cmds.setRallyPoint(ID, target.getID());
	}
	
	public boolean move(Position p) {
		return cmds.move(ID, p.getPX(), p.getPY());
	}
	
	public boolean patrol(Position p) {
		return cmds.patrol(ID, p.getPX(), p.getPY());
	}
	
	public boolean holdPosition() {
		return cmds.holdPosition(ID);
	}
	
	public boolean stop() {
		return cmds.stop(ID);
	}
	
	public boolean follow(Unit target) {
		return cmds.follow(ID, target.getID());
	}
	
	public boolean gather(Unit target) {
		return cmds.gather(ID, target.getID());
	}
	
	public boolean returnCargo() {
		return cmds.returnCargo(ID);
	}
	
	public boolean repair(Unit target) {
		return cmds.repair(ID, target.getID());
	}
	
	public boolean burrow() {
		return cmds.burrow(ID);
	}
	
	public boolean unburrow() {
		return cmds.unburrow(ID);
	}
	
	public boolean cloak() {
		return cmds.cloak(ID);
	}
	
	public boolean decloak() {
		return cmds.decloak(ID);
	}
	
	public boolean siege() {
		return cmds.siege(ID);
	}
	
	public boolean unsiege() {
		return cmds.unsiege(ID);
	}
	
	public boolean lift() {
		return cmds.lift(ID);
	}
	
	public boolean land(Position p) {
		return cmds.land(ID, p.getBX(), p.getBY());
	}
	
	public boolean load(Unit target) {
		return cmds.load(ID, target.getID());
	}
	
	public boolean unload(Unit target) {
		return cmds.unload(ID, target.getID());
	}
	
	public boolean unloadAll() {
		return cmds.unloadAll(ID);
	}
	
	public boolean unloadAll(Position p) {
		return cmds.unloadAll(ID, p.getPX(), p.getPY());
	}
	
	public boolean rightClick(Position p) {
		return cmds.rightClick(ID, p.getPX(), p.getPY());
	}
	
	public boolean rightClick(Unit target) {
		return cmds.rightClick(ID, target.getID());
	}
	
	public boolean haltConstruction() {
		return cmds.haltConstruction(ID);
	}
	
	public boolean cancelConstruction() {
		return cmds.cancelConstruction(ID);
	}
	
	public boolean cancelAddon() {
		return cmds.cancelAddon(ID);
	}
	
	public boolean cancelTrain(int slot) {
		return cmds.cancelTrain(ID, slot);
	}
	
	/** Remove the last unit from the training queue. */
	public boolean cancelTrain() {
		return cmds.cancelTrain(ID, -2);
	}
	
	public boolean cancelMorph() {
		return cmds.cancelMorph(ID);
	}
	
	public boolean cancelResearch() {
		return cmds.cancelResearch(ID);
	}
	
	public boolean cancelUpgrade() {
		return cmds.cancelUpgrade(ID);
	}
	
	public boolean useTech(TechType tech) {
		return cmds.useTech(ID, tech.getID());
	}
	
	public boolean useTech(TechType tech, Position p) {
		return cmds.useTech(ID, tech.getID(), p.getPX(), p.getPY());
	}
	
	public boolean useTech(TechType tech, Unit target) {
		return cmds.useTech(ID, tech.getID(), target.getID());
	}
	
	public boolean placeCOP(Position p) {
		return cmds.placeCOP(ID, p.getBX(), p.getBY());
	}
	
	// ------------------------------ HASHCODE & EQUALS ------------------------------ //
	
	@Override
	public int hashCode() {
		return ID;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Unit other = (Unit) obj;
		if (ID != other.ID)
			return false;
		return true;
	}
}
