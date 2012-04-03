package net.ripe.commons.ip.resource;

public final class Constants {

    public static final int IPv4_BYTE_MASK = 0xff;
    public static final int IPv4_NUMBER_OF_BITS = 32;

    public static final long IPv4_MINIMUM_VALUE = 0;
    public static final long IPv4_MAXIMUM_VALUE = (1L << IPv4_NUMBER_OF_BITS) - 1;

    public static final Ipv4 FIRST_IPv4_ADDRESS = Ipv4.of(IPv4_MINIMUM_VALUE);
    public static final Ipv4 LAST_IPv4_ADDRESS = Ipv4.of(IPv4_MAXIMUM_VALUE);

}
