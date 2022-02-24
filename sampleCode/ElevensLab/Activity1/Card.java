// package sampleCode.ElevensLab.Activity1;


/**
 * Card.java
 *
 * <code>Card</code> represents a playing card.
 */
public class Card {

	/**
	 * String value that holds the suit of the card
	 */
	private String suit;

	/**
	 * String value that holds the rank of the card
	 */
	private String rank;

	/**
	 * int value that holds the point value.
	 */
	private int pointValue;

	/**
	 * Sets this <code>Card's</code> suit.
	 * @param s the new suit 
	 */
	public void setSuit(String s) {
	 /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
	}

	/**
	 * Sets this <code>Card's</code> rank.
	 * @param r the new rank 
	 */
	public void setRank(String r) {
	 /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
	}

	/**
	 * Sets this <code>Card's</code> point value.
	 * @param pv the new point value
	 */
	public void setPointValue(int pv) {
	 /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
	}

	/**
	 * Accesses this <code>Card's</code> suit.
	 * @return this <code>Card's</code> suit.
	 */
	public String getSuit() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
	}

	/**
	 * Accesses this <code>Card's</code> rank.
	 * @return this <code>Card's</code> rank.
	 */
	public String getRank() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
	}

	/**
	 * Accesses this <code>Card's</code> point value.
	 * @return this <code>Card's</code> point value.
	 */
	public int getPointValue() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
	}

	/** Compare this card with the argument.
	 * @param otherCard the other card to compare to this
	 * @return true if the rank, suit, and point value of this card
	 *              are equal to those of the argument;
	 *         false otherwise.
	 */
	public boolean matches(Card otherCard) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
	}

	/**
	 * Converts the rank, suit, and point value into a string in the format
	 *     "[Rank] of [Suit] (point value = [PointValue])".
	 * This provides a useful way of printing the contents
	 * of a <code>Deck</code> in an easily readable format or performing
	 * other similar functions.
	 *
	 * @return a <code>String</code> containing the rank, suit,
	 *         and point value of the card.
	 */
	@Override
	public String toString() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
	}
}
