from utils.ticket_state import TicketState

def orchestrator_agent(state: TicketState) -> TicketState:
    state.history.append(f"Orchestrator: Current status -> {state.status}")

    if state.status == "created":
        state.status = "planning"
    elif state.status == "planning":
        state.status = "resolving"
    elif state.status == "resolving":
        # Simulamos que se resolvió en esta iteración
        state.status = "resolved"
    elif state.status == "resolved":
        state.history.append("Ticket is resolved.")
    else:
        state.history.append(f"Unknown state: {state.status}")

    return state
