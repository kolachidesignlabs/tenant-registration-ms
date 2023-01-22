INSERT INTO public.subscription_plans
    (subscription_plan_id, active, description, tittle)
VALUES (1, true, 'Pooled Infrastructure', 'Basic Plan');
INSERT INTO public.subscription_plans
    (subscription_plan_id, active, description, tittle)
VALUES (2, true, 'Pooled Infrastructure with Siloed Database', 'Standard Plan');
INSERT INTO public.subscription_plans
    (subscription_plan_id, active, description, tittle)
VALUES (3, true, 'Siloed Infrastructure', 'Advance Plan');

INSERT INTO public.company_statuses
(company_status_id, company_status)
VALUES (1, 'Draft');
INSERT INTO public.company_statuses
(company_status_id, company_status)
VALUES (2, 'Live');
INSERT INTO public.company_statuses
(company_status_id, company_status)
VALUES (3, 'Suspended');
INSERT INTO public.company_statuses
    (company_status_id, company_status)
VALUES (4, 'Archived');

INSERT INTO public.user_roles
    (user_role_id, user_role)
VALUES (1, 'Admin');

INSERT INTO public.user_types
(user_type_id, user_type)
VALUES (1, 'Tenant');
INSERT INTO public.user_types
    (user_type_id, user_type)
VALUES (2, 'Administration');

