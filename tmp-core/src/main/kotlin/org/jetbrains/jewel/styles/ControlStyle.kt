package org.jetbrains.jewel.styles

class ControlStyle<TState, TAppearance>(
    configure: ControlStyleBuilder<TState, TAppearance>.() -> Unit
) : Map<TState, TAppearance> by ControlStyleBuilder<TState, TAppearance>().build(configure) {

    fun appearance(state: TState) = get(state)

    class ControlStyleBuilder<TState, TAppearance> {

        private val states = mutableMapOf<TState, TAppearance>()

        fun state(state: TState, appearance: TAppearance) {
            require(state !in states) { "State '$state' has already been registered" }
            states[state] = appearance
        }

        fun build(configure: ControlStyleBuilder<TState, TAppearance>.() -> Unit): Map<TState, TAppearance> {
            configure()
            return states
        }
    }
}
