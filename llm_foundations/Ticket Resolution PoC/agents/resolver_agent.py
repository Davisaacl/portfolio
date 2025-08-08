from utils.ticket_state import TicketState

def resolver_agent(state: TicketState) -> TicketState:
    state.history.append("Resolver: Diagnostic in progress...")

    # Simulamos análisis
    issue_type = state.context.get("issue_type", "network")  # por ahora simulamos tipo de problema
    resolution_steps = []

    if issue_type == "network":
        resolution_steps.append("Restarted network interface.")
        resolution_steps.append("Checked DNS configuration.")
    elif issue_type == "hardware":
        resolution_steps.append("Ran hardware diagnostics.")
        resolution_steps.append("Replaced faulty component.")
    else:
        resolution_steps.append("Standard troubleshooting.")

    state.context["resolution"] = resolution_steps
    state.status = "resolved"
    state.history.append(f"Resolver: Ticket resolved with steps: {resolution_steps}")

    return state
