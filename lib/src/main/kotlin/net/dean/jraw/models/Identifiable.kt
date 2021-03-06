package net.dean.jraw.models

interface Identifiable {
    /**
     * The full name of the model. Essentially equivalent to joining the kind prefix (e.g. "t1" for comments) with
     * [id]. For example, a comment with an ID of "abc123" would have a full name of "t1_abc123"
     */
    val fullName: String

    /** The unique base 36 identifier given to this model by reddit */
    val id: String
}
